package com.beyondthecode.cadev1.clases

import androidx.appcompat.app.AppCompatActivity
import com.beyondthecode.cadev1.R

class MyToolBar {
    fun showATool(activities: AppCompatActivity, title:String,up:Boolean){
        activities.setSupportActionBar(activities.findViewById(R.id.toolbar))
        activities.supportActionBar?.setDisplayHomeAsUpEnabled(up)
    }
}