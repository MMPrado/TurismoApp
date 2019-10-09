package com.example.turismoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_cabos.*

class VallartaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vallarta)
        btnRegresar.setOnClickListener {
            System.exit(0)
        }
    }
}
