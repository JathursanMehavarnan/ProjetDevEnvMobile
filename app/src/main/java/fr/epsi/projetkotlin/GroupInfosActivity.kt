package fr.epsi.projetkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

/*class GroupInfosActivity : MainActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_group_infos)

        val buttonStudent1 = findViewById<Button>(R.id.buttonStudent1)
        val buttonStudent2 = findViewById<Button>(R.id.buttonStudent2)
        val buttonStudent3 = findViewById<Button>(R.id.buttonStudent3)

        if(intent.extras!=null){
            val title=intent.extras!!.getString("title","Epsi")
            setHeaderTxt(title)
        }

        showBack()

        buttonStudent1.setOnClickListener(View.OnClickListener {
            val intent = Intent(application, StudentActivity::class.java)
            startActivity(intent)
        })

        *//*buttonStudent2.setOnClickListener(View.OnClickListener {
            val intent = Intent(application, StudentActivity::class.java)
            startActivity(intent)
        })

        buttonStudent3.setOnClickListener(View.OnClickListener {
            val intent = Intent(application, StudentActivity::class.java)
            startActivity(intent)
        })*//*
    }
}*/

class GroupInfosActivity : MainActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_group_infos)

        val buttonStudent1 = findViewById<Button>(R.id.buttonStudent1)
        val buttonStudent2 = findViewById<Button>(R.id.buttonStudent2)
        val buttonStudent3 = findViewById<Button>(R.id.buttonStudent3)

        setHeaderTxt("Infos")
        showBack()

        buttonStudent1.setOnClickListener(View.OnClickListener {
            val intent = Intent(application, StudentActivity::class.java)
            intent.putExtra("setNameBtn", "Barral")
            startActivity(intent)
        })
        buttonStudent2.setOnClickListener(View.OnClickListener {
            val intent = Intent(application, StudentActivity::class.java)
            intent.putExtra("setNameBtn", "Rouchaud")
            startActivity(intent)
        })
        buttonStudent3.setOnClickListener(View.OnClickListener {
            val intent = Intent(application, StudentActivity::class.java)
            intent.putExtra("setNameBtn", "Mehavarnan")
            startActivity(intent)
        })
    }
}