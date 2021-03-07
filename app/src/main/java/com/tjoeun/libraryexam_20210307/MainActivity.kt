package com.tjoeun.libraryexam_20210307

import android.content.Intent
import android.net.Uri
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

//        전화걸기 버튼 눌리면 => 권한이 있는지 확인하고 => 실제 전화 걸어보자
        callBtn.setOnClickListener {
            val myUri = Uri.parse("tel:010-2222-3333")
            val myIntent = Intent(Intent.ACTION_CALL, myUri)
            startActivity(myIntent)
        }

//        이미지뷰를 눌렀을때? => 사진 보기 화면 이동.
        profileImg.setOnClickListener {

            val myIntent = Intent(mContext, ViewPhotoActivity::class.java)
            startActivity(myIntent)

        }

    }

    override fun setValues() {

    }

}