package com.example.birthdaygreet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.birthdaygreet.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun createbirthdaygreet(view: android.view.View) {
        val name=input_name.editableText.toString()
        val intent=Intent(this,Greetings::class.java)
        intent.putExtra(Greetings.NAME_EXTRA,name)
        startActivity(intent)
    }
}