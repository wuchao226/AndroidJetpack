package com.wuc.jetpack.ui.fragment.login

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.navOptions
import com.wuc.jetpack.R
import com.wuc.jetpack.common.BaseConstant
import kotlinx.android.synthetic.main.fragment_login_welcome.*

/**
 * @author:     wuchao
 * @date:       2019-07-17 15:35
 * @desciption: 欢迎
 */
class LoginWelcomeFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_login_welcome, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btn_login.setOnClickListener {
            //设置动画参数
            val navOption = navOptions {
                anim {
                    enter = R.anim.slide_in_right
                    exit = R.anim.slide_out_left
                    popEnter = R.anim.slide_in_left
                    popExit = R.anim.slide_out_right
                }
            }
            val bundle = Bundle()
            bundle.putString(BaseConstant.ARGS_NAME, "wu")
            findNavController().navigate(R.id.loginFragment, bundle, navOption)
        }
        btn_register.setOnClickListener {
            // 利用SafeArgs传递参数
            val action = LoginWelcomeFragmentDirections
                .actionWelcomeFragmentToRegisterFragment()
                .setEMAIL("wu5@Gamil.com")
            findNavController().navigate(action)
        }
    }
}