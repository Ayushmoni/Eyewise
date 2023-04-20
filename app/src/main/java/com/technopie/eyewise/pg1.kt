package com.technopie.eyewise

import android.content.Intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView


class pg1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pg1)

        val imageViewpg1: ImageView = findViewById(R.id.nxt1)
        imageViewpg1.setOnClickListener {
            val intent = Intent(this, pg2::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_in_from_right, R.anim.slide_out_to_left)
        }
    }
}