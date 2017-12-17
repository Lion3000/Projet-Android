package com.example.alex.myfirstappc

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MyFirstAppC : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_first_app_c)
    }

    fun modifyText(v:View) {
        val value: TextView =  findViewById (R.id.textView)
        value.text = "Test"
    }
}
