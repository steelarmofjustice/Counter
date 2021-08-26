package com.example.counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView = findViewById(R.id.Text)
    }
    private lateinit var textView: TextView
    fun count(view: View){
        val countText = textView.text.toString()
        var num: Int = Integer.parseInt(countText)
        num++
        textView.text = num.toString()
    }
}