package com.sudip.foodrunner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem

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