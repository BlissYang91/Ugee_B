package com.yutai.business.ugee.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.yutai.business.ugee.R
import com.yutai.business.ugee.databinding.ActivityMain2Binding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main2)
        initView()
    }

    private fun initView() {
        binding.ivBack.setOnClickListener {
//            finish()
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}