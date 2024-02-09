package com.example.tanks_blitz

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

class China_tanks : AppCompatActivity() {

    private lateinit var toolbar: Toolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.china_tanks)
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT

        toolbar = findViewById(R.id.toolbar1)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Китай"
    }

    fun ClickItemNastr (item: MenuItem) {
        val intent = Intent(this@China_tanks,
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

    fun OnClickWZ1321 (view: View) {
        val intent = Intent(this@China_tanks,
            Wz_132_1::class.java)
        startActivity(intent)
    }

    fun OnClickWZ121 (view: View) {
        val intent = Intent(this@China_tanks,
            Wz_121::class.java)
        startActivity(intent)
    }

    fun OnClickWZ113 (view: View) {
        val intent = Intent(this@China_tanks,
            Wz_113::class.java)
        startActivity(intent)
    }
    fun OnClickWZ113G (view: View) {
        val intent = Intent(this@China_tanks,
            Wz_113G::class.java)
        startActivity(intent)
    }
}