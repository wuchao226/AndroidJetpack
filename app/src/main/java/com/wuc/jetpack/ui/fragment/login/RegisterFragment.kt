package com.wuc.jetpack.ui.fragment.login

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.wuc.jetpack.R
import kotlinx.android.synthetic.main.fragment_register.*

/**
 * @author:     wuchao
 * @date:       2019-07-17 15:35
 * @desciption: 注册
 */
class RegisterFragment:Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_register, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val safeArgs:RegisterFragmentArgs by navArgs()
        val email = safeArgs.email
        et_email.setText(email)
        tv_cancel.setOnClickListener {
            findNavController().popBackStack()
        }
    }
}