package fr.epsi.projetkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class HomeActivity : MainActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        setHeaderTxt("Epsi")
    }

}