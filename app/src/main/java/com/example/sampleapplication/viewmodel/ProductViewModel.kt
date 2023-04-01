package com.example.sampleapplication.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.sampleapplication.model.ProductsItem
import com.example.sampleapplication.repository.ProductRepository
import kotlinx.coroutines.launch
import javax.inject.Inject

class ProductViewModel @Inject constructor(private val productRepository: ProductRepository): ViewModel() {
    val productLiveData: LiveData<List<ProductsItem>>
    get() = productRepository.products

    fun getProducts(){
        viewModelScope.launch {
            productRepository.getProducts()
        }
    }
}