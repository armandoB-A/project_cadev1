package com.beyondthecode.cadev1.views

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button

import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.beyondthecode.cadev1.R

class login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val iniciar = findViewById<Button>(R.id.botoniniciar)
        iniciar.setOnClickListener {

        }
        iniciar.setOnClickListener {

        }
        val olvido = findViewById<TextView>(R.id.olvidoContraseña)
        olvido.setOnClickListener {
            errorContrasenia()
        }

        val registrarse = findViewById<TextView>(R.id.btnregistro)
        registrarse.setOnClickListener {
            registrar()
        }
    }

    fun errorContrasenia() {
        val view = View.inflate(this@login, R.layout.dialog_view, null)
        val builder = AlertDialog.Builder(this@login)
        builder.setView(view)

        val dialog = builder.create()
        dialog.show()
        dialog.window?.setBackgroundDrawableResource(android.R.color.transparent)
    }

    fun registrar() {
        val lanzar = Intent(this, registro::class.java)
        startActivity(lanzar)
    }

}