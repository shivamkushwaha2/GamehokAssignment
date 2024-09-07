package com.insoft.gamehokassignment

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.viewpager.widget.ViewPager
import com.tbuonomo.viewpagerdotsindicator.DotsIndicator

class MainActivity : AppCompatActivity() {
    lateinit var viewPager: ViewPager
    lateinit var dot1: DotsIndicator
    lateinit var viewAdapter: bannerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }
        viewPager=findViewById(R.id.view_pager);
        dot1=findViewById(R.id.dot1);

        viewAdapter= bannerAdapter(this);
        viewPager.adapter = viewAdapter
        dot1.setViewPager(viewPager);

    }
}