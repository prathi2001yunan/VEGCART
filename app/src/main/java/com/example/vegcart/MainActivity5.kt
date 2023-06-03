package com.example.vegcart

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)
        Handler().postDelayed({
            startActivity(Intent(this,MainActivity::class.java))
            this@MainActivity5.finish()

        },3000)


    }
}