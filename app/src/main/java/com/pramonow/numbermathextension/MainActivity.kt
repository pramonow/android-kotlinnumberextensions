package com.pramonow.numbermathextension

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.pramonow.numberextensions.square

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val number = 10

        Toast.makeText(this,number.square(), Toast.LENGTH_SHORT).show()
    }
}
