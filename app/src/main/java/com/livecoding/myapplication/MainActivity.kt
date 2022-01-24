package com.livecoding.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.CompositePageTransformer
import androidx.viewpager2.widget.MarginPageTransformer
import androidx.viewpager2.widget.ViewPager2
import com.livecoding.myapplication.databinding.ActivityMainBinding
import kotlin.math.abs

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    private val listProduct by lazy {
        getDummyClassInformation()
    }

    private val adapterItem by lazy {
        AdapterItemViewpager(listProduct)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initView()
    }

    private fun initView() {

        setupViewPager()

        binding.viewPagerItem.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback(){
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)

                binding.btnSeeDetails.setOnClickListener {
                    Toast.makeText(this@MainActivity, "GO TO DETAIL", Toast.LENGTH_SHORT).show()
                }
            }
        })
    }

    private fun setupViewPager() {
        binding.viewPagerItem.adapter = adapterItem

        binding.viewPagerItem.clipToPadding = false
        binding.viewPagerItem.clipChildren = false
        binding.viewPagerItem.offscreenPageLimit = 10
        binding.viewPagerItem.getChildAt(0).overScrollMode = RecyclerView.OVER_SCROLL_NEVER

        val compose = CompositePageTransformer()
        compose.addTransformer(MarginPageTransformer(40))
        compose.addTransformer { page, position ->
            val r: Float = 1 - abs(position)
            page.scaleY = 0.85f + r * 0.15f
        }
        binding.viewPagerItem.setPageTransformer(compose)

        binding.indicatorViewPager.setViewPager2(binding.viewPagerItem)
    }
}