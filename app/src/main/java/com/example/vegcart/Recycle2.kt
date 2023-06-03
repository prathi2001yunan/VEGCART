package com.example.vegcart

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.vegcart.databinding.Recycle2Binding

class Recycle2(val listn:List<Data2>): RecyclerView.Adapter<Recycle2.MainHolder>() {
    inner class MainHolder(val itembinding: Recycle2Binding): RecyclerView.ViewHolder(itembinding.root){
        var img = itembinding.img1

        }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainHolder {
        return MainHolder(Recycle2Binding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun getItemCount(): Int {
        return listn.size
    }

    override fun onBindViewHolder(holder: MainHolder, position: Int) {
        val model = listn[position]
        holder.img.setImageResource(model.num)
    }
}