package com.example.opopo

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.opopo.databinding.ActivityMainBinding
import com.example.opopo.databinding.HohaBinding

class Activ : RecyclerView.Adapter<RecyclerViewHolder>() {
    private val list = mutableListOf<String>()

    fun AddValues (value : String ) {
        list.add(value)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {
        val binding = ItemLayoutBinding.inflate(LayouteInflater.from(parrent.context))
        return RecyclerViewHolder(binding)
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {
        holder.bind(list[position])
    }

}

class RecyclerViewHolder (private val binding: HohaBinding):
        RecyclerView.ViewHolder (binding.root){
            fun bind()

        }