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

        setHeaderTxt("Epsi")

        buttonInfo.setOnClickListener(View.OnClickListener {
            startGroupInfosActivity(getString(R.string.home_info))
        })
    }

    private fun startGroupInfosActivity(title: String) {
        val intent = Intent(application, GroupInfosActivity::class.java)
        intent.putExtra("title", title)
        startActivity(intent)
    }
}