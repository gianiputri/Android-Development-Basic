package com.example.belajarandroidactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashScreenAct : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        /// panggil object Handler dari package OS
        // postdelay untuk menjalanknan action ketika
        // waktu yang telah di tentukan selesai

        Handler().postDelayed({
            val intent = Intent(this,
                dashboardDoaActivity::class.java)
            startActivity(intent)
        },3000)
    }
}