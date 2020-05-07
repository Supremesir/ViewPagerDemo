package com.supremesir.viewpagerdemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewPager2.adapter = MyFragmentStateAdapter(this)

        // Kotlin 如果一个函数最后一个参数是 Lambda，可以将其写在括号外
        TabLayoutMediator(tabLayout, viewPager2) { tab, position ->
            when (position) {
                0 -> tab.text = applicationContext.resources.getText(R.string.scale_text)
                1 -> tab.text = applicationContext.resources.getText(R.string.rotate_text)
                else -> tab.text = applicationContext.resources.getText(R.string.translate_text)
            }
        }.attach()
    }
}
