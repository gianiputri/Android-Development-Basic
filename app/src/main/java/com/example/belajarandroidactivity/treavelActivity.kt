package com.example.belajarandroidactivity

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class treavelActivity : AppCompatActivity() {
    var ibCall : ImageButton? = null
    var ibNavigate : ImageButton? = null
    var ibShare : ImageButton? = null

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_treavel)

        ibCall = findViewById(R.id.ibCall)
        ibNavigate = findViewById(R.id.ibNavigate)
        ibShare = findViewById(R.id.ibShare)

        ibCall!!.setOnClickListener{
            val numberphone = "0881025213157"
            val phoneintent = Intent(Intent.ACTION_DIAL, Uri.parse("tel : $numberphone"))

            startActivity(phoneintent)
        }

        ibNavigate!!.setOnClickListener{
                val mapIntent = Intent (Intent.ACTION_VIEW,
                    Uri.parse("geo:48.85891378321601, 2.2944810741643797")
                )
            mapIntent.setPackage("com.google.android.apps.maps")
            startActivity(mapIntent)
        }


    }
}