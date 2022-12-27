package com.example.myadventscalendar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class FullPhoto : AppCompatActivity() {
    companion object {
        const val KEY_PHOTO = "KEY_PHOTO"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_full_photo)

        val imageFullScreen = findViewById<ImageView>(R.id.imageFullScreen)
        val imageFull = intent.getIntExtra("KEY_PHOTO", -1)
        if (imageFull != -1) {
            imageFullScreen.setImageResource(imageFull)
        } else println("Sorry, no photo available")



    }
}