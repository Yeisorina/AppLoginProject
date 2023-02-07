package com.example.apploginluna

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainRecuperacionPassword : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_recuperacion_password)


        //Cuando se de click en Volver a inicio
        findViewById<Button>(R.id.btn_volverAinicio).setOnClickListener{
            //abro el activity de iniciar sesion
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}