package com.example.androiddesignpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //yazılım kısmında R harfi res klasörünü temsil eder
        // Xml kısmında @ işareti res klasörünü temsil eder
    }
}