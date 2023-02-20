package fr.epsi.projetkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class GroupInfosActivity : MainActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_group_infos)
        if(intent.extras!=null){
            val title=intent.extras!!.getString("title","Epsi")
            setHeaderTxt(title)
        }
        showBack()
    }
}