package com.example.myprofile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.btn_simpan
import kotlinx.android.synthetic.main.activity_main.edit_alamat
import kotlinx.android.synthetic.main.activity_main.edit_email
import kotlinx.android.synthetic.main.activity_main.edit_nama
import kotlinx.android.synthetic.main.activity_main.edit_nomor
import kotlinx.android.synthetic.main.activity_main.sp_gender

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_simpan.setOnClickListener {
            val nama = edit_nama.text.toString()
            val gender = sp_gender.selectedItem.toString()
            val nomor = edit_nomor.text.toString()
            val email = edit_email.text.toString()
            val alamat = edit_alamat.text.toString()

            val intent = Intent(this, ProfileActivity::class.java)

            intent.putExtra("nama", nama)
            intent.putExtra("gender", gender)
            intent.putExtra("nomor", nomor)
            intent.putExtra("email", email)
            intent.putExtra("alamat", alamat)

            startActivity(intent)
        }
    }
}
