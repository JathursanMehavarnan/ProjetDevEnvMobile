package fr.epsi.projetkotlin

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import okhttp3.*
import org.json.JSONObject
import java.io.IOException

class CategoryActivity : MainActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_category)
        setHeaderTxt("Rayons")
        showBack()

        val categories = arrayListOf<Category>()

        val recyclerviewCategorie = findViewById<RecyclerView>(R.id.recyclerviewProduit)
        recyclerviewCategorie.layoutManager = LinearLayoutManager(this)
        val categoriesAdapter = CategoryAdapter(application, categories)
        recyclerviewCategorie.adapter = categoriesAdapter

        val okHttpClient: OkHttpClient = OkHttpClient.Builder().build()
        val mRequestUrl = "https://www.ugarit.online/epsi/categories.json"
        val request =
            Request.Builder().url(mRequestUrl).cacheControl(CacheControl.FORCE_NETWORK).build()

        okHttpClient.newCall(request).enqueue(object : Callback {
            override fun onResponse(call: Call, response: Response) {
                val data = response.body?.string()
                if (data != null) {
                    val jsCategories = JSONObject(data)
                    val jsArrayCategorie = jsCategories.getJSONArray("items")

                    for (i in 0 until jsArrayCategorie.length()) {
                        val jsCategorie = jsArrayCategorie.getJSONObject(i)
                        val categorie = Category(
                            jsCategorie.optString("category_id", "Not found"),
                            jsCategorie.optString("title", "Not found"),
                            jsCategorie.optString("products_url", "Not found")
                        )
                        categories.add(categorie)
                    }
                    runOnUiThread(Runnable {
                        categoriesAdapter.notifyDataSetChanged()
                    })

                    Log.e("WS", data)
                }
            }

            override fun onFailure(call: Call, e: IOException) {
                runOnUiThread(Runnable {
                    Toast.makeText(application, e.message, Toast.LENGTH_SHORT).show()
                })
            }

        })
    }
}