package com.example.landmarkbookkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.landmarkbookkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    private lateinit var landmarkList: ArrayList<Landmark>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        val view=binding.root
        setContentView(view)

        landmarkList= ArrayList<Landmark>()

        //datas
        val colosseum= Landmark("Colosseum","Italy",R.drawable.colosseum)
        val eiffel=Landmark("Eiffel","France",R.drawable.eiffel)
        val londonBridge=Landmark("London Bridge","United Kingdom",R.drawable.london_bridge)
        val pisa=Landmark("Pisa Tower","Italy",R.drawable.pisa)
        val pyramides=Landmark("Pyramides","Egypt",R.drawable.pyramides)
        val statueOfLiberty=Landmark("Statue of Liberty","USA",R.drawable.statue_of_liberty)
        val greatWall=Landmark("The Great Wall of China","China",R.drawable.the_great_wall_of_china)
        landmarkList.add(colosseum)
        landmarkList.add(eiffel)
        landmarkList.add(londonBridge)
        landmarkList.add(pisa)
        landmarkList.add(pyramides)
        landmarkList.add(statueOfLiberty)
        landmarkList.add(greatWall)


        //adapter: layout & data
        binding.recyclerView.layoutManager=GridLayoutManager(this,2)
        val adapter=LandmarkAdapter(landmarkList)
        binding.recyclerView.adapter=adapter


    }
}