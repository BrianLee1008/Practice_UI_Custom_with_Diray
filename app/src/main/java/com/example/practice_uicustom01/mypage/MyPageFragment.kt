package com.example.practice_uicustom01.mypage

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.example.practice_uicustom01.databinding.FragMypageBinding
import com.example.practice_uicustom01.mypage.material.FragmentAdapter
import com.example.practice_uicustom01.mypage.material.idea.IdeaFragment
import com.example.practice_uicustom01.mypage.material.todo.TodoListFragment
import com.example.practice_uicustom01.mypage.material.viewmodel.MyPageViewModel
import com.example.practice_uicustom01.mypage.material.worry.WorryFragment
import com.google.android.material.tabs.TabLayoutMediator

class MyPageFragment : Fragment() {

	private val todoListFragment = TodoListFragment()
	private val ideaFragment = IdeaFragment()
	private val worryFragment = WorryFragment()

	private val viewModel by activityViewModels<MyPageViewModel>()

	private var _binding: FragMypageBinding? = null
	val binding: FragMypageBinding
		get() = _binding!!

	override fun onCreateView(
		inflater: LayoutInflater,
		container: ViewGroup?,
		savedInstanceState: Bundle?
	): View {
		_binding = FragMypageBinding.inflate(inflater, container, false)
		return binding.root
	}

	override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
		super.onViewCreated(view, savedInstanceState)

		viewPager2Fragment()
		materialTab()
	}

	//xo 어댑터와 데이터 연결
	private fun viewPager2Fragment() {
		val adater = FragmentAdapter(requireActivity())
		adater.fragmentList = viewModel.fragmentList

		binding.viewPager2.adapter = adater
	}

	private fun materialTab(){
		TabLayoutMediator(binding.materialTab, binding.viewPager2){
			tab, position -> tab.text = viewModel.tabTitle[position]
		}.attach()
	}

	override fun onDestroyView() {
		super.onDestroyView()
		_binding = null
	}
}