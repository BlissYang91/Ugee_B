package com.yutai.business.ugee.ui

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.bumptech.glide.Glide
import com.bumptech.glide.load.MultiTransformation
import com.bumptech.glide.load.resource.bitmap.CenterCrop
import com.bumptech.glide.load.resource.bitmap.CircleCrop
import com.bumptech.glide.request.RequestOptions
import com.yutai.business.ugee.R
import com.yutai.business.ugee.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private val TAG = "MainActivity"
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initView()
    }

    private fun initView() {
//        binding.titleMain.setCenterTitleText(resources.getString(R.string.main_app_name))
//            .setRightTextVisible(false)
//            .setCenterTitleTextColor(Color.WHITE)
//            .setLeftImg(resources.getDrawable(R.mipmap.user))
//            .setRightImgVisible(true)
//            .setRightImg(resources.getDrawable(R.mipmap.message))
//            .setBottomLineVisible(false)
//            .setLeftClickListener(View.OnClickListener {
//                Log.d(TAG, "ytf initView: left on click ")
//                binding.drawerLayout.openDrawer(binding.leftLayout)
//            })
       binding.ivUser.setOnClickListener{
           binding.drawerLayout.openDrawer(binding.leftLayout)
       }
        Glide.with(this)
            .asDrawable().placeholder(com.yuntai.data.R.drawable.ic_launcher_background)
            .fitCenter()
            .error(com.google.android.material.R.drawable.mtrl_ic_error)
            .apply(RequestOptions.circleCropTransform())
            .load(R.drawable.avatar)
            .into(binding.ivUserAvatar)
    }
}