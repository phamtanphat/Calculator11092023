package com.example.calculator11092023

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    private lateinit var edtNumber1: EditText
    private lateinit var edtNumber2: EditText
    private lateinit var btnPlus: Button
    private lateinit var btnMinus: Button
    private lateinit var btnMultiplication: Button
    private lateinit var btnDivision: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edtNumber1 = findViewById(R.id.edit_text_number1)
        edtNumber2 = findViewById(R.id.edit_text_number2)
        btnPlus = findViewById(R.id.button_plus)
        btnMinus = findViewById(R.id.button_minus)
        btnMultiplication = findViewById(R.id.button_multiplication)
        btnDivision = findViewById(R.id.button_division)

        // Alt + enter: Goi y sua loi
        btnPlus.setOnClickListener(object : View.OnClickListener{
            override fun onClick(p0: View?) {
                Log.d("BBB", "Plus ${this}")
            }
        })

        // Lambda
        btnMinus.setOnClickListener {
            Log.d("BBB", "Minus ${this}")
        }

    }
}