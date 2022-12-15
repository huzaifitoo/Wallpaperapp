package com.example.wallpaperapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.wallpaperapp.Fragments.DownloadFragment
import com.example.wallpaperapp.Fragments.HomeFragment
import com.example.wallpaperapp.databinding.ActivityMainBinding


private lateinit var binding: ActivityMainBinding
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        replaceFragment(HomeFragment())

        binding.icHome.setOnClickListener {
            replaceFragment(HomeFragment())
        }
        binding.icDownload.setOnClickListener {
            replaceFragment(DownloadFragment())
        }

    }
    fun replaceFragment(fragment: Fragment){
        val transation =
        supportFragmentManager.beginTransaction()
        transation.replace(R.id.replacefragment,fragment).commit()
    }
}