package com.aasdrithtechnologies.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        var profile=findViewById<ImageView>(R.id.imgprof)
        var results=findViewById<ImageView>(R.id.imgres)

        profile.setOnClickListener{
            intent= Intent(this,StudentProfile::class.java)
            startActivity(intent)
        }
        results.setOnClickListener{
            intent= Intent(this,StudentResults::class.java)
            startActivity(intent)
        }
    }
}