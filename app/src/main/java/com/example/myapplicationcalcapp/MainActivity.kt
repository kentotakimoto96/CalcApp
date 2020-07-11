package com.example.myapplicationcalcapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent
import android.support.design.widget.Snackbar
import android.util.Log
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.textView
import kotlinx.android.synthetic.main.activity_second.*


class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        val intent = Intent(this, SecondActivity::class.java)
        var type:Int

        if(R.id.button1 == v.id){
            type = 1
        }else if(R.id.button2 == v.id){
            type = 2
        }else if(R.id.button3 == v.id){
            type = 3
        }else if(R.id.button4 == v.id){
            type = 4
        }else{
            type = 0
        }

        intent.putExtra("VALUE3", type)

        Log.d("LOG", editText1.text.toString())

//        textView.text = editText1.text
        if(editText2.text.toString()== "0" && type==4 && editText1.text.toString() != ""){
            Snackbar.make(v, "0では割れません.", Snackbar.LENGTH_SHORT)
                .show()
        }else if(editText1.text.toString() != "" && editText2.text.toString() != ""){
            intent.putExtra("VALUE1", editText1.text.toString().toFloat())
            intent.putExtra("VALUE2", editText2.text.toString().toFloat())
            startActivity(intent)
        }else{
            Snackbar.make(v, "2つとも数値を入力してください.", Snackbar.LENGTH_SHORT)
                .show()
        }

    }
}