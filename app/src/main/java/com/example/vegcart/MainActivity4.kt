package com.example.vegcart

import android.content.Intent
import android.media.MediaScannerConnection
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.vegcart.databinding.ActivityMain4Binding

class MainActivity4 : AppCompatActivity() {
    private var binding4:ActivityMain4Binding?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding4 = ActivityMain4Binding.inflate(layoutInflater)
        setContentView(binding4?.root)
        val intent1 = intent.getStringExtra("data")
        val intent2 = intent.getStringExtra("data2")
        val intent3 = intent.getStringExtra("data3")
        val intent4 = intent.getIntExtra("data4",0)

        binding4?.textView12?.setText(intent1)
        binding4?.textView11?.setText(intent2)
        binding4?.textView17?.setText(intent3)
        binding4?.imageView4?.setImageResource(intent4)
        if(intent1=="Ordinary Corn"){
            binding4?.destext?.setText("Corn is a tall annual cereal grass (Zea mays) that is widely grown for its large elongated ears of starchy seeds. The seeds, which are also known as corn, are used as food for humans and livestock and as a source of biofuel and can be processed into a wide range of useful chemicals.")

        }
        if(intent1=="Sweet Corn"){
            binding4?.destext?.setText("Sweet corn (Zea mays convar. saccharata var. rugosa; also called sweetcorn, sugar corn and pole corn) is a cereal with a high sugar content. Sweet corn is the result of a naturally occurring recessive mutation in the genes which control conversion of sugar to starch inside the ENO of the corn kernel.")
        }
        if(intent1=="Flint Corn"){
            binding4?.destext?.setText("Flint corn (Zea mays var. indurata; also known as Indian corn or sometimes calico corn) is a variant of maize, the same species as common corn. Because each kernel has a hard outer layer to protect the soft endosperm, it is likened to being hard as flint; hence the name.")
        }
        if(intent1=="Ordinary Potato"){
            binding4?.destext?.setText("Potato fruits are a succulent but inedible spherical, yellow-green berry, up to 4cm across. Underground, the edible root forms a tuber that can be a range of colours, sizes and shapes, depending on the cultivated variety (cultivar).")
        }
        if(intent1=="Sweet Potato"){
            binding4?.destext?.setText("Sweet potatoes are typically recognized by their copper-colored skin and vibrant orange flesh, though the hundreds of varieties grown worldwide display colors such as white, cream, yellow, reddish-purple, and deep purple")
        }
        if(intent1=="Salsa Potato"){
            binding4?.destext?.setText("A baked potato, known in some parts of the United Kingdom (though not generally Scotland) as a jacket potato,[1] is a preparation of potato. It may be served with fillings, toppings or condiments such as butter, cheese, sour cream, gravy, baked beans, and even ground meat or corned beef.")
        }
        if(intent1=="Ordinary Cabbage"){
            binding4?.destext?.setText("Cabbage is a cruciferous vegetable. A chemical in cabbage may protect against the negative effects of radiation.   The sulforaphane found in cabbage may help protect against cancer.")

        }
        if(intent1=="Green Cabbage" ){
            binding4?.destext?.setText("The green cabbage is a kind of cabbage, also known as Blaukraut after preparation. Its leaves are colored dark greed/yellow. However, the plant changes its color according to the pH value of the soil due to a pigment belonging to anthocyanins. ")

        }

        if(intent1=="Red Cabbage"){
            binding4?.destext?.setText("The red cabbage is a kind of cabbage, also known as Blaukraut after preparation. Its leaves are colored dark red/purple. However, the plant changes its color according to the pH value of the soil due to a pigment belonging to anthocyanins. ")
        }
 binding4?.imageView6?.setOnClickListener{
     onBackPressed()
 }








        var text = 0
        binding4?.rbutton1?.setOnClickListener{
            if(text == 0){
                binding4?.text1?.setText(text.toString())

            }
            if(text!=0){
                text = text-1
                binding4?.text1?.setText(text.toString())
            }
        }
        binding4?.rbutton2?.setOnClickListener{
            text = text+1
            binding4?.text1?.setText(text.toString())
        }
        binding4?.imageView7?.setOnClickListener{

            val share = Intent()
            val url = "https://ggogle.com"
            share.action=Intent.ACTION_SEND
            share.type="text/plain"
            share.putExtra("name",url)

            startActivity(Intent.createChooser(share,"Share"))
        }

    }

    }
