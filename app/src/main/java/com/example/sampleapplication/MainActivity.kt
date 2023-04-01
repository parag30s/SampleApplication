package com.example.sampleapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.sampleapplication.viewmodel.ProductViewModel
import com.example.sampleapplication.viewmodel.ViewModelFactory
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    lateinit var productViewModel: ProductViewModel

    @Inject
    lateinit var viewModelFactory: ViewModelFactory

    private val textView: TextView
    get() = findViewById(R.id.textView)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        (application as SampleApplication).applicationComponent.inject(this)

        productViewModel = ViewModelProvider(this, viewModelFactory).get(ProductViewModel::class.java)

        productViewModel.getProducts()

        productViewModel.productLiveData.observe(this, Observer {
            textView.text = it.joinToString { x -> x.title + "\n \n" }
        })
    }
}