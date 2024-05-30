package com.example.unitconverter1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.unitconverter1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)

        val length = findViewById<Button>(R.id.btnlength)
        val area = findViewById<Button>(R.id.btnarea)
        val weight = findViewById<Button>(R.id.btnweight)
        val volume = findViewById<Button>(R.id.btnvolume)
        val temp = findViewById<Button>(R.id.btntemp)
        val timer = findViewById<Button>(R.id.btntimer)
        val speed = findViewById<Button>(R.id.btnspeed)
        val data = findViewById<Button>(R.id.btndata)
        val cook = findViewById<Button>(R.id.btncook)

        length.setOnClickListener {
            val intent = Intent(this,length_main::class.java)
            startActivity(intent)
        }

        area.setOnClickListener {
            val intent = Intent(this,area_main::class.java)
            startActivity(intent)
        }

        weight.setOnClickListener {
            val intent = Intent(this,weight_main::class.java)
            startActivity(intent)
        }

        volume.setOnClickListener {
            val intent = Intent(this,volume_main::class.java)
            startActivity(intent)
        }

        temp.setOnClickListener {
            val intent = Intent(this,temp_main::class.java)
            startActivity(intent)
        }

        timer.setOnClickListener {
            val intent = Intent(this,timer_main::class.java)
            startActivity(intent)
        }

        speed.setOnClickListener {
            val intent = Intent(this,speed_main::class.java)
            startActivity(intent)
        }

        data.setOnClickListener {
            val intent = Intent(this,data_main::class.java)
            startActivity(intent)
        }

        cook.setOnClickListener {
            val intent = Intent(this,cook_main::class.java)
            startActivity(intent)
        }

    }
}