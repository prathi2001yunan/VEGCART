package com.example.vegcart

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.denzcoskun.imageslider.interfaces.ItemClickListener
import com.example.vegcart.databinding.Recycle1Binding

class Recycle1(val listn:List<Data1>,val listener:ItemClickListener): RecyclerView.Adapter<Recycle1.MainAdapter>() {



    inner class MainAdapter(var unitbinding: View): RecyclerView.ViewHolder(unitbinding),View.OnClickListener {
        var num1 = unitbinding.findViewById<ImageView>(R.id.img1)
        var nam1 = unitbinding.findViewById<TextView>(R.id.textView4)
        var nam2 = unitbinding.findViewById<TextView>(R.id.textView5)

        var nam3 = unitbinding.findViewById<TextView>(R.id.textView6)
        init {
            unitbinding.setOnClickListener(this)
        }
        override fun onClick(p0: View?) {
            var position = adapterPosition
            if(position!=RecyclerView.NO_POSITION) {
                listener.getOn(position)
            }
        }

    }
        interface ItemClickListener{
            fun getOn(position: Int)
        }






    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainAdapter {
        return MainAdapter(LayoutInflater.from(parent.context).inflate(R.layout.recycle1,parent,false))
    }

    override fun getItemCount(): Int {
        return listn.size
    }

    override fun onBindViewHolder(holder: MainAdapter, position: Int) {
        val act = listn[position]

        holder.nam1.setText(act.nam)
        holder.nam2.setText(act.nam2)
        holder.nam3.setText(act.nam3)
        holder.num1.setImageResource(act.num)


    }

}
