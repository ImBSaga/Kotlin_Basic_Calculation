package com.task3.UI

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import com.task3.R
import kotlinx.android.synthetic.main.activity_konversi_nilai.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import org.json.JSONObject
import java.io.InputStream
import java.lang.Exception

class KonversiNilai : AppCompatActivity() {

    var basePanjang = "Millimeter [MM]"
    var konversiPanjang = "Meter [M]"
    var rateKonversi = 0f

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_konversi_nilai)

        spinnerSetup()
        textChanged()

        var result : Double

        btn_convert.setOnClickListener(){

            //Kilometer [KM]
            if (basePanjang.equals("Kilometer [KM]") && konversiPanjang.equals("Millimeter [MM]")){
                var amount = (et_firstNumber.text.toString()).toDouble()
                result = amount * 1000000
                println(result)
                tv_conversionResult.text = result.toString()
            }

            else if (basePanjang.equals("Kilometer [KM]") && konversiPanjang.equals("Centimeter [CM]")){
                var amount = (et_firstNumber.text.toString()).toDouble()
                result = amount * 100000
                println(result)
                tv_conversionResult.text = result.toString()
            }
            else if (basePanjang.equals("Kilometer [KM]") && konversiPanjang.equals("Desimeter [DM]")){
                var amount = (et_firstNumber.text.toString()).toDouble()
                result = amount * 10000
                println(result)
                tv_conversionResult.text = result.toString()
            }
            else if (basePanjang.equals("Kilometer [KM]") && konversiPanjang.equals("Meter [M]")){
                var amount = (et_firstNumber.text.toString()).toDouble()
                result = amount * 1000
                println(result)
                tv_conversionResult.text = result.toString()
            }
            else if (basePanjang.equals("Kilometer [KM]") && konversiPanjang.equals("Dekameter [DAM]")){
                var amount = (et_firstNumber.text.toString()).toDouble()
                result = amount * 100
                println(result)
                tv_conversionResult.text = result.toString()
            }
            else if (basePanjang.equals("Kilometer [KM]") && konversiPanjang.equals("Hektometer [HM]")){
                var amount = (et_firstNumber.text.toString()).toDouble()
                result = amount * 10
                println(result)
                tv_conversionResult.text = result.toString()
            }



            //Hektometer [HM]
            else if (basePanjang.equals("Hektometer [HM]") && konversiPanjang.equals("Millimeter [MM]")){
                var amount = (et_firstNumber.text.toString()).toDouble()
                result = amount * 100000
                println(result)
                tv_conversionResult.text = result.toString()
            }
            else if (basePanjang.equals("Hektometer [HM]") && konversiPanjang.equals("Centimeter [CM]")){
                var amount = (et_firstNumber.text.toString()).toDouble()
                result = amount * 10000
                println(result)
                tv_conversionResult.text = result.toString()
            }
            else if (basePanjang.equals("Hektometer [HM]") && konversiPanjang.equals("Desimeter [DM]")){
                var amount = (et_firstNumber.text.toString()).toDouble()
                result = amount * 1000
                println(result)
                tv_conversionResult.text = result.toString()
            }
            else if (basePanjang.equals("Hektometer [HM]") && konversiPanjang.equals("Meter [M]")){
                var amount = (et_firstNumber.text.toString()).toDouble()
                result = amount * 100
                println(result)
                tv_conversionResult.text = result.toString()
            }
            else if (basePanjang.equals("Hektometer [HM]") && konversiPanjang.equals("Dekameter [DAM]")){
                var amount = (et_firstNumber.text.toString()).toDouble()
                result = amount * 10
                println(result)
                tv_conversionResult.text = result.toString()
            }
            else if (basePanjang.equals("Hektometer [HM]") && konversiPanjang.equals("Kilometer [KM]")){
                var amount = (et_firstNumber.text.toString()).toDouble()
                result = amount * 0.1
                println(result)
                tv_conversionResult.text = result.toString()
            }


            //Dekameter [DAM]
            else if (basePanjang.equals("Dekameter [DAM]") && konversiPanjang.equals("Millimeter [MM]")){
                var amount = (et_firstNumber.text.toString()).toDouble()
                result = amount * 10000
                println(result)
                tv_conversionResult.text = result.toString()
            }
            else if (basePanjang.equals("Dekameter [DAM]") && konversiPanjang.equals("Centimeter [CM]")){
                var amount = (et_firstNumber.text.toString()).toDouble()
                result = amount * 1000
                println(result)
                tv_conversionResult.text = result.toString()
            }
            else if (basePanjang.equals("Dekameter [DAM]") && konversiPanjang.equals("Desimeter [DM]")){
                var amount = (et_firstNumber.text.toString()).toDouble()
                result = amount * 100
                println(result)
                tv_conversionResult.text = result.toString()
            }
            else if (basePanjang.equals("Dekameter [DAM]") && konversiPanjang.equals("Meter [M]")){
                var amount = (et_firstNumber.text.toString()).toDouble()
                result = amount * 10
                println(result)
                tv_conversionResult.text = result.toString()
            }
            else if (basePanjang.equals("Dekameter [DAM]") && konversiPanjang.equals("Hektometer [HM]")){
                var amount = (et_firstNumber.text.toString()).toDouble()
                result = amount * 0.1
                println(result)
                tv_conversionResult.text = result.toString()
            }
            else if (basePanjang.equals("Dekameter [DAM]") && konversiPanjang.equals("Kilometer [KM]")){
                var amount = (et_firstNumber.text.toString()).toDouble()
                result = amount * 0.01
                println(result)
                tv_conversionResult.text = result.toString()
            }



            //Meter [M]
            else if (basePanjang.equals("Meter [M]") && konversiPanjang.equals("Millimeter [MM]")){
                var amount = (et_firstNumber.text.toString()).toDouble()
                result = amount * 1000
                println(result)
                tv_conversionResult.text = result.toString()
            }
            else if (basePanjang.equals("Meter [M]") && konversiPanjang.equals("Centimeter [CM]")){
                var amount = (et_firstNumber.text.toString()).toDouble()
                result = amount * 100
                println(result)
                tv_conversionResult.text = result.toString()
            }
            else if (basePanjang.equals("Meter [M]") && konversiPanjang.equals("Desimeter [DM]")){
                var amount = (et_firstNumber.text.toString()).toDouble()
                result = amount * 10
                println(result)
                tv_conversionResult.text = result.toString()
            }
            else if (basePanjang.equals("Meter [M]") && konversiPanjang.equals("Dekameter [DAM]")){
                var amount = (et_firstNumber.text.toString()).toDouble()
                result = amount * 0.1
                println(result)
                tv_conversionResult.text = result.toString()
            }
            else if (basePanjang.equals("Meter [M]") && konversiPanjang.equals("Hektometer [HM]")){
                var amount = (et_firstNumber.text.toString()).toDouble()
                result = amount * 0.01
                println(result)
                tv_conversionResult.text = result.toString()
            }
            else if (basePanjang.equals("Meter [M]") && konversiPanjang.equals("Kilometer [KM]")){
                var amount = (et_firstNumber.text.toString()).toDouble()
                result = amount * 0.001
                println(result)
                tv_conversionResult.text = result.toString()
            }


            //Desimeter [DM]
            else if (basePanjang.equals("Desimeter [DM]") && konversiPanjang.equals("Millimeter [MM]")){
                var amount = (et_firstNumber.text.toString()).toDouble()
                result = amount * 100
                println(result)
                tv_conversionResult.text = result.toString()
            }
            else if (basePanjang.equals("Desimeter [DM]") && konversiPanjang.equals("Centimeter [CM]")){
                var amount = (et_firstNumber.text.toString()).toDouble()
                result = amount * 10
                println(result)
                tv_conversionResult.text = result.toString()
            }
            else if (basePanjang.equals("Desimeter [DM]") && konversiPanjang.equals("Meter [M]")){
                var amount = (et_firstNumber.text.toString()).toDouble()
                result = amount * 0.1
                println(result)
                tv_conversionResult.text = result.toString()
            }
            else if (basePanjang.equals("Desimeter [DM]") && konversiPanjang.equals("Dekameter [DAM]")){
                var amount = (et_firstNumber.text.toString()).toDouble()
                result = amount * 0.01
                println(result)
                tv_conversionResult.text = result.toString()
            }
            else if (basePanjang.equals("Desimeter [DM]") && konversiPanjang.equals("Hektometer [HM]")){
                var amount = (et_firstNumber.text.toString()).toDouble()
                result = amount * 0.001
                println(result)
                tv_conversionResult.text = result.toString()
            }
            else if (basePanjang.equals("Desimeter [DM]") && konversiPanjang.equals("Kilometer [KM]")){
                var amount = (et_firstNumber.text.toString()).toDouble()
                result = amount * 0.0001
                println(result)
                tv_conversionResult.text = result.toString()
            }


            //Centimeter [CM]
            else if (basePanjang.equals("Centimeter [CM]") && konversiPanjang.equals("Millimeter [MM]")){
                var amount = (et_firstNumber.text.toString()).toDouble()
                result = amount * 10
                println(result)
                tv_conversionResult.text = result.toString()
            }
            else if (basePanjang.equals("Centimeter [CM]") && konversiPanjang.equals("Desimeter [DM]")){
                var amount = (et_firstNumber.text.toString()).toDouble()
                result = amount * 0.1
                println(result)
                tv_conversionResult.text = result.toString()
            }
            else if (basePanjang.equals("Centimeter [CM]") && konversiPanjang.equals("Meter [M]")){
                var amount = (et_firstNumber.text.toString()).toDouble()
                result = amount * 0.01
                println(result)
                tv_conversionResult.text = result.toString()
            }
            else if (basePanjang.equals("Centimeter [CM]") && konversiPanjang.equals("Dekameter [DAM]")){
                var amount = (et_firstNumber.text.toString()).toDouble()
                result = amount * 0.001
                println(result)
                tv_conversionResult.text = result.toString()
            }
            else if (basePanjang.equals("Centimeter [CM]") && konversiPanjang.equals("Hektometer [HM]")){
                var amount = (et_firstNumber.text.toString()).toDouble()
                result = amount * 0.0001
                println(result)
                tv_conversionResult.text = result.toString()
            }
            else if (basePanjang.equals("Centimeter [CM]") && konversiPanjang.equals("Kilometer [KM]")){
                var amount = (et_firstNumber.text.toString()).toDouble()
                result = amount * 0.00001
                println(result)
                tv_conversionResult.text = result.toString()
            }

            //Millimeter [MM]
            else if (basePanjang.equals("Millimeter [MM]") && konversiPanjang.equals("Centimeter [CM]")){
                var amount = (et_firstNumber.text.toString()).toDouble()
                result = amount * 0.1
                println(result)
                tv_conversionResult.text = result.toString()
            }
            else if (basePanjang.equals("Millimeter [MM]") && konversiPanjang.equals("Desimeter [DM]")){
                var amount = (et_firstNumber.text.toString()).toDouble()
                result = amount * 0.01
                println(result)
                tv_conversionResult.text = result.toString()
            }
            else if (basePanjang.equals("Millimeter [MM]") && konversiPanjang.equals("Meter [M]")){
                var amount = (et_firstNumber.text.toString()).toDouble()
                result = amount * 0.001
                println(result)
                tv_conversionResult.text = result.toString()
            }
            else if (basePanjang.equals("Millimeter [MM]") && konversiPanjang.equals("Dekameter [DAM]")){
                var amount = (et_firstNumber.text.toString()).toDouble()
                result = amount * 0.0001
                println(result)
                tv_conversionResult.text = result.toString()
            }
            else if (basePanjang.equals("Millimeter [MM]") && konversiPanjang.equals("Hektometer [HM]")){
                var amount = (et_firstNumber.text.toString()).toDouble()
                result = amount * 0.00001
                println(result)
                tv_conversionResult.text = result.toString()
            }
            else if (basePanjang.equals("Millimeter [MM]") && konversiPanjang.equals("Kilometer [KM]")){
                var amount = (et_firstNumber.text.toString()).toDouble()
                result = amount * 0.000001
                println(result)
                tv_conversionResult.text = result.toString()
            }

            else{
                print(spn_first.selectedItem.toString())
                Toast.makeText(this, "Calc Error", Toast.LENGTH_SHORT).show()
            }


        }
    }


    private fun textChanged() {
        et_firstNumber.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                Log.d("Main", "Before Text Changed")
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                Log.d("Main", "On Text Changed")
            }

            override fun afterTextChanged(s: Editable?) {
                try {
                    getValue()
                } catch (e: Exception) {
                    Log.e("Main", "$e")
                }
            }

        })
    }

    private fun getValue() {

        if (et_firstNumber != null && et_firstNumber.text.isNotEmpty() && et_firstNumber.text.isNotBlank()) {

            if (basePanjang == konversiPanjang) {
                Toast.makeText(this, "Gak bisa sama", Toast.LENGTH_SHORT).show()
            } else {
                GlobalScope.launch(Dispatchers.IO) {
                    try {
                        val inputStream: InputStream = assets.open("$basePanjang$konversiPanjang.json")
                        val getJson = inputStream.bufferedReader().use { it.readText() }
                        val json = JSONObject(getJson)

                        rateKonversi =
                            json.getJSONObject("rate").getString(konversiPanjang).toFloat()

                        withContext(Dispatchers.Main) {
                            val text = ((et_firstNumber.text.toString().toFloat()) * rateKonversi).toString()
                            tv_conversionResult?.setText(text)
                        }

                    } catch (e: Exception) {
                        Log.e("Main", "$e")
                    }
                }
            }
        }
    }

    private fun spinnerSetup() {
        val spinner = spn_first
        val spinner2 = spn_second

        ArrayAdapter.createFromResource(
            this,
            R.array.sat_panjang,
            android.R.layout.simple_spinner_dropdown_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinner.adapter = adapter
        }

        ArrayAdapter.createFromResource(
            this,
            R.array.kon_sat_panjang,
            android.R.layout.simple_spinner_dropdown_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinner2.adapter = adapter
        }

        spinner.onItemSelectedListener = (object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                basePanjang = parent?.getItemAtPosition(position).toString()
                getValue()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        })

        spinner2.onItemSelectedListener = (object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                konversiPanjang = parent?.getItemAtPosition(position).toString()
                getValue()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        })
    }
}