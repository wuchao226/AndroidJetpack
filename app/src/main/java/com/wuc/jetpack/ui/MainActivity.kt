package com.wuc.jetpack.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.wuc.jetpack.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // 获取NavController
        val navController = findNavController(R.id.nav_host_fragment)
        // 把BottomNavigationView与NavController绑定。
        // 绑定后，当菜单项被选中时，会调用NavigationUI.onNavDestinationSelected(menuItem, navController)方法
        // 这里有个注意事项，上面创建菜单时有说明，下面手动绑定的注释也有说明
        // BottomNavigationView拥有setupWithNavController()方法，是因为Navigation组件依赖里对BottomNavigationView进行了扩展：
        // fun BottomNavigationView.setupWithNavController(navController: NavController) {
        //    NavigationUI.setupWithNavController(this, navController)
        // }
        navigation_view.setupWithNavController(navController)

        // 如果不用上面的方式，可以用下面的方式自己手动把菜单选中事件与Navigation的导航事件绑定
        /*navigation_view.setOnNavigationItemSelectedListener { menuItem ->
            // 导航到与menuItem菜单项关联的NavDestination，即与menu.xml中item的id相同的destinationId
            // destinationId即navigation/nav_graph.xml中fragment的id
            NavigationUI.onNavDestinationSelected(menuItem, navController)
        }*/
    }

}
