package com.boucham.csvallinone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import androidx.viewpager.widget.ViewPager
import com.boucham.csvallinone.core.extends.SectionsPagerAdapter
import com.boucham.csvallinone.core.utils.rootFolder
import com.boucham.csvallinone.core.utils.scanAll
import com.boucham.csvallinone.main.ui.shared.DialogCustomListView
import com.google.android.material.tabs.TabLayout
import java.io.File

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sectionsPagerAdapter = SectionsPagerAdapter(this, supportFragmentManager)
        val viewPager: ViewPager = findViewById(R.id.view_pager)
        val tabs: TabLayout = findViewById(R.id.tabs)

        val animals = arrayOf("horse", "cow", "camel", "sheep", "goat")


        viewPager.adapter = sectionsPagerAdapter
        tabs.setupWithViewPager(viewPager)
        println("HEY HOY HEY HOY")


        val dialogCustom = DialogCustomListView(this, animals)
    }
}