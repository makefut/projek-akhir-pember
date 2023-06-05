package com.example.wisataaa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class LogoActivity : AppCompatActivity() {
    private val loadtime = 4000 //4 sec
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.logo)
        Handler().postDelayed({
            val home = Intent(this@LogoActivity, MainActivity::class.java)
            startActivity(home)
            finish()
        }, loadtime.toLong())
    }
}