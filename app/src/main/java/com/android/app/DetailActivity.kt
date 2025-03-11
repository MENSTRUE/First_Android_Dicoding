package com.android.myrecyclerview

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.android.app.MainActivity
import com.android.app.R

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail_rider) // Set layout yang digunakan

        // Inisialisasi view dengan findViewById
        val imgPhoto: ImageView = findViewById(R.id.img_item_photo)
        val tvName: TextView = findViewById(R.id.tv_item_name)
        val tvDescription: TextView = findViewById(R.id.tv_item_description)
        val btnBack: ImageView = findViewById(R.id.back)

        // Ambil data dari Intent
        val heroName = intent.getStringExtra(EXTRA_NAME)
        val heroDescription = intent.getStringExtra(EXTRA_DESCRIPTION)
        val heroPhoto = intent.getIntExtra(EXTRA_PHOTO, 0)

        // Set data ke view
        tvName.text = heroName
        tvDescription.text = heroDescription
        imgPhoto.setImageResource(heroPhoto)

        // Set tindakan pada tombol Back
        btnBack.setOnClickListener {
            // Intent kembali ke MainActivity
            val intentBack = Intent(this, MainActivity::class.java)
            startActivity(intentBack)
            finish() // Menutup DetailActivity
        }
    }

    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_DESCRIPTION = "extra_description"
        const val EXTRA_PHOTO = "extra_photo"
    }
}
