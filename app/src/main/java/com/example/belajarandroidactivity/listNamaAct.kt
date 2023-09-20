package com.example.belajarandroidactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class listNamaAct : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_nama)
// define array adapter
        val arrayAdapter: ArrayAdapter<*>
        val users = arrayOf(
            "Steve smath","Ross taylor","Rohit sharm"
        )

//        deklarasi variable
        var mListView: ListView = findViewById(R.id.lvNama)
//         panggil objek array adapter(this,
        arrayAdapter = ArrayAdapter(this,
            android.R.layout.simple_list_item_1,
            users)
//        isi adapter
        mListView.adapter = arrayAdapter

    }
}