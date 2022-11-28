package com.example.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler().postDelayed({
                              var i = Intent(applicationContext, MainActivity::class.java)
                              startActivity(i)
                              finish()
        },3000)

    }
}

// git process
// git init
// git remote add origin....
// git add .
//