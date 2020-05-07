package com.chinmay.calculator

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import android.widget.Toast.LENGTH_SHORT
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    lateinit var str: String
    lateinit var functionType: String
    lateinit var display_text :TextView
    lateinit var button_zero: Button

    lateinit var button_one: Button
    lateinit var button_two: Button

    lateinit var button_three: Button
    lateinit var button_four: Button

    lateinit var button_five: Button
    lateinit var button_six: Button

    lateinit var button_seven: Button
    lateinit var button_eight: Button

    lateinit var button_nine: Button
    lateinit var button_addition: Button

    lateinit var button_subtraction: Button
    lateinit var button_divide: Button

    lateinit var button_modulo: Button
    lateinit var button_multiply: Button

    lateinit var button_equalto: Button
    lateinit var button_clear: Button
    var x: Int = -1
    var y: Int = -1



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        str = "" // display text to update the console
        functionType = "" // function type that is to be used. This string that holds that

        display_text = findViewById(R.id.displayText)
        button_zero = findViewById(R.id.button_zero)

        button_one =   findViewById(R.id.button_one)
        button_two =   findViewById(R.id.button_two)
        button_three =   findViewById(R.id.button_three)
        button_four =   findViewById(R.id.button_four)

        button_five =   findViewById(R.id.button_five)
        button_six =   findViewById(R.id.button_six)
        button_seven =   findViewById(R.id.button_seven)
        button_eight =   findViewById(R.id.button_eight)

        button_nine =   findViewById(R.id.button_nine)
        button_addition =   findViewById(R.id.addition_button)
        button_subtraction =   findViewById(R.id.subtraction_button)
        button_multiply =   findViewById(R.id.multiply_button)

        button_divide =  findViewById(R.id.division_button)
        button_modulo =   findViewById(R.id.modulo_button)

        button_equalto =   findViewById(R.id.equalTo_button)
        button_clear =   findViewById(R.id.button_clear_display)


        button_zero.setOnClickListener(View.OnClickListener {


            if(x == -1){
                x = 0
                str = "0"
                display_text.text =  str
            } else {
                y = 0
                display_text.text = str + "0"
            }

        })

        button_one.setOnClickListener(View.OnClickListener {

            display_text.text =  "1"
            if(x == -1){
                x = 1
                str = "1"
                display_text.text =  str
            } else {
                y = 1
                display_text.text = str + "1"
            }

        })

        button_two.setOnClickListener(View.OnClickListener {

            display_text.text =  "2"
            if(x == -1){
                x = 2
                str = "2"
                display_text.text =  str
            } else {
                y = 2
                display_text.text = str + "2"
            }
        })

        button_three.setOnClickListener(View.OnClickListener {

            display_text.text =  "3"
            if(x == -1){
                x = 3
                str = "3"
                display_text.text =  str
            } else {
                y = 3
                display_text.text = str + "3"
            }
        })

        button_four.setOnClickListener(View.OnClickListener {

            display_text.text =  "4"
            if(x == -1){
                x = 4
                str = "4"
                display_text.text =  str
            } else {
                y = 4
                display_text.text = str + "4"
            }
        })

        button_five.setOnClickListener(View.OnClickListener {

            display_text.text =  "5"
            if(x == -1){
                x = 5
                str = "5"
                display_text.text =  str
            } else {
                y = 5
                display_text.text = str + "5"
            }
        })

        button_six.setOnClickListener(View.OnClickListener {

            display_text.text =  "6"
            if(x == -1){
                x = 6
                str = "6"
                display_text.text =  str
            } else {
                y = 6
                display_text.text = str + "6"
            }
        })

        button_seven.setOnClickListener(View.OnClickListener {

            display_text.text =  "7"
            if(x == -1){
                x = 7
                str = "7"
                display_text.text =  str
            } else {
                y = 7
                display_text.text = str + "7"
            }
        })

        button_eight.setOnClickListener(View.OnClickListener {

            display_text.text =  "8"
            if(x == -1){
                x = 8
                str = "8"
                display_text.text =  str
            } else {
                y = 8
                display_text.text = str + "8"
            }
        })

        button_nine.setOnClickListener(View.OnClickListener {

            display_text.text =  "9"
            if(x == -1){
                x = 9
                str = "9"
                display_text.text =  str
            } else {
                y = 9
                display_text.text = str + "9"
            }
        })


        /* Functions start here*/

        button_addition.setOnClickListener(View.OnClickListener {

            str = str + "+"
            display_text.text = str
            functionType = "+"
        })

        button_subtraction.setOnClickListener(View.OnClickListener {

            str = str + "-"
            display_text.text = str
            functionType = "-"
        })

        button_divide.setOnClickListener(View.OnClickListener {

            str = str + "÷"
            display_text.text = str
            functionType = "/"
        })

        button_multiply.setOnClickListener(View.OnClickListener {

            str = str + "x"
            display_text.text = str
            functionType = "x"
        })

        button_modulo.setOnClickListener(View.OnClickListener {

            str = str + "%"
            display_text.text = str
            functionType = "%"
        })

        button_equalto.setOnClickListener(View.OnClickListener {


            val output = callCalcFunction(functionType,x,y)
            x = -1
            y = -1
            functionType = ""
            display_text.text = output.toString()
        })

        button_clear.setOnClickListener(View.OnClickListener {

            display_text.text = ""
        })


    }


    fun callCalcFunction(funType: String,a: Int,b: Int): Int{

        when(funType){
            "+" ->  return a+b
            "-" ->  return a-b
            "/" ->  return a/b
            "x" ->  return a*b
            "%" ->  return a%b
            else  -> { return 0 }
        }

    }

}
