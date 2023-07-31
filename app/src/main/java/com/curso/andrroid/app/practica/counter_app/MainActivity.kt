package com.curso.andrroid.app.practica.counter_app
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.curso.andrroid.app.practica.counter_app.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel = ViewModelProvider(this)[MainViewModel::class.java]

        binding.compareButton.setOnClickListener {
            val str1 = binding.editText1.text.toString()
            val str2 = binding.editText2.text.toString()
            val result = viewModel.compareStrings(str1, str2)

            binding.resultTextView.text = if (result) "Las cadenas son iguales" else "Las cadenas son diferentes"
        }
    }
}
