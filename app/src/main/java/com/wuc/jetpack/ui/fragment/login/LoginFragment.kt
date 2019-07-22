package com.wuc.jetpack.ui.fragment.login

import android.os.Bundle
import android.text.TextUtils
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.wuc.jetpack.R
import com.wuc.jetpack.common.BaseConstant
import kotlinx.android.synthetic.main.fragment_login.*

/**
 * @author:     wuchao
 * @date:       2019-07-17 15:34
 * @desciption: 登录
 */
class LoginFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val name = arguments?.getString(BaseConstant.ARGS_NAME)
        if (!TextUtils.isEmpty(name)) {
            et_account.setText(name)
        }
        tv_cancel.setOnClickListener {
            findNavController().navigateUp()
        }
    }
}