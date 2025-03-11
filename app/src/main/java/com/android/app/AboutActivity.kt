package com.android.app

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class AboutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        // Mendapatkan referensi ke ImageView (sebagai tombol)
        val btnBack: ImageView = findViewById(R.id.back)

        // Menetapkan OnClickListener pada ImageView
        btnBack.setOnClickListener {
            // Membuat intent untuk kembali ke MainActivity
            val intentBack = Intent(this, MainActivity::class.java)
            startActivity(intentBack)
            finish() // Menutup AboutActivity
        }
    }
}
