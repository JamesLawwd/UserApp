package com.example.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



         var btnsignup = findViewById<Button>(R.id.btnSignup)
         btnsignup.setOnClickListener {
             var i = Intent(applicationContext, MainActivity::class.java)
             startActivity(i)
         }

    }
}

//SignUp
//Login

// TextView -> Signup
// 4 Edit Text -> username, email, phone ,                       password
// Button -> SignUp
// Already Registered? Login

// TextView -> Login
// 2 -edit Text -> email, password
// Button -> Login

// Not Registered yet? SignUp

// Drawables -> Design
// Angry tool