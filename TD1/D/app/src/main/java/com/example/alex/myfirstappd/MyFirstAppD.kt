package com.example.alex.myfirstappd

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import org.jetbrains.anko.*

class MyFirstAppD() : AppCompatActivity(), AnkoLogger {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_first_app_d)

        info("L'evenment onCreate à était executé!")
    }

    fun modifyText(v:View) {
        val value: TextView =  findViewById (R.id.textView)
        value.text = "Test"
    }

    override fun onStart() {
        super.onStart()
        info("L'evenment onStart à était executé!")
    }

    override fun onResume() {
        super.onResume()
        info("L'evenment onResume à était executé!")
    }

    override fun onPause() {
        super.onPause()
        info("L'evenment onPause à était executé!")
    }

    override fun onStop() {
        super.onStop()
        info("L'evenment onStop à était executé!")
    }

    override fun onDestroy() {
        super.onDestroy()
        info("L'evenment onDestroy à était executé!")
    }


}
