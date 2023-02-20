package fr.epsi.projetkotlin

import android.os.Bundle

class HomeActivity : MainActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        setHeaderTxt("Epsi")
    }
}