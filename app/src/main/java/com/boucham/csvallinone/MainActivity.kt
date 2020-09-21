package com.boucham.csvallinone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.boucham.csvallinone.main.ui.FragmentMain
import com.boucham.csvallinone.main.ui.FragmentSettings

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val fragmentMain = FragmentMain()
        val fragmentSettings = FragmentSettings()

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flFragment, fragmentSettings)
            commit()
        }

    }
}