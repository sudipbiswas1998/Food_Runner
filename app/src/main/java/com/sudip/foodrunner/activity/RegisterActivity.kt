package com.sudip.foodrunner.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sudip.foodrunner.R

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        title = "Register Yourself"
        var actionBar = supportActionBar

        // showing the back button in action bar
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true)
        }

    }

}