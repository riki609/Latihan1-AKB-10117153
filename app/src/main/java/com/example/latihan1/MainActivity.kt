package com.example.latihan1
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener {
            val intent = Intent(this, kode::class.java)
            startActivity(intent)
        }
    }
}

/*
Tanggal Pengerjaan : 7 April 2020
Deskripsi Pengerjaan : Membuat class biodata, kode, MainActivity, dan ok. Membuat layout biodata,
kode, main, dan ok
Nim : 10117153
Nama : Riki Ahmad Fauzi
Kelas : IF4
 */
