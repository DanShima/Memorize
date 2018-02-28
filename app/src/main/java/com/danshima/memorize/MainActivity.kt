package com.danshima.memorize

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onButton4Clicked(v: View){
        Toast.makeText(this, "You clicked me!", Toast.LENGTH_LONG).show()
    }
}
