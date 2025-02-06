package com.example.mytablayout.adapter

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.mytablayout.fragment.HomeFrament
import com.example.mytablayout.fragment.ProfileFragment

class SectionsPagerAdapter(activity: AppCompatActivity): FragmentStateAdapter(activity) {
    // Fungsi getItemCount digunakan untuk menentukan jumlah tab yang ingin ditampilkan.
    // Pastikan bahwa jumlah yang ditampilkan sesuai dengan Fragment yang didefinisikan
    // oleh fungsi createFragment!!
    override fun getItemCount(): Int {
        return 2
    }

    // Fungsi createFragment digunakan untuk menampilkan fragment
    // sesuai dengan posisi tab-nya
    override fun createFragment(position: Int): Fragment {
        var fragment : Fragment? = null
        when (position) {
            0 -> fragment = HomeFrament()
            1 -> fragment = ProfileFragment()
        }
        return fragment as Fragment
    }
}