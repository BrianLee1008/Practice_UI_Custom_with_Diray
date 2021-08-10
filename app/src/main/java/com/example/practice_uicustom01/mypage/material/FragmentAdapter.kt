package com.example.practice_uicustom01.mypage.material

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

// xo viewPager2의 어댑터에는 항상 FragmentStateAdapter를 상속받고 fragmentActivity를 입력값으로 받는다
class FragmentAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {

//xo 보여줄 프래그먼트 목록 생성 (countryFilterList 처럼)
	var fragmentList = listOf<Fragment>()

	// xo 보여줄 프래그먼트의 사이즈
	override fun getItemCount(): Int {
		return fragmentList.size
	}

	// xo 프래그먼트 목록중 해당 포지션에 있는 프래그먼트 1개를 반환한다.
	override fun createFragment(position: Int): Fragment {
		return fragmentList[position]
	}
}