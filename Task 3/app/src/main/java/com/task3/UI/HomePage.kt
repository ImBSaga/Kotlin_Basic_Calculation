package com.task3.UI

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.task3.Model.Login
import com.task3.R
import kotlinx.android.synthetic.main.activity_home_page.*

class HomePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)

        val getLogin = intent.getParcelableExtra<Login>("Login")

        tv_username.text = getLogin?.username

        btn_Fisika.setOnClickListener(){
            val intent = Intent(this, HitungFisika::class.java)
            startActivity(intent)
        }

        btn_Konversi.setOnClickListener(){
            val intent = Intent(this, KonversiNilai::class.java)
            startActivity(intent)
        }
    }
}