package com.rajaman.homework1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Character.toUpperCase
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var txt = findViewById<EditText>(R.id.mainEditText)
        val btn1 = findViewById<Button>(R.id.mainButton1)
        val btn2 = findViewById<Button>(R.id.mainButton2)
        val btn3 = findViewById<Button>(R.id.mainButton3)
        val btn4 = findViewById<Button>(R.id.mainButton4)

        btn1.setOnClickListener {
            if(mainEditText.text.isNotEmpty()){

                val s : String = mainEditText.text.toString().toUpperCase()
                mainEditText.setText(s).toString()
                Toast.makeText(this, s, Toast.LENGTH_LONG).show()
            }
            else {
                Toast.makeText(this, "Null", Toast.LENGTH_LONG).show()
            }
        }
        btn2.setOnClickListener {
            if(mainEditText.text.isNotEmpty()){
                val s : String = mainEditText.text.toString().toLowerCase()
                mainEditText.setText(s).toString()
                Toast.makeText(this, s, Toast.LENGTH_LONG).show()
            }else{
                Toast.makeText(this, "Null", Toast.LENGTH_LONG).show()
            }
        }
        btn3.setOnClickListener {if(mainEditText.text.isNotEmpty()){
            val s : String = mainEditText.text.toString()
            mainEditText.setText(s).toString()
            Toast.makeText(this, s, Toast.LENGTH_LONG).show()
        }else{
            Toast.makeText(this, "Null", Toast.LENGTH_LONG).show()
        }
        }
        btn4.setOnClickListener {
            if(mainEditText.text.isNotEmpty()){
                val s : String = mainEditText.text.toString().reversed()
                mainEditText.setText(s).toString()
                Toast.makeText(this, s, Toast.LENGTH_LONG).show()
            }else{
                Toast.makeText(this, "Null", Toast.LENGTH_LONG).show()
            }
        }
        mainbutton5.setOnClickListener {
            if (mainEditText.text.isNotEmpty()) {
                mainEditText.text.clear()
                Toast.makeText(this, "Cleared text", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this, "First Enter Something", Toast.LENGTH_LONG).show()
            }
        }
        
    }
}