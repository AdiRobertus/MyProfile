package com.example.myprofile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_profile.tv_alamat
import kotlinx.android.synthetic.main.activity_profile.tv_gender
import kotlinx.android.synthetic.main.activity_profile.tv_nama
import kotlinx.android.synthetic.main.activity_profile.tv_nomor

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val intent = intent.extras
        val name = intent?.getString("nama")
        val gender = intent?.getString("gender")
        val nomor = intent?.getString("nomor")
        val email = intent?.getString("email")
        val alamat = intent?.getString("alamat")

        tv_nama.text = name
        tv_gender.text = gender
        tv_nomor.text = nomor
        tv_alamat.text = alamat
    }
}
