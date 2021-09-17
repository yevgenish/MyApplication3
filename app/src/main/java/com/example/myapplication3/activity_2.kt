package com.example.myapplication3

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity

class activity_2: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)

        setContentView(R.layout.activity_2)
        //setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        //setContentView(R.layout.activity_2)
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