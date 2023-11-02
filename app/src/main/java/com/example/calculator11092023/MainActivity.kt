package com.example.calculator11092023

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var edtNumber1: EditText
    private lateinit var edtNumber2: EditText
    private lateinit var btnPlus: Button
    private lateinit var btnMinus: Button
    private lateinit var btnMultiplication: Button
    private lateinit var btnDivision: Button
    private lateinit var tvResult: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edtNumber1 = findViewById(R.id.edit_text_number1)
        edtNumber2 = findViewById(R.id.edit_text_number2)
        btnPlus = findViewById(R.id.button_plus)
        btnMinus = findViewById(R.id.button_minus)
        btnMultiplication = findViewById(R.id.button_multiplication)
        btnDivision = findViewById(R.id.button_division)
        tvResult = findViewById(R.id.text_view_result)

        // Alt + enter: Goi y sua loi
        btnPlus.setOnClickListener {
            // Lay du lieu tu input
            val textNumber1 = edtNumber1.text.toString()
            val textNumber2 = edtNumber2.text.toString()

            // Kiem tra gia tri rong
            if (textNumber1.isBlank() || textNumber2.isBlank()) {
                Toast.makeText(this@MainActivity, "Input invalid", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            // Chuyen kieu du lieu sang kieu so de xu ly
            val number1 = textNumber1.toInt() // Ep kieu
            val number2 = textNumber2.toInt() // Ep kieu
            val result = number1 + number2
            val textDisplay = "Result: $number1 + $number2 = $result"
            tvResult.text = textDisplay
        }
    }
}