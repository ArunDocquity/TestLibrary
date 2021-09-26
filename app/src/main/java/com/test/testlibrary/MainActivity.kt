package com.test.testlibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.test.loglib.DCLogger

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        DCLogger.logDebug("TESTING")

    }
}