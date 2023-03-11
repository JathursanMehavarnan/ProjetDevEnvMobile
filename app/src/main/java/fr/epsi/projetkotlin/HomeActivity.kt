package fr.epsi.projetkotlin

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button

class HomeActivity : MainActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        val buttonInfo = findViewById<Button>(R.id.buttonInfo)
        val buttonProduits = findViewById<Button>(R.id.buttonProduits)

        setHeaderTxt("Epsi")

        buttonInfo.setOnClickListener(View.OnClickListener {
            val intent = Intent(application, GroupInfosActivity::class.java)
            startActivity(intent)
        })

        buttonProduits.setOnClickListener(View.OnClickListener {
            val intent = Intent(application, CategoryActivity::class.java)
            startActivity(intent)
        })

    }
}