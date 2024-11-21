package id.netra.netraai.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import id.netra.netraai.ui.about.AboutFragment
import id.netra.netraai.ui.home.HomeFragment
import java.lang.IllegalArgumentException

class ViewPagerAdapter (fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int = 2

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> HomeFragment()
            1 -> AboutFragment()
            else -> throw IllegalArgumentException("Invalid Position")
        }
    }
}