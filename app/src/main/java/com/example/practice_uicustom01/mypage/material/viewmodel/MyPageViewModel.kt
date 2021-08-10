package com.example.practice_uicustom01.mypage.material.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.practice_uicustom01.mypage.material.idea.IdeaFragment
import com.example.practice_uicustom01.mypage.material.todo.TodoListFragment
import com.example.practice_uicustom01.mypage.material.worry.WorryFragment

class MyPageViewModel : ViewModel() {

/*
	enum class MyPageFragmentType {
		TODO, IDEA, WORRY
	}

	private val _materialFragLiveData = MutableLiveData(MyPageFragmentType.TODO)
	val materialFragmentType : LiveData<MyPageFragmentType>
	get() = _materialFragLiveData
*/

	// xo viewPager2
	val fragmentList = listOf(TodoListFragment(), IdeaFragment(), WorryFragment())
	val tabTitle = listOf("To Do","Idea","Worry",)



}