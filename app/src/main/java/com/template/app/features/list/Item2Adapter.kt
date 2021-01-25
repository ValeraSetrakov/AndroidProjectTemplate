package com.template.app.features.list

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.template.screen_marvel.databinding.Item2Binding

class Item2Adapter(
    private val items: List<Item2>
) : RecyclerView.Adapter<Item2Adapter.Item2ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Item2ViewHolder {
        val binding = Item2Binding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return Item2ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: Item2ViewHolder, position: Int) {
        val item = items[position]
        holder.bind(item)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    inner class Item2ViewHolder(
        private val binding: Item2Binding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(item: Item2) {
            binding.titleTv.text = item.title
            binding.messageTv.text = item.message
        }
    }
}

data class Item2(
    val title: CharSequence,
    val message: CharSequence
)
