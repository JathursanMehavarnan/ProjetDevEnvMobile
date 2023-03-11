package fr.epsi.projetkotlin

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.squareup.picasso.Picasso

class DetailProductActivity : MainActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_produit)

        setHeaderTxt(intent.extras!!.getString("name", ""))
        showBack()

        val imgProduct = findViewById<ImageView>(R.id.imgProduct)
        val descriptionProduit = findViewById<TextView>(R.id.descriptionProduit)

        Picasso.get().load(intent.extras!!.getString("picture_url", "")).into(imgProduct)
        descriptionProduit.text = intent.extras!!.getString("description", "")
    }
}