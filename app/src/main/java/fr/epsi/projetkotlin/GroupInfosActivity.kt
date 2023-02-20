package fr.epsi.projetkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class GroupInfosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_group_infos)
        showBack()
        val buttonStudent1 = findViewById<Button>(R.id.buttonStudent1)
        val buttonStudent2 = findViewById<Button>(R.id.buttonStudent3)
        val buttonStudent3 = findViewById<Button>(R.id.buttonStudent3)
    }
}