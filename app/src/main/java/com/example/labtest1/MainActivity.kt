package com.example.labtest1

import android.content.Intent
import android.media.Image
import android.net.Uri
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val browseAddress = findViewById<ImageButton>(R.id.webAddBtn)
        val webaddress = findViewById<TextView>(R.id.webAdd)

        val phoneNum = findViewById<TextView>(R.id.phoneNum)
        val phoneBtn = findViewById<ImageButton>(R.id.callBtn)

        browseAddress.setOnClickListener() {
            val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse(webaddress.text.toString()))
            startActivity(browserIntent)
        }

        phoneBtn.setOnClickListener() {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:+6" + phoneNum.text.toString())
            startActivity(intent)
        }
    }
}