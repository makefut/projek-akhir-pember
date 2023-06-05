package com.example.wisataaa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailWisataActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_wisata)

        supportActionBar?.apply {
            setDisplayHomeAsUpEnabled(true)
        }

        val wisata = intent.getParcelableExtra<Wisata>(DetailFragment.INTENT_PARCELABLE)


        val imageWisata = findViewById<ImageView>(R.id.img_item_photo)
        val titleWisata = findViewById<TextView>(R.id.tv_item_name)
        val descWisata = findViewById<TextView>(R.id.tv_item_description)

        wisata?.let {
            imageWisata.setImageResource(it.imageWisata)
            titleWisata.text = it.titleWisata
            descWisata.text = it.descWisata
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
