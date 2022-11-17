package com.beyondthecode.cadev1.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.beyondthecode.cadev1.R
import com.beyondthecode.cadev1.clases.MyToolBar

class matricula : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_matricula)
        MyToolBar().showATool(this, "", true)
    }
}