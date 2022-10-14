package com.metehanbolat.uistructurexml

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.metehanbolat.uistructurexml.databinding.CalorieCounterUiBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: CalorieCounterUiBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = CalorieCounterUiBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
}