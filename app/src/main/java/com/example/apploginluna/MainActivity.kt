package com.example.apploginluna

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Cuando se de click en iniciar sesion:
        findViewById<Button>(R.id.btn_IniciarSesion).setOnClickListener {

            //Guardar en variables los Edit Text Correo y contrasena
            val EditTextCorreo = findViewById<EditText>(R.id.editText_Correoo)
            val EditTextContraseña = findViewById<EditText>(R.id.editText_Contraseñaa)

            //Capturamos lo que esta escrito en los Edit Text correo y contraseña
            var CorreoIntroducido = EditTextCorreo.text.toString().trim()
            var ContraseñaIntroducida = EditTextContraseña.text.toString().trim()

            //Aqui empiezan las VALIDACIONES

            //Validar si el correo no esta vacio
            if (CorreoIntroducido == ""){
                //Marcamos un error en el EditTextCorreo
                EditTextCorreo.setError("Debe ingresar su correo")
            }

            //Validar si la contrasena no esta vacia
            if (ContraseñaIntroducida == ""){
                //Marcamos un error en el EditTextContraseña
                EditTextContraseña.setError("Debe ingresar su Contraseña")
            }

            //Validamos que tanto el EditText Correo como Contraseña no estan vacios
            if (CorreoIntroducido == "" || ContraseñaIntroducida == ""){
                //Mostramos un mensaje de error general
                Toast.makeText(applicationContext, "Debe ingresar su correo y su Contraseña", Toast.LENGTH_LONG).show()
            }

            /*Si los EditText Contraseña y correo no estan vacios abrimos el activity MainPerfilUsuario*/
            else{
                startActivity(Intent(this, MainPerfilUsuario::class.java))
            }
        }


        //Cuando se le de click al boton Registrate
        findViewById<Button>(R.id.Btn_Registrate).setOnClickListener {
            //abro el activity de Registrate
            startActivity(Intent(this, MainRegistrate::class.java))
        }


        //Cuando se le de click al boton de Recuperar
        findViewById<Button>(R.id.btn_Recuperar).setOnClickListener {
            //Abbro el activity de Recuperar contraseña
            startActivity(Intent(this, MainRecuperacionPassword::class.java))
        }
    }
}