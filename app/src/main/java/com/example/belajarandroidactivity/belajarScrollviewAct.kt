package com.example.belajarandroidactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.compose.ui.draw.BlurredEdgeTreatment
import com.bumptech.glide.Glide
import jp.wasabeef.glide.transformations.BlurTransformation

class belajarScrollviewAct : AppCompatActivity() {
    var ivDestination: ImageView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_belajar_scrollview)

        ivDestination = findViewById(R.id.ivDestination)

        Glide.with(this)
            .load(R.drawable.book)
            .transform(BlurTransformation(25,3))
            .into(ivDestination!!)
    }
}