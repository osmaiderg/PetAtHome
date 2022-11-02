package com.example.petsathome.View.ui.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.petsathome.R

class LoginActivity : AppCompatActivity() {
    lateinit var registro: Button
    lateinit var inicio: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        registro= findViewById(R.id.registro)
        registro.setOnClickListener {
            startActivity(Intent(this,RegistroActivity::class.java))
        }

        inicio= findViewById(R.id.inicio)
        inicio.setOnClickListener {
            startActivity(Intent(this,HomeActivity::class.java))
        }
    }
}
