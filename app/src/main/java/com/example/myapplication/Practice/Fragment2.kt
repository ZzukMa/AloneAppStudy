package com.example.myapplication.Practice

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.myapplication.R

class Fragment2 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d("Lifecycle","F onCreateView")
        // fragment가 인터페이스를 처음으로 그릴 때 호출된다

        // inflater  -> 뷰를 그려주는 친구
        // container -> 부모 뷰

        return inflater.inflate(R.layout.fragment_two,container,false)

    }
}