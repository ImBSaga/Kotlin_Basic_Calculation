package com.task3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.task3.Model.Login
import com.task3.UI.HomePage

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val username = "udacodingid"
        val password = "udacodingJaya2021"


        btn_Login.setOnClickListener {

            val login = Login(et_user.text.toString(), et_pass.text.toString())

            if (username == login.username && password == login.password) {
                val intent = Intent(this, HomePage::class.java)
                intent.putExtra("login", login)
                startActivity(intent)

            } else if (login.username.isEmpty() || login.password.isEmpty()) {
                Toast.makeText(this, "Username atau Password Tidak boleh kosong", Toast.LENGTH_SHORT).show()
            }
            else if (login.password.length < 6 ) {
                Toast.makeText(this, "Tidak boleh kurang dari 6 Digit", Toast.LENGTH_SHORT).show()
            }
                else {
                    Toast.makeText(this, "Username atau Password Salah", Toast.LENGTH_SHORT).show()
                }


            }


        }

    }