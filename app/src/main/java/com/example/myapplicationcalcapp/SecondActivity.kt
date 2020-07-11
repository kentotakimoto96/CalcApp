package com.example.myapplicationcalcapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val value1 = intent.getFloatExtra("VALUE1", 0.0f)
        val value2 = intent.getFloatExtra("VALUE2", 0.0f)
        val value3 = intent.getIntExtra("VALUE3", 0)

        if(value3==1){
            textView.text = "${value1 + value2}"
        }else if(value3==2){
            textView.text = "${value1 - value2}"
        }else if(value3==3){
            textView.text = "${value1 * value2}"
        }else if(value3==4){
            textView.text = "${value1 / value2}"
        }
    }
}
