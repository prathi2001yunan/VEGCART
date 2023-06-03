package com.example.vegcart

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel
import com.example.vegcart.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var bind: ActivityMainBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bind?.root)
        var list1 = ArrayList<SlideModel>()
        list1.add(SlideModel(R.drawable.slide2))
        list1.add(SlideModel(R.drawable.slide3))
        list1.add(SlideModel(R.drawable.slide4))
        list1.add(SlideModel(R.drawable.slide5))
        bind?.slide?.setImageList(list1, ScaleTypes.FIT)
        bind?.button1?.setOnClickListener{
            startActivity(Intent(this,MainActivity2::class.java))
            this@MainActivity.finish()
        }
    }
}