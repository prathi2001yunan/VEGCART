package com.example.vegcart

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.get
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.vegcart.databinding.ActivityMain2Binding


class MainActivity2 : AppCompatActivity(),Recycle1.ItemClickListener {
    private var bind: ActivityMain2Binding? = null
    private var list5:ArrayList<Data1>?=null
    private var list6:Recycle1?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind= ActivityMain2Binding.inflate(layoutInflater)
        setContentView(bind?.root)
        bind?.recycle2?.layoutManager=LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        val list=ArrayList<Data2>()
        list.add(Data2(R.drawable.tomato))
        list.add(Data2(R.drawable.bedroot))
        list.add(Data2(R.drawable.carrot))
        val list1 = Recycle2(list)


        bind?.recycle2?.adapter=list1
        list5 = ArrayList<Data1>()
        list5!!.add(Data1(R.drawable.corn1,"Ordinary Corn","$22.5","4.5(1K)"))
        list5!!.add(Data1(R.drawable.sweetcorn,"Sweet Corn","$32.5","4.5(31K)"))
        list5!!.add(Data1(R.drawable.flintcorn,"Flint Corn","$22.5","4.5(1K)"))
        list6=Recycle1(list5!!,this)
        bind?.recycle1?.adapter=list6

        bind?.but1?.setOnClickListener{
            list5!!.clear()
            list5!!.add(Data1(R.drawable.corn1,"Ordinary Corn","$22.5","4.5(1K)"))
            list5!!.add(Data1(R.drawable.sweetcorn,"Sweet Corn","$32.5","4.5(31K)"))
            list5!!.add(Data1(R.drawable.flintcorn,"Flint Corn","$22.5","4.5(1K)"))
            list6=Recycle1(list5!!,this)
            bind?.recycle1?.adapter=list6



        }
        bind?.but2?.setOnClickListener{
            list5!!.clear()
            list5!!.add(Data1(R.drawable.potato,"Ordinary Potato","$22.5","4.5(1K)"))
            list5!!.add(Data1(R.drawable.sweetpotato,"Sweet Potato","$32.5","4.5(31K)"))
            list5!!.add(Data1(R.drawable.salsa,"Salsa Potato","$22.5","4.5(1K)"))
            list6=Recycle1(list5!!,this)
            bind?.recycle1?.adapter=list6


        }
        bind?.but3?.setOnClickListener{
            list5!!.clear()
            list5!!.add(Data1(R.drawable.ordinarycabbage,"Ordinary Cabbage","$22.5","4.5(1K)"))
            list5!!.add(Data1(R.drawable.greencabbage,"Green Cabbage","$32.5","4.5(31K)"))
            list5!!.add(Data1(R.drawable.redcabbage,"Red Cabbage","$22.5","4.5(1K)"))
            list6=Recycle1(list5!!,this)
            bind?.recycle1?.adapter=list6

        }
bind?.search?.setOnClickListener{
    startActivity(Intent(this,MainActivity3::class.java))
}



    }

    override fun getOn(position: Int) {
         val intent1 =Intent(this@MainActivity2,MainActivity4::class.java)
        intent1.putExtra("data",list5!![position].nam)
        intent1.putExtra("data2",list5!![position].nam2)
        intent1.putExtra("data3",list5!![position].nam3)
        intent1.putExtra("data4",list5!![position].num)
        startActivity(intent1)
    }
}