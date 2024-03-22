package com.example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etHours = findViewById<EditText>(R.id.etHours).text
        val etShifts = findViewById<EditText>(R.id.etShifts).text

        val btnCalculate = findViewById<Button>(R.id.btnCalculate)
        val tvResult = findViewById<TextView>(R.id.tvResult)

        btnCalculate.setOnClickListener {
            var currentRate = 0.0
            var hours = etHours.toString().toDouble()
            var shift = etShifts.toString().toInt()
            var regularPay = 0.0
            val overtimePay = 0.0
            var overtimehours = 0.0
            val firstshift = 17.0
            val secondshift = 18.50
            val thirdshift = 22

            if (hours > 40) {
                overtimehours = hours - 40
                hours = 40.0
            }

            if (shift ==1) {
                regularPay = firstshift * hours
                currentRate= firstshift
            } else if (shift == 2) {
                regularPay = secondshift * hours
                currentRate = secondshift
            } else if (shift == 3) {
                regularPay = thirdshift * hours
                currentRate = thirdshift
            } else {
                tvResult.text = "Invalid Shift Values"
            }
            if (hours >48) {


            








        }
        }

    }
}