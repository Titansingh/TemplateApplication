package com.example.templateapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.shrikanthravi.customnavigationdrawer2.data.MenuItem
import com.shrikanthravi.customnavigationdrawer2.widget.SNavigationDrawer
import java.lang.Exception
import java.util.ArrayList


class MainActivity : AppCompatActivity() {
    var sNavigationDrawer: SNavigationDrawer? = null
    var color1 = 0
    var fragmentClass: Class<*>? = null
    var fragment: Fragment? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (supportActionBar != null) {
            supportActionBar!!.hide()
        }
        sNavigationDrawer = findViewById(R.id.navigationDrawer)
        val menuItems: MutableList<MenuItem> = ArrayList()
        menuItems.add(MenuItem("News", R.drawable.news_bg))
        menuItems.add(MenuItem("Feed", R.drawable.feed_bg))
        menuItems.add(MenuItem("Messages", R.drawable.message_bg))
        menuItems.add(MenuItem("Music", R.drawable.music_bg))
        sNavigationDrawer?.setMenuItemList(menuItems)


//
//        sNavigationDrawer?.setOnMenuItemClickListener(SNavigationDrawer.OnMenuItemClickListener { position ->
//            println("Position $position")
//            when (position) {
//                0 -> {
//                    color1 = R.color.red
//                    fragmentClass = NewsFragment::class.java
//                }
//                1 -> {
//                    color1 = R.color.orange
//                    fragmentClass = FeedFragment::class.java
//                }
//                2 -> {
//                    color1 = R.color.green
//                    fragmentClass = MessagesFragment::class.java
//                }
//                3 -> {
//                    color1 = R.color.blue
//                    fragmentClass = MusicFragment::class.java
//                }
//            }
//            sNavigationDrawer?.setDrawerListener(object : SNavigationDrawer.DrawerListener {
//                override fun onDrawerOpened() {}
//                override fun onDrawerOpening() {}
//                override fun onDrawerClosing() {
//                    println("Drawer closed")
//
//                }
//
//                override fun onDrawerClosed() {}
//                override fun onDrawerStateChanged(newState: Int) {
//                    println("State $newState")
//                }
//            })
//        })


    }}

