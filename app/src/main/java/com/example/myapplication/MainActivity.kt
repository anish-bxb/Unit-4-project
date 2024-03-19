package com.example.myapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import android.widget.TextView
import androidx.core.widget.addTextChangedListener

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var amount = 0;
        val editText = findViewById<EditText>(R.id.editText)
        val fifteen = findViewById<TextView>(R.id.textView2)
        val eighteen = findViewById<TextView>(R.id.textView3)
        val twenty = findViewById<TextView>(R.id.textView4)
        val twentyfive = findViewById<TextView>(R.id.textView5)
        editText.addTextChangedListener(object : TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            }

            @SuppressLint("SetTextI18n")
            override fun afterTextChanged(s: Editable?) {
                val txt = s.toString()
                amount = txt.toIntOrNull() ?:0

                fifteen.setText("15% Tip Added = ${amount + amount*.15}")
                eighteen.setText("18% Tip Added = ${amount + amount*.18}")
                twenty.setText("20% Tip Added = ${amount + amount*.20}")
                twentyfive.setText("25% Tip Added = ${amount + amount*.25}")
            }
            });

    }


}