package com.example.teoremadepitagoras

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Math.pow
import kotlin.math.sqrt

class MainActivity : AppCompatActivity() {
    var a: Double=0.0
    var b: Double=0.0
    var c: Double=0.0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun calcularC(v: View){
        if (etA.text.isEmpty() || etB.text.isEmpty()){
            Toast.makeText(this,"Faltan Datos",Toast.LENGTH_LONG).show()
            etA.requestFocus()
        }else{
            a=etA.text.toString().toDouble()
            b=etB.text.toString().toDouble()
            c= sqrt((pow(a,2.0)+ pow(b,2.0)))
            etC.setText(c.toString())
        }
    }
    fun calcularA (v: View){
        if (etB.text.isEmpty() || etC.text.isEmpty()){
            Toast.makeText(this,"Faltan Datos",Toast.LENGTH_LONG).show()
            etA.requestFocus()
        }else{
            b=etB.text.toString().toDouble()
            c=etC.text.toString().toDouble()
            a= sqrt((pow(c,2.0)- pow(b,2.0)))
            etA.setText(a.toString())
        }
    }
    fun calcularB (v: View){
        if (etA.text.isEmpty() || etC.text.isEmpty()){
            Toast.makeText(this,"Faltan Datos",Toast.LENGTH_LONG).show()
            etA.requestFocus()
        }else{
            c=etC.text.toString().toDouble()
            a= etB.text.toString().toDouble()
            b=sqrt((pow(c,2.0)- pow(a,2.0)))
            etB.setText(b.toString())
        }
    }
    fun enviarDatos(v: View){
        val enviar = Intent(this,MainActivityRes::class.java)
        enviar.putExtra(MainActivityRes.EXTRA_A,a)
        enviar.putExtra(MainActivityRes.EXTRA_B,b)
        enviar.putExtra(MainActivityRes.EXTRA_C,c)
        startActivity(enviar)
    }
}