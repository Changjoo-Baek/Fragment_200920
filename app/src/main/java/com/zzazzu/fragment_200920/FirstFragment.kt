package com.zzazzu.fragment_200920

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.frament_test.*

//fragment 함수는 fragment 안에서만 함수 만들어 사용한다.
//frag 는 activity 위에 얹어지는 조각같은 것

class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.frament_test, container, attachToRoot false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        changeTextBtn.setOnClickListener{

            firstTxt.text = "버튼이 눌림"

        }
    }

}