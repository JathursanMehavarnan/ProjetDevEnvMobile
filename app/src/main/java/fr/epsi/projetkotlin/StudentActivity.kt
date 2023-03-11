package fr.epsi.projetkotlin

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.drawable.Drawable
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.squareup.picasso.Picasso

class StudentActivity : MainActivity() {
    @SuppressLint("SetTextI18n", "UseCompatLoadingForDrawables")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student)
        showBack()

        val setNameBtn = intent.extras!!.getString("setNameBtn", "")
        setHeaderTxt(setNameBtn)

        val name = findViewById<TextView>(R.id.nameStudent)
        val mail = findViewById<TextView>(R.id.mailStudent)
        val avatar = findViewById<ImageView>(R.id.imageView)

        if (setNameBtn == "Rouchaud"){
            name.text = "Rouchaud Paul"
            mail.text = "paul.rouchaud@epsi.fr"
            avatar.setImageDrawable(getResources().getDrawable(R.drawable.paul))

        }

        if (setNameBtn == "Mehavarnan"){
            name.text = "Jathursan Mehavarnan"
            mail.text = "j.mehavarnan@epsi.fr"
            mail.text = "j.mehavarnan@epsi.fr"
            avatar.setImageDrawable(getResources().getDrawable(R.drawable.jathur))

        }

        val urlProfile = findViewById<TextView>(R.id.urlProfile)
        urlProfile.setOnClickListener(View.OnClickListener {
            val url = "https://www.epsi.fr/"
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(url)
            startActivity(intent)
        })

    }
}