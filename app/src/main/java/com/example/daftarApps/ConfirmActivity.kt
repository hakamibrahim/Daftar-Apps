package com.example.daftarApps

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_confirm.*

class ConfirmActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_confirm)
        getDataFromMain()
    }

    private fun getDataFromMain() {
        val intent = intent
        val name = intent.getStringExtra("name")
        val userName = intent.getStringExtra("username")
        val address = intent.getStringExtra("address")
        val email = intent.getStringExtra("email")
        val phone = intent.getStringExtra("phone")

        nameConfirm.text = name
        userNameConfirm.text = userName
        addressConfirm.text = address
        emailConfirm.text = email
        phoneConfirm.text = phone
    }

    fun backToInpuData(v: View) {
        val intent = Intent(applicationContext, MainActivity::class.java)
        startActivity(intent)
    }

    fun lanjut(v: View){
        Toast.makeText(this, "Contact Me at hakamibrahim7@gmail.com", Toast.LENGTH_SHORT).show()
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
