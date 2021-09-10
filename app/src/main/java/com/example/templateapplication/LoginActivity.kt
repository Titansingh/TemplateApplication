package com.example.templateapplication

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val tabLayout = findViewById<TabLayout>(R.id.tab_layout)
        val viewPager2 = findViewById<ViewPager2>(R.id.view_pager)
        val fab_fb = findViewById<FloatingActionButton>(R.id.fab_facebook)
        val fab_google = findViewById<FloatingActionButton>(R.id.fab_google)
        val fab_twitter = findViewById<FloatingActionButton>(R.id.fab_twitter)

        val adapter = ViewPagerAdapter(supportFragmentManager, lifecycle)
        viewPager2.adapter = adapter
        TabLayoutMediator(tabLayout, viewPager2) { tab, position ->
            when (position) {
                0 -> tab.text = "login"
                1 -> tab.text = "signup"

            }
        }.attach()

        tabLayout.animate().translationX(265F).alpha(1F).setDuration(0).setStartDelay(0).start()
//        fab_fb.setAlpha(0)
//        fab_google.setAlpha(0)
//        fab_twitter.setAlpha(0)

        fab_fb.animate().translationY(-265F).alpha(1F).setDuration(1000).setStartDelay(400).start()
        fab_google.animate().translationY(-265F).alpha(1F).setDuration(1000).setStartDelay(400)
            .start()
        fab_twitter.animate().translationY(-265F).alpha(1F).setDuration(1000).setStartDelay(400)
            .start()
        tabLayout.animate().translationX(0F).alpha(1F).setDuration(1000).setStartDelay(400).start()

//        fab_google.setOnClickListener {
//            val intent = Intent(this, MainActivity::class.java).apply {
//
//            }
//            startActivity(intent)
//        }
    }

    fun buttonogin(view: android.view.View) {

        val intent = Intent(this, MainActivity::class.java).apply {

        }
        startActivity(intent)
    }


}



