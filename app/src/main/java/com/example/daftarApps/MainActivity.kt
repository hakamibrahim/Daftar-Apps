package com.example.daftarApps

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        simpan.setOnClickListener {
            val intent = Intent(this@MainActivity, ConfirmActivity::class.java)
            intent.putExtra("name", name.text.toString())
            intent.putExtra("username", userName.text.toString())
            intent.putExtra("email", email.text.toString())
            intent.putExtra("address", address.text.toString())
            intent.putExtra("phone", phone.text.toString())
            startActivity(intent)
        }
    }
}
