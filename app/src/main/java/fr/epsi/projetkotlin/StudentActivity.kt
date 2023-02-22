package fr.epsi.projetkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class StudentActivity : MainActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student)

        if(intent.extras!=null){
            val title=intent.extras!!.getString("title","Nom")
            setHeaderTxt(title)
        }

        showBack()
    }
}