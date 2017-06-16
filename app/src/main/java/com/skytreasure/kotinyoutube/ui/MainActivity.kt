package com.skytreasure.kotinyoutube.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.skytreasure.kotinyoutube.R
import com.skytreasure.kotinyoutube.adapter.HomeSwipeAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val adapter by lazy { HomeSwipeAdapter(supportFragmentManager,this) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewpager.adapter= adapter
        tablayout.setupWithViewPager(viewpager)
    }
}
