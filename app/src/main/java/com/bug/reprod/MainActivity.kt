package com.bug.reprod

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bug.reprod.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        binding.included.textView
    }
}
