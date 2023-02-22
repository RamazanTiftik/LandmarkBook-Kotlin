package com.example.landmarkbookkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.landmarkbookkotlin.databinding.ActivityDetailsBinding
import com.example.landmarkbookkotlin.databinding.ActivityMainBinding

class DetailsActivity : AppCompatActivity() {
    private lateinit var binding : ActivityDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityDetailsBinding.inflate(layoutInflater)
        val view=binding.root
        setContentView(view)

        //intent
        val intent=intent
        val landmark=intent.getSerializableExtra("landmark") as Landmark

        //edits
        binding.landmarkName.text="Name: "+landmark.name
        binding.landmarkCountry.text="Country: "+landmark.country
        binding.imageView.setImageResource(landmark.image)
    }
}