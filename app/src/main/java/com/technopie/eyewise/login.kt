package com.technopie.eyewise

import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.GradientDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val button: TextView = findViewById(R.id.noacc)
        button.setOnClickListener {
            val intent = Intent(this, signup::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.zzoom_in, R.anim.zzoom_out)
        }
        val login: ImageView = findViewById(R.id.lgn)
        login.setOnClickListener {
            val intent = Intent(this, home::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.zzoom_in, R.anim.zzoom_out)
        }
    }
}
