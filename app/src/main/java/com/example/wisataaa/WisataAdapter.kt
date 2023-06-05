package com.example.wisataaa

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class WisataAdapter(private val wisataList: ArrayList<Wisata>, private val listener: (Wisata) -> Unit)
    : RecyclerView.Adapter<WisataAdapter.WisataViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WisataViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_wisata, parent, false)
        return WisataViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: WisataViewHolder, position: Int) {
        val currentItem = wisataList[position]

        holder.imageView.setImageResource(currentItem.imageWisata)
        holder.titleMovie.text = currentItem.titleWisata
        holder.descMovie.text = currentItem.descWisata

        holder.itemView.setOnClickListener {
            listener(currentItem)
        }
    }

    override fun getItemCount(): Int {
        return wisataList.size
    }

    inner class WisataViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.iv_img)
        val titleMovie: TextView = itemView.findViewById(R.id.tv_title)
        val descMovie: TextView = itemView.findViewById(R.id.tv_desc)
    }
}
