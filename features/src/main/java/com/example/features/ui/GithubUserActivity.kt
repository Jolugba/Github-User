package com.example.features.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.features.databinding.ActivityGithubUserBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class GithubUserActivity : AppCompatActivity() {

    private lateinit var binding: ActivityGithubUserBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGithubUserBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}