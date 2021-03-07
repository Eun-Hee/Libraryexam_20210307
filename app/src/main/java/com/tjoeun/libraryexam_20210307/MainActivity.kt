package com.tjoeun.libraryexam_20210307

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {

//        이미지뷰를 눌렀을때? => 사진 보기 화면 이동.
        profileImg.setOnClickListener {

            val myIntent = Intent(mContext, ViewPhotoActivity::class.java)
            startActivity(myIntent)

        }

    }

    override fun setValues() {

    }

}