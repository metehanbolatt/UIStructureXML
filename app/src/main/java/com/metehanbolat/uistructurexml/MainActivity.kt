package com.metehanbolat.uistructurexml

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.metehanbolat.uistructurexml.databinding.ActivityMainBinding
import com.metehanbolat.uistructurexml.databinding.ButtonComponentBinding
import com.metehanbolat.uistructurexml.databinding.ImageFeaturesBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ButtonComponentBinding
    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ButtonComponentBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.myButton.setOnClickListener {
            println("Clicked")
        }
    }

}