package com.example.belajarandroidactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class CountActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_count)

        val tvNumber: TextView = findViewById(R.id.tvNumber)
        val btnCount: Button = findViewById(R.id.btnCount)
        val btnReset: Button = findViewById(R.id.btnReset)
        val btnMinus: Button = findViewById(R.id.btnMinus)


      // panggil fungsi
      // set text & get Text
      // setText =  merubah fungsi text cukup panggil fungsi text

        tvNumber.text = "100"

        // getText = mengambil text

        println(tvNumber.text)
        Log.d("Number", "hasil nya: ${tvNumber.text}")

        // action
        btnCount.setOnClickListener{
            //ambil text lalu ubah ke string selanjutnya lagi ke int
            var countInt : Int = tvNumber.text.toString().toInt()
            countInt++

            tvNumber.text = countInt.toString()
        }

        btnReset.setOnClickListener{
            //ambil text lalu ubah ke string selanjutnya lagi ke int
            var countInt : Int = tvNumber.text.toString().toInt()
            countInt--

            tvNumber.text = countInt.toString()
        }

        btnMinus.setOnClickListener{
            //ambil text lalu ubah ke string selanjutnya lagi ke int
            var countInt : Int = tvNumber.text.toString().toInt()
            countInt=0
            tvNumber.text = countInt.toString()
        }




    }
}