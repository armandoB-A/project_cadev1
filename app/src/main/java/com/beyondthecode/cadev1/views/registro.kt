package com.beyondthecode.cadev1.views


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AlertDialog
import com.beyondthecode.cadev1.R
import com.beyondthecode.cadev1.clases.DatePickerFragment
import com.beyondthecode.cadev1.clases.MyToolBar
import com.google.android.material.internal.ToolbarUtils
import com.google.android.material.textfield.TextInputEditText


class registro : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)

        MyToolBar().showATool(this, "Registrate", true)
        val regresarIniciar = findViewById<TextView>(R.id.btnRegresarAIniciarSession)
        regresarIniciar.setOnClickListener {
            regresarlogin()

        }
        val cancelarRegistro = findViewById<Button>(R.id.btnCancelar)
        cancelarRegistro.setOnClickListener {
            cancelar()
        }
        val elegirFecha=findViewById<TextInputEditText>(R.id.registroFechaDeNacimiento)
        elegirFecha.setOnClickListener{
            showDatePickerDialog()
        }
        val aceptar=findViewById<Button>(R.id.btnAceptar)
        aceptar.setOnClickListener {
            startActivity(Intent(this,matricula::class.java))
        }
        val itemsCarrera= arrayListOf("--Seleccione Carrera--","Ing. en Sistemas Computacionales")
        var combo=findViewById<Spinner>(R.id.registroCarrera)
        var adaptador= ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,itemsCarrera);
        combo.adapter=adaptador


    }

    fun regresarlogin() {
        startActivity(Intent(this, login::class.java))
    }

    private fun showDatePickerDialog() {
        val datePicker= DatePickerFragment{day, month,year -> onDateSelected(day, month, year)}
        datePicker.show(supportFragmentManager,"pickerdate")
    }
    fun cancelar(){
        val nombre=findViewById<TextInputEditText>(R.id.registroNombre)
        nombre.setText("")
        val ape1=findViewById<TextInputEditText>(R.id.registroApe1)
        ape1.setText("")
        val ape2=findViewById<TextInputEditText>(R.id.registroApe2)
        ape2.setText("")
        val email=findViewById<TextInputEditText>(R.id.registroEmail)
        email.setText("")
        val contraseña=findViewById<TextInputEditText>(R.id.registroContraseña)
        contraseña.setText("")
        val telefono=findViewById<TextInputEditText>(R.id.registroTelefono)
        telefono.setText("")
        val direccion=findViewById<TextInputEditText>(R.id.registroDireccion)
        direccion.setText("")
        val fecha=findViewById<TextInputEditText>(R.id.registroFechaDeNacimiento)
        fecha.setText("")
        val carrera=findViewById<Spinner>(R.id.registroCarrera)
        carrera.setSelection(0)



    }
    fun onDateSelected(day:Int,month:Int,year:Int){
        val elegirFecha=findViewById<TextInputEditText>(R.id.registroFechaDeNacimiento)
        elegirFecha.setText("$day/$month/$year")
    }



}
