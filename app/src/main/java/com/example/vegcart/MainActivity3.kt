package com.example.vegcart

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SearchView
import com.example.vegcart.databinding.ActivityMain3Binding
import java.util.*
import kotlin.collections.ArrayList

class MainActivity3 : AppCompatActivity(),Recycle1.ItemClickListener {
    private var binding:ActivityMain3Binding?=null
    private var list5:ArrayList<Data1>?=null
    private var searchlist:ArrayList<Data1>?=null
    private var list6:Recycle1?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMain3Binding.inflate(layoutInflater)
        setContentView(binding?.root)
        list5 = ArrayList<Data1>()
        searchlist= ArrayList<Data1>()
        list5!!.add(Data1(R.drawable.corn1,"Ordinary Corn","$22.5","4.5(1K)"))
        list5!!.add(Data1(R.drawable.sweetcorn,"Sweet Corn","$32.5","4.5(31K)"))
        list5!!.add(Data1(R.drawable.flintcorn,"Flint Corn","$22.5","4.5(1K)"))
        list5!!.add(Data1(R.drawable.potato,"Ordinary Potato","$22.5","4.5(1K)"))
        list5!!.add(Data1(R.drawable.sweetpotato,"Sweet Potato","$32.5","4.5(31K)"))
        list5!!.add(Data1(R.drawable.salsa,"Salsa Potato","$22.5","4.5(1K)"))
        list5!!.add(Data1(R.drawable.ordinarycabbage,"Ordinary Cabbage","$22.5","4.5(1K)"))
        list5!!.add(Data1(R.drawable.greencabbage,"Green Cabbage","$32.5","4.5(31K)"))
        list5!!.add(Data1(R.drawable.redcabbage,"Red Cabbage","$22.5","4.5(1K)"))
        searchlist!!.addAll(list5!!)
        list6=Recycle1(searchlist!!,this)
        binding?.recycle?.adapter=list6

        binding?.search1?.queryHint="search here "
        binding?.search1?.isIconifiedByDefault=false
        binding?.search1?.setOnQueryTextListener(object:SearchView.OnQueryTextListener{
            override fun onQueryTextSubmit(p0: String?): Boolean {
                binding?.search1?.clearFocus()
                return true

            }

            override fun onQueryTextChange(p0: String?): Boolean {
                var search = p0!!.toLowerCase(Locale.getDefault())
                if(search.isNotEmpty()){
                    searchlist!!.clear()
                    list5!!.forEach {
                        if(it.nam.toLowerCase(Locale.getDefault()).contains(search)){
                            searchlist!!.add(it)
                        }
                    }
                    binding?.recycle?.adapter?.notifyDataSetChanged()

                }
                else{
                    searchlist!!.clear()
                    searchlist!!.addAll(list5!!)
                    binding?.recycle?.adapter?.notifyDataSetChanged()
                }
                return false

            }

        })


    }

    override fun getOn(position: Int) {
        val intent1 =Intent(this@MainActivity3,MainActivity4::class.java)
        intent1.putExtra("data",list5!![position].nam)
        intent1.putExtra("data2",list5!![position].nam2)
        intent1.putExtra("data3",list5!![position].nam3)
        intent1.putExtra("data4",list5!![position].num)
        startActivity(intent1)
    }

}