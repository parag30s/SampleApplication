package com.example.sampleapplication.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.sampleapplication.repository.ProductRepository
import javax.inject.Inject

class ViewModelFactory @Inject constructor (private val productRepository: ProductRepository) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return ProductViewModel(productRepository) as T
    }
}