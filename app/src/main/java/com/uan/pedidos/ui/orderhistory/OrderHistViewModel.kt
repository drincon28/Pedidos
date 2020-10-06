package com.uan.pedidos.ui.orderhistory

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class OrderHistViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is order history Fragment"
    }
    val text: LiveData<String> = _text
}