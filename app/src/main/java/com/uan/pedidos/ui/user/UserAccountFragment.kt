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

class UserAccountFragment : Fragment() {

    private lateinit var userAccViewModel: UserAccountViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        userAccViewModel =
            ViewModelProviders.of(this).get(UserAccountViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_signup, container, false)
        val textView: TextView = root.findViewById(R.id.text_gallery)
        userAccViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}