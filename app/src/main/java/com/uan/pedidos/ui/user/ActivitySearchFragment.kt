package com.uan.pedidos.ui.user

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.lifecycle.Observer
import com.uan.pedidos.R
import com.uan.pedidos.ui.signup.SignUpViewModel

class ActivitySearchFragment : Fragment() {

    private lateinit var actSearchViewModel: ActivitySearchViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        actSearchViewModel =
            ViewModelProviders.of(this).get(ActivitySearchViewModel::class.java)
        val root = inflater.inflate(R.layout.activity_search, container, false)
        val textView: TextView = root.findViewById(R.id.text_gallery)
        actSearchViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}