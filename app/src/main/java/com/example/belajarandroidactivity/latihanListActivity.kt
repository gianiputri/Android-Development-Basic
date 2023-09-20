package com.example.belajarandroidactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class latihanListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_latihan_list)

// define array adapter
        val arrayAdapter: ArrayAdapter<*>
        val users = arrayOf(
            "Phyton","c#","c++","JavaScrip","php","swift","java","sql","ruby"
        )

//        deklarasi variable
        var mListView: ListView = findViewById(R.id.rvProgram)
//         panggil objek array adapter(this,
        arrayAdapter = ArrayAdapter(this,
            android.R.layout.simple_list_item_1,
            users)
//        isi adapter
        mListView.adapter = arrayAdapter
    }

}
