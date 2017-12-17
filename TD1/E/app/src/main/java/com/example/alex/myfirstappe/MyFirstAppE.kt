package com.example.alex.myfirstappe

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.NumberPicker
import android.widget.TextView
import org.jetbrains.anko.*

class MyFirstAppE : AppCompatActivity(), AnkoLogger {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_first_app_e)

        val np: NumberPicker = findViewById(R.id.numberPicker)
        np.minValue = 0
        np.maxValue = 50

        info("L'evenment onCreate à était executé!")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        outState.putInt("NumberPicker", findViewById<NumberPicker>(R.id.numberPicker).value)
        super.onSaveInstanceState(outState)
    }
    override fun onRestoreInstanceState(inState: Bundle){
        findViewById<NumberPicker>(R.id.numberPicker).value = inState.getInt("NumberPicker")
        super.onSaveInstanceState(inState)
    }

    fun modifyText(v:View) {
        val value: TextView =  findViewById(R.id.textView)
        value.text = "Test"

        info("L'evenment onCreate à était executé!")
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
