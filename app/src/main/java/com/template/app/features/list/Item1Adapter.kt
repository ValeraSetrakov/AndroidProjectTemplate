package com.template.app.features.list

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.template.screen_marvel.databinding.Item1Binding

class Item1Adapter(
    private val items: List<Item1>
) : RecyclerView.Adapter<Item1Adapter.Item1ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Item1ViewHolder {
        val binding = Item1Binding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return Item1ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: Item1ViewHolder, position: Int) {
        val item = items[position]
        holder.bind(item)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    inner class Item1ViewHolder(
        private val binding: Item1Binding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(item: Item1) {
            binding.titleTv.text = item.title
        }
    }
}

data class Item1(val title: CharSequence)
