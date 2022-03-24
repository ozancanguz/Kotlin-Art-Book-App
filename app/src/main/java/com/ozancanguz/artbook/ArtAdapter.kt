package com.ozancanguz.artbook

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ArtAdapter(var artList:ArrayList<Art>): RecyclerView.Adapter<ArtAdapter.ViewHolder>(){



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArtAdapter.ViewHolder {
        val v= LayoutInflater.from(parent.context).inflate(R.layout.adapter_row,parent,false)

        return ViewHolder(v)

    }

    override fun onBindViewHolder(holder: ArtAdapter.ViewHolder, position: Int) {


        holder.adapterRow.text=artList.get(position).name

        holder.itemView.setOnClickListener{
            val intent=Intent(holder.itemView.context,DetailsActivity::class.java)
            holder.itemView.context.startActivity(intent)
            intent.putExtra("info","old")
            intent.putExtra("id",artList[position].id)
            holder.itemView.context.startActivity(intent)
        }







    }

    override fun getItemCount(): Int {
        return artList.size
    }

    inner class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){


        lateinit var adapterRow:TextView



        init{

           adapterRow=itemView.findViewById(R.id.adapterRow)




        }




    }
}