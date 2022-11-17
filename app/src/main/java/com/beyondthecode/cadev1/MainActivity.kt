package com.beyondthecode.cadev1

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.beyondthecode.cadev1.api.modelos.InicioDto
import com.beyondthecode.cadev1.api.repositorios.InicioRepository
import com.beyondthecode.cadev1.api.retrofit.ApiClientt
import com.beyondthecode.cadev1.views.login
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val splashanimation=AnimationUtils.loadAnimation(this,R.anim.assets_fade_in)
        val imagen=findViewById<ImageView>(R.id.logoCade)
        val titulo=findViewById<TextView>(R.id.tituloCade)

        imagen.startAnimation(splashanimation)
        titulo.startAnimation(splashanimation)
        /*
        **llamada al servidor para ver si se encuentra disponible
        var service = ApiClientt.getRetrofitInstance()?.create(InicioRepository::class.java)
        service?.getInicio()?.enqueue(object: Callback<InicioDto?> {
            override fun onResponse(call: Call<InicioDto?>, response: Response<InicioDto?>) {
                Toast.makeText(applicationContext, ""+response.body()?.inicio, Toast.LENGTH_SHORT).show()
                startActivity(
                    Intent(this@MainActivity, login::class.java)
                )
                finish()
            }

            override fun onFailure(call: Call<InicioDto?>, t: Throwable) {
                Toast.makeText(applicationContext, "no se puede master "+t.message, Toast.LENGTH_LONG).show()
            }
        })
        */

        @Suppress("DEPRECATION")
        Handler().postDelayed({
            startActivity(
                Intent(this@MainActivity, login::class.java)
            )
            finish()

        },3500)

        //cambio pingu

    }
}