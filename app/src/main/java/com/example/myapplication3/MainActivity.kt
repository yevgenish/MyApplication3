package com.example.myapplication3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        if( savedInstanceState== null){
            //first time load
        }else{
            //resumed
        }
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_activity_2: Button = findViewById<Button>(R.id.btn_open_activity_2)
        btn_activity_2.setOnClickListener {
            val intent_open_activity_2 = Intent(this, activity_2::class.java)
            startActivity(intent_open_activity_2)
        }
    }

    override fun onStart() {
        super.onStart()

    }

    override fun onResume() {
        super.onResume()

    }

    override fun onPause() {
        super.onPause()

    }

    override fun onStop() {
        super.onStop()

    }

    override fun onDestroy() {
        //my code, then super.onDestroy()

        super.onDestroy()
    }
}