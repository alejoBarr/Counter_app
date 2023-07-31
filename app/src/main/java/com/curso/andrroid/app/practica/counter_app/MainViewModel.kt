package com.curso.andrroid.app.practica.counter_app
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    fun compareStrings(str1: String, str2: String): Boolean {
        return str1 == str2
    }
}
