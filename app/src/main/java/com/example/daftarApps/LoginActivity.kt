package com.example.daftarApps

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    fun login(v: View){}

    fun register(v: View){
        val intent = Intent(this@LoginActivity, MainActivity::class.java)
        startActivity(intent)
    }
}
