package com.example.gpa_lopelj_calculator

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout


class MainActivity : AppCompatActivity() {

    lateinit var finput: EditText
    lateinit var sinput: EditText
    lateinit var tinput: EditText
    lateinit var ffinput: EditText
    lateinit var linput: EditText
    lateinit var otextv: TextView
    lateinit var mbutton: Button
    lateinit var bgcolor: ConstraintLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        finput = findViewById(R.id.fnumber)
        sinput = findViewById(R.id.snumber)
        tinput = findViewById(R.id.tnumber)
        ffinput = findViewById(R.id.cnumber)
        linput = findViewById(R.id.lnumber)
      //  bgcolor = findViewById(R.id.bg1color)

        otextv = findViewById(R.id.otv)
        mbutton = findViewById(R.id.button)
//
        mbutton.setOnClickListener{doCalculation()}
        mbutton.setOnClickListener{checkempty()}
    }

    fun checkempty(){

        if(sinput.text.isBlank()){
            finput.setBackgroundColor(Color.RED)

        } else if(ffinput.text.isBlank()){
            ffinput.setBackgroundColor(Color.RED)
        }
        else if(sinput.text.isBlank()) {
            sinput.setBackgroundColor(Color.RED)

        } else if(finput.text.isBlank()){
            finput.setBackgroundColor(Color.RED)

        } else if (linput.text.isBlank()){
            linput.setBackgroundColor(Color.RED)
        }

    }

    fun doCalculation(){
        var total: Int = finput.text.toString().toInt()+
                         sinput.text.toString().toInt()+
                          tinput.text.toString().toInt()+
                          ffinput.text.toString().toInt()+
                          linput.text.toString().toInt()


        var gpa: Double = total.toDouble() / 5.0

        if (gpa < 60){
            bgcolor.setBackgroundColor(Color.RED)

        } else if (gpa > 60 && gpa < 80){
            bgcolor.setBackgroundColor(Color.YELLOW)
        }
        else if (gpa > 79 && gpa < 101){
            bgcolor.setBackgroundColor(Color.GREEN)
        }

        otextv.setText("Your GPA is: " + gpa)

        mbutton.setText("Clear")

    }
}