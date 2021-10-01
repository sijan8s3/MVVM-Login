package com.sijanneupane.mvvmlogin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager.widget.ViewPager
import com.sijanneupane.mvvmlogin.R
import com.sijanneupane.mvvmlogin.adapter.ViewPagerAdapter
import com.sijanneupane.mvvmlogin.data.network.Api
import com.sijanneupane.mvvmlogin.data.repository.BaseRepository
import com.sijanneupane.mvvmlogin.data.repository.TaskRepository
import com.sijanneupane.mvvmlogin.ui.auth.AuthViewModel
import com.sijanneupane.mvvmlogin.ui.base.ViewModelFactory
import com.sijanneupane.mvvmlogin.ui.home.task.TaskViewModel
import com.google.android.material.tabs.TabLayout

class NavigationActivity : AppCompatActivity() {

    lateinit var viewModel: TaskViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navigation)

        //val repository= TaskRepository(BuildApi::class.java)
        //val viewModelProviderFactory= ViewModelFactory(repository)
        //viewModel= TaskViewModel::class.java
        var viewPager = findViewById<ViewPager>(R.id.viewPager)
        var tabLayout = findViewById<TabLayout>(R.id.tabLayout)

        viewPager.adapter = ViewPagerAdapter(supportFragmentManager)
        tabLayout.setupWithViewPager(viewPager)




    }

}
