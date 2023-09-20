package com.example.belajarandroidactivity

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.belajarandroidactivity.adapter.DoaAdapter
import com.example.belajarandroidactivity.model.Doa


        class dashboardDoaActivity : AppCompatActivity() {
            @SuppressLint("MissingInflatedId")
            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_dashboard_doa)
                val rvDoa: RecyclerView =
                    findViewById(R.id.rvdoa)
                val data = arrayListOf<Doa>(
                    Doa("Dzikir harian",R.drawable.doa_harian),
                    Doa("Dzikir dan doa sunnah setelah sholat ",R.drawable.doa_harian),
                    Doa("Dzikir setiap saat",R.drawable.doa_harian),
                    Doa("Dzikir pagi dan petang",R.drawable.doa_harian),

                )
                val adapter = DoaAdapter (data)
                rvDoa.adapter = adapter
                rvDoa.layoutManager=
                LinearLayoutManager(this,
                    LinearLayoutManager.VERTICAL,false)


                val cvSelangkapnya:CardView =
                    findViewById(R.id.cvSelangkapnya)

               cvSelangkapnya.setOnClickListener{
                   val intent = Intent (this, DoaHarianActivity::class.java)
                   (startActivity(intent))
               }
            }
        }

