package com.supremesir.viewpagerdemo

import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

/**
 * @author HaoFan Fang
 * @date 2020/5/6 16:05
 */

class MyFragmentStateAdapter(fragmentActivity: FragmentActivity) :
    FragmentStateAdapter(fragmentActivity) {

    override fun getItemCount() = 3

    override fun createFragment(position: Int) =
        when (position) {
            0 -> ScaleFragment()
            1 -> RotateFragment()
            else -> TranslateFragment()
        }
}
