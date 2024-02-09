package com.example.tanks_blitz


import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

class Garmeny_Tanks : AppCompatActivity() {

    private lateinit var toolbar: Toolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.garmeny_tanks)
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT

        toolbar = findViewById(R.id.toolbar1)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Германия"
    }

    fun ClickItemNastr (item: MenuItem) {
        val intent = Intent(this@Garmeny_Tanks,
            Setting::class.java)
        startActivity(intent)
    }

    fun OnClickE50 (view: View) {
        val intent = Intent(this@Garmeny_Tanks,
            E50M::class.java)
        startActivity(intent)
    }

    fun OnClickE100 (view: View) {
        val intent = Intent(this@Garmeny_Tanks,
            E_100::class.java)
        startActivity(intent)
    }

    fun OnClickVk7201 (view: View) {
        val intent = Intent(this@Garmeny_Tanks,
            Vk_7201_K::class.java)
        startActivity(intent)
    }

    fun OnClickJg_Pz_E100 (view: View) {
        val intent = Intent(this@Garmeny_Tanks,
            Jg_Pz_E100::class.java)
        startActivity(intent)
    }

    fun OnClickGrile (view: View) {
        val intent = Intent(this@Garmeny_Tanks,
            Grile::class.java)
        startActivity(intent)
    }

    fun OnClickMouse (view: View) {
        val intent = Intent(this@Garmeny_Tanks,
            Mause::class.java)
        startActivity(intent)
    }

    fun OnClickLeo (view: View) {
        val intent = Intent(this@Garmeny_Tanks,
            Leopard_1::class.java)
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
}