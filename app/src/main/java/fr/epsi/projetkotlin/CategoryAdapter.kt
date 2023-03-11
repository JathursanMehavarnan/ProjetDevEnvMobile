package fr.epsi.projetkotlin

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView

class CategoryAdapter(val context: Context, val categories: ArrayList<Category>) :
    RecyclerView.Adapter<CategoryAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val textViewCategorieTitle = view.findViewById<Button>(R.id.productName)
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.cell_category, viewGroup, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val categorie = categories.get(position)
        holder.textViewCategorieTitle.text = categorie.title
        holder.textViewCategorieTitle.setOnClickListener(View.OnClickListener {
            val intent = Intent(context, ProductsActivity::class.java)
            intent.putExtra("title", categorie.title)
            intent.putExtra("product_url", categorie.products_url)
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            context.startActivity(intent)
        })
    }

    override fun getItemCount(): Int {
        return categories.size
    }
}