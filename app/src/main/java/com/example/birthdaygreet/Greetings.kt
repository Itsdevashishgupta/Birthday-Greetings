package com.example.birthdaygreet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_greetings.*
import kotlinx.android.synthetic.main.activity_main.*

class Greetings : AppCompatActivity() {
    companion object{
        const val NAME_EXTRA="name_extra"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_greetings)
        val name=intent.getStringExtra(NAME_EXTRA)
        textView2.text="Happy birthday \n$name!"
    }
}