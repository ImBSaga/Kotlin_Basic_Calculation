package com.task3.UI

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.task3.R
import kotlinx.android.synthetic.main.activity_hitung_fisika.*

class HitungFisika : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hitung_fisika)

        btn_calculateLuas.setOnClickListener(){
            val stLebar  = et_luasLebar.text.toString()
            val stPanjang = et_luasPanjang.text.toString()

            val lebar = stLebar.toDouble()
            val panjang = stPanjang.toDouble()

            val result = lebar * panjang

            val stResult = result.toString()

            tv_luasResult.text = stResult + " m2"
        }

        btn_calculateVolume.setOnClickListener(){
            val stLebar  = et_volumeLebar.text.toString()
            val stPanjang = et_volumePanjang.text.toString()
            val stTinggi = et_volumeTinggi.text.toString()

            val lebar = stLebar.toDouble()
            val panjang = stPanjang.toDouble()
            val tinggi = stTinggi.toDouble()

            val result = lebar * panjang * tinggi

            val stResult = result.toString()

            tv_volumeResult.text = stResult + " m3"
        }
    }
}