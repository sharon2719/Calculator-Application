package com.example.calculator

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var etNumber1=findViewById<EditText>(R.id.etNumber1)
        var etNumber2=findViewById<EditText>(R.id.etNumber2)
        var tvAnswer=findViewById<TextView>(R.id.tvAnswer)
        var btnAdd=findViewById<Button>(R.id.btnAdd)
        var btnSubtract=findViewById<Button>(R.id.btnSubtract)
        var btnMultiply=findViewById<Button>(R.id.btnMultiply)
        var btnModulus=findViewById<Button>(R.id.btnModulus)

        btnAdd.setOnClickListener {
            if(etNumber1.text.toString()==""){
                Toast.makeText(baseContext,"Enter a number",Toast.LENGTH_SHORT).show()
            }
            else if (etNumber2.text.toString()==""){
                Toast.makeText(baseContext,"Enter a number",Toast.LENGTH_SHORT).show()
            }
            else{
                var num1=etNumber1.text.toString().toInt()
                var num2=etNumber2.text.toString().toInt()
                var addTotal=num1+num2
                tvAnswer.text="Answer:${addTotal}"
            }
        }
        btnSubtract.setOnClickListener {
            if (etNumber1.text.toString()==""){
                Toast.makeText(baseContext,"Enter a number",Toast.LENGTH_SHORT).show()
            }
            else if (etNumber2.text.toString()==""){
                Toast.makeText(baseContext,"Enter a number",Toast.LENGTH_SHORT).show()
            }
            else{
                var num1=etNumber1.text.toString().toInt()
                var num2=etNumber2.text.toString().toInt()
                var subtractTotal=num1-num2
                tvAnswer.text="Answer:${subtractTotal}"
            }
        }
        btnMultiply.setOnClickListener {
            if (etNumber1.text.toString()==""){
                Toast.makeText(baseContext,"Enter a number",Toast.LENGTH_SHORT).show()
            }
            else if (etNumber2.text.toString()==""){
                Toast.makeText(baseContext,"Enter a number",Toast.LENGTH_SHORT).show()
            }
            else{
                var num1=etNumber1.text.toString().toInt()
                var num2=etNumber2.text.toString().toInt()
                var multiplyTotal=num1*num2
                tvAnswer.text="Answer:${multiplyTotal}"
            }
        }
        btnModulus.setOnClickListener {
            if (etNumber1.text.toString()==""){
                Toast.makeText(baseContext,"Enter a number",Toast.LENGTH_SHORT).show()
            }
            else if (etNumber2.text.toString()==""){
                Toast.makeText(baseContext,"Enter a number",Toast.LENGTH_SHORT).show()
            }
            else{
                var num1=etNumber1.text.toString().toInt()
                var num2=etNumber2.text.toString().toInt()
                var modulusTotal=num1%num2
                tvAnswer.text="Answer:${modulusTotal}"
            }
        }


    }
}