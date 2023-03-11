package fr.epsi.projetkotlin

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class ProductsAdapter(val context: Context, val produits: ArrayList<Produits>) :
    RecyclerView.Adapter<ProductsAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val infoProduitsBlock = view.findViewById<LinearLayout>(R.id.infoProduitBlock)
        val imageViewProduit = view.findViewById<ImageView>(R.id.imgProduct)
        val textViewproductName = view.findViewById<TextView>(R.id.productName)
        val textViewproductDescription = view.findViewById<TextView>(R.id.productDescription)
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.cell_produits, viewGroup, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val produit = produits.get(position)
        holder.textViewproductName.text = produit.name
        Picasso.get().load(produit.picture_url).into(holder.imageViewProduit)
        holder.textViewproductDescription.text = produit.description
        holder.infoProduitsBlock.setOnClickListener(View.OnClickListener {
            val intent = Intent(context, DetailProductActivity::class.java)
            intent.putExtra("name", produit.name)
            intent.putExtra("description", produit.description)
            intent.putExtra("picture_url", produit.picture_url)
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            context.startActivity(intent)
        })
    }

    override fun getItemCount(): Int {
        return produits.size
    }
}