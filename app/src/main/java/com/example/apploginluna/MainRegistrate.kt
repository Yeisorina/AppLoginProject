package com.example.apploginluna

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainRegistrate : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_registrate)

        //Cuando se de click en iniciar sesion
        findViewById<Button>(R.id.btn_RegisIniciarSesion).setOnClickListener{
            //abro el activity de Iniciar sesion
            startActivity(Intent(this, MainActivity::class.java))
        }

        //Cuando se de click en Registrarse
        findViewById<Button>(R.id.btn_RegisRegistrate).setOnClickListener{

            //Guardar en variables los EditText Nombre y apellido, correo, contraseña, edad, etc...
            //(En estas variables guardo los elementos EditText, NO el texto que tienen dentro)
            val EditTextNombreApellido = findViewById<EditText>(R.id.EditText_NombreyApellido)
            val EditTextCorreo = findViewById<EditText>(R.id.EditText_RCorreo)
            val EditTextContraseña = findViewById<EditText>(R.id.EditText_Rcontraseña)
            val EditTextPhone = findViewById<EditText>(R.id.EditText_Telefono)
            val EditTextFechaN = findViewById<EditText>(R.id.EditText_FechaNacim)
            val EditTextSexo = findViewById<EditText>(R.id.EditText_Sexo)
            val EditTextPais = findViewById<EditText>(R.id.EditText_Pais)
            val EditTextProvincia = findViewById<EditText>(R.id.EditText_Provincia)
            val EditTextDireccion = findViewById<EditText>(R.id.EditText_Direccion)


            //Ahora si le saco el texto a los EditText
            var NombreApeIntroducido = EditTextNombreApellido.text.toString().trim()
            var CorreoIntroducido = EditTextCorreo.text.toString().trim()
            var ContraseñaIntr = EditTextContraseña.text.toString().trim()
            var TelefonoIntr = EditTextPhone.text.toString().trim()
            var FechaIntr = EditTextFechaN.text.toString().trim()
            var Sexointr = EditTextSexo.text.toString().trim()
            var PaisIntr = EditTextPais.text.toString().trim()
            var PronvinIntr = EditTextProvincia.text.toString().trim()
            var DireccionIntr = EditTextDireccion.text.toString().trim()


            //AQUI HACEMOS LAS VALIDACIONES DE LO QUE ESTA ESCRITO EN LOS EditText

            //Condicion de Si el NombreApeIntroducido esta vacio
            if (NombreApeIntroducido == ""){
                //Le pongo el setError al EditTextNombreApellido
                EditTextNombreApellido.setError("Debe ingresar su nombre!")
            }

            //Condicion de Si el CorreoIntroducido esta vacio
            if (CorreoIntroducido == ""){
                //Le pongo el setError al EditTextCorreo
                EditTextCorreo.setError("Debe ingresar su correo!")
            }

            if (ContraseñaIntr == "") {

                EditTextContraseña.setError("Debe ingresar contraseña")
            }

            if (TelefonoIntr == "") {

                EditTextPhone.setError("Debe ingresar su Telefono")
            }

            if (FechaIntr == "") {

                EditTextFechaN.setError("Debe introducir Fecha de nacimiento")
            }

            if (Sexointr == "") {

                EditTextSexo.setError("Debe introducir Sexo")
            }

            if (PaisIntr == "") {

                EditTextPais.setError("Debe introducir pais")
            }

            if (PronvinIntr == "") {

                EditTextProvincia.setError("Debe introducir Provincia")
            }

            if (DireccionIntr == "") {

                EditTextDireccion.setError("Debe introducir Direccion")
            }

            //Esta seria una condicion general para validar si algun campo esta vacio
            if (NombreApeIntroducido == "" || CorreoIntroducido == "" || ContraseñaIntr == "" ||
                TelefonoIntr == "" || FechaIntr == "" || Sexointr == "" || PaisIntr == "" || PronvinIntr == "" ||
                DireccionIntr == "" ) {

                // Ponemos un mensaje de que debe llenar todos los campos
                Toast.makeText(applicationContext, "Debe llenar todos los datos", Toast.LENGTH_LONG).show()
            }

            //Este else seria la condicion de que si todos los campos estan llenos
            else {
                //abro el activity de Perfil de usuario
                startActivity(Intent(this, MainPerfilUsuario::class.java))
            }
        }
    }
}