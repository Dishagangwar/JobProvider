package com.example.jobprovider

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.jobprovider.databinding.ActivitySplashScreenBinding
import java.util.Spliterator.OfLong

@SuppressLint("CustomSplashScreen")
class SplashScreen : AppCompatActivity() {
    private lateinit var binding: ActivitySplashScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivitySplashScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.image.alpha= 0f
        binding.image.animate().setDuration(1500).alpha(1f).withEndAction({
            startActivity(Intent(this@SplashScreen,MainActivity::class.java))
            overridePendingTransition(androidx.appcompat.R.anim.abc_fade_in,androidx.appcompat.R.anim.abc_fade_out)
            finish()
        })
    }
}