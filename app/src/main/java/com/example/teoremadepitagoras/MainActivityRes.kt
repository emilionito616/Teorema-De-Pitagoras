package com.example.teoremadepitagoras

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main_res.*

class MainActivityRes : AppCompatActivity() {
    var a: Double=0.0
    var b: Double=0.0
    var c: Double=0.0
    companion object{
        val EXTRA_A= "catetoA"
        val EXTRA_B= "catetoB"
        val EXTRA_C= "hipotenusa"
        private val DEFAULT_DOUBLE = -1.0
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_res)
        val recibir=intent
        a = recibir.getDoubleExtra(EXTRA_A, DEFAULT_DOUBLE)
        b = recibir.getDoubleExtra(EXTRA_B, DEFAULT_DOUBLE)
        c = recibir.getDoubleExtra(EXTRA_C, DEFAULT_DOUBLE)
        tvA.setText("El cateto a: "+a.toString())
        tvB.setText("El cateto b: "+b.toString())
        tvC.setText("La hipotenusa es: "+c.toString())
    }
}
