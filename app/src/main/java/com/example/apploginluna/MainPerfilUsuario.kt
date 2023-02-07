package com.example.apploginluna

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainPerfilUsuario : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_perfil_usuario)

        //Cuando se de click en cerrar sesion
        findViewById<Button>(R.id.CerrarSesion).setOnClickListener{
            //abro el activity de Iniciar sesion
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}