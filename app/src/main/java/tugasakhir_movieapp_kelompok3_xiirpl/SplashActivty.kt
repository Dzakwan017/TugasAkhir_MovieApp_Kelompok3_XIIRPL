package com.example.tugasakhir_movieapp_kelompok3_xiirpl

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.tugasakhir_movieapp_kelompok3_xiirpl.R

class SplashActivty : AppCompatActivity() {

    //DEKLARASI VARIABEL TIMER SPLASH SCREEN MUNCUL
    private val SPLASH_TIME_OUT:Long = 3000 //DELAY 3 DETIK

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_activty)

        //KODE UNTUK MENJALANKAN MAIN SCREEN SETELAH TIMER SPLASH SCREEN HABIS
        Handler().postDelayed({
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }, SPLASH_TIME_OUT)

    }
}
