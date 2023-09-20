package com.example.belajarandroidactivity.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.belajarandroidactivity.R
import com.example.belajarandroidactivity.model.DoaHarian

class DoaHarianAdapter (val data:ArrayList<DoaHarian>)
    : RecyclerView.Adapter
<DoaHarianAdapter.DoaHarianViewHolder>()
{
    class DoaHarianViewHolder (view:View)
        :RecyclerView.ViewHolder(view){
            val tvjudulDoa:TextView=view.findViewById(R.id.tvjudulDoa)
            val tvdoaArab:TextView=view.findViewById(R.id.tvdoaArab)
            val tvdoaLatin:TextView=view.findViewById(R.id.tvdoaLatin)
            val ibCollepse: ImageButton=view.findViewById(R.id.ibColspsep)
            val rllsiDoa: RelativeLayout = view.findViewById(R.id.rlisiDoa)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DoaHarianViewHolder {
       val view = LayoutInflater.from(parent.context)
           .inflate(R.layout.item_doa_harian,parent,false)
        return DoaHarianViewHolder(view)
    }

    override fun onBindViewHolder(holder: DoaHarianViewHolder, position: Int) {
        val item = data.get(position)
        holder.tvjudulDoa.text=item.judul
        holder.tvdoaArab.text=item.textArab
        holder.tvdoaLatin.text=item.textLatin

        holder.ibCollepse.setOnClickListener{
                if (holder.rllsiDoa.visibility == View.GONE){
                    holder.rllsiDoa.visibility = View.VISIBLE
                    holder.ibCollepse.setBackgroundResource(R.drawable.baseline_keyboard_arrow_down_24)
                }else{
                    holder.rllsiDoa.visibility = View.GONE
                    holder.ibCollepse.setBackgroundResource(R.drawable.baseline_keyboard_arrow_right_24)
                }
        }
    }

    override fun getItemCount(): Int = data.size

}