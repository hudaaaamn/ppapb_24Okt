package com.example.ppapb_24okt;

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ppapb_24okt.HomeFragment
import com.example.ppapb_24okt.MainActivity
import com.example.ppapb_24okt.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Mendapatkan referensi ke tombol "login_btn" menggunakan ViewBinding
        val loginButton = binding.loginBtn

        // Menambahkan listener klik ke tombol "login_btn"
        loginButton.setOnClickListener {
            // Ketika tombol diklik, kita akan pindah ke Activity lain (activity_main)
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
