package org.pet.core

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatImageView

class TestActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val view = AppCompatImageView(this)
        view.setImageResource(R.drawable.thumbsup)
        setContentView(view)
    }
}