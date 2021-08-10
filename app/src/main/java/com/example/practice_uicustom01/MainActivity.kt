package com.example.practice_uicustom01

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.practice_uicustom01.databinding.ActivityMainBinding
import com.example.practice_uicustom01.mypage.MyPageFragment

class MainActivity : AppCompatActivity() {

	private val myPageFragment = MyPageFragment()

	private val binding by lazy{ActivityMainBinding.inflate(layoutInflater)}
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(binding.root)
		replaceFragment()
	}

	private fun replaceFragment(){
		val fragmentTransaction = supportFragmentManager.beginTransaction()
		fragmentTransaction.add(binding.frame.id, myPageFragment).commit()
	}
}