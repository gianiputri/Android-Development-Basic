package com.example.belajarandroidactivity.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.belajarandroidactivity.R
import com.example.belajarandroidactivity.model.Language

class LanguageAdapter (val data: ArrayList<Language>)
    : RecyclerView.Adapter<LanguageAdapter.languageViewHolder>()

{
    class languageViewHolder(view: View ) :
    RecyclerView.ViewHolder(view)    {
        val tvBahasaPemrograman: TextView = view.findViewById(R.id.tvBahasaPemrograman)
        val ivBahasaPemrograman: ImageView = view.findViewById(R.id.ivBahasapemrograman)}

    @SuppressLint("SuspiciousIndentation")
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): languageViewHolder {
      val view = LayoutInflater.from(parent.context)
          .inflate(R.layout.item_bahasa_pemrograman2,parent,false)
        return languageViewHolder(view)
    }

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: languageViewHolder, position: Int) {
        val item = data.get(position)
        ///isi data dari model language ke masing masing view
        holder.tvBahasaPemrograman.text=item.name
        holder.ivBahasaPemrograman.setImageResource(item.image)
    }
}