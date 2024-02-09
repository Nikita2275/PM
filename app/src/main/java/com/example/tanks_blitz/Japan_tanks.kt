package com.example.tanks_blitz

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

class Japan_tanks : AppCompatActivity() {

    private lateinit var toolbar: Toolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.japan_tanks)
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT

        toolbar = findViewById(R.id.toolbar1)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Япония"
    }

    fun ClickItemNastr (item: MenuItem) {
        val intent = Intent(this@Japan_tanks,
            Setting::class.java)
        startActivity(intent)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.section_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.itemId == android.R.id.home) finish()
        return true
    }

    fun OnClickSTB1 (view: View) {
        val intent = Intent(this@Japan_tanks,
            Stb_1::class.java)
        startActivity(intent)
    }

    fun OnClickType71 (view: View) {
        val intent = Intent(this@Japan_tanks,
            Type_71::class.java)
        startActivity(intent)
    }

    fun OnClickHoRi (view: View) {
        val intent = Intent(this@Japan_tanks,
            Ho_Ri::class.java)
        startActivity(intent)
    }
}