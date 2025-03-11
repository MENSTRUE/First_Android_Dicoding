package com.android.app

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.android.myrecyclerview.DetailActivity
import com.android.myrecyclerview.Rider

class ListRiderAdapter(private val listRider: ArrayList<Rider>) : RecyclerView.Adapter<ListRiderAdapter.ListViewHolder>() {

    private var onItemClickCallBack: OnItemClickCallBack? = null

    fun setOnItemClickCallback(onItemClickCallBack: OnItemClickCallBack) {
        this.onItemClickCallBack = onItemClickCallBack
    }

    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
        val tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        val tvDescription: TextView = itemView.findViewById(R.id.tv_item_description)
    }

    interface OnItemClickCallBack {
        fun onItemClicked(data: Rider)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_row, parent, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int = listRider.size

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val (name, description, photo) = listRider[position]
        holder.imgPhoto.setImageResource(photo)
        holder.tvName.text = name
        holder.tvDescription.text = description

        // Klik untuk item
        holder.itemView.setOnClickListener {
            onItemClickCallBack?.onItemClicked(listRider[holder.adapterPosition])

            // Intent untuk membuka DetailActivity
            val intent = Intent(holder.itemView.context, DetailActivity::class.java).apply {
                putExtra(DetailActivity.EXTRA_NAME, name)
                putExtra(DetailActivity.EXTRA_DESCRIPTION, description)
                putExtra(DetailActivity.EXTRA_PHOTO, photo)
            }
            holder.itemView.context.startActivity(intent)
        }
    }
}
