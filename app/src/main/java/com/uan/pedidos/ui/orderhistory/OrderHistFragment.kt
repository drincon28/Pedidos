package com.uan.pedidos.ui.orderhistory

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.uan.pedidos.R

class OrderHistFragment : Fragment() {

    private lateinit var orderhistViewModel: OrderHistViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        orderhistViewModel =
                ViewModelProviders.of(this).get(OrderHistViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_order_hist, container, false)
        val textView: TextView = root.findViewById(R.id.text_slideshow)
        orderhistViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}