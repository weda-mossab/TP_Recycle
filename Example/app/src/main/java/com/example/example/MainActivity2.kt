package com.example.example

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {
    lateinit var receiver:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity2)

        /* receiver=findViewById(R.id.txtReceiver)
        val valeur = intent.getStringExtra("cle")
        receiver.setText(valeur.toString()) */
    }
}