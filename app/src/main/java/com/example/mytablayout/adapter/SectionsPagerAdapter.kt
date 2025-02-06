package com.example.mytablayout.adapter

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.mytablayout.fragment.HomeFragment

class SectionsPagerAdapter(activity: AppCompatActivity): FragmentStateAdapter(activity) {

    // Fungsi createFragment digunakan untuk menampilkan fragment
    // sesuai dengan posisi tab-nya
    override fun createFragment(position: Int): Fragment {
        val fragment = HomeFragment()
        fragment.arguments = Bundle().apply {
            putInt(HomeFragment.ARG_SECTON_NUMBER, position + 1)
        }
        return fragment
    }

    // Fungsi getItemCount digunakan untuk menentukan jumlah tab yang ingin ditampilkan.
    // Pastikan bahwa jumlah yang ditampilkan sesuai dengan Fragment yang didefinisikan
    // oleh fungsi createFragment!!
    override fun getItemCount(): Int {
        return 3
    }
}