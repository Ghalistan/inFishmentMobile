package com.ghalistan.infishmentmobile.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.ghalistan.infishmentmobile.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val host = supportFragmentManager.findFragmentById(binding.navHostMain.id) as NavHostFragment
        val navController = host.navController
        binding.bnvMain.setupWithNavController(navController)
    }
}