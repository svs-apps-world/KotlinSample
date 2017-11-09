package com.dev.svs.kotlinsample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


/*
    Extension
    Lambda

 */

open class MainActivity : AppCompatActivity() {

    private val name = "Steeven"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView.setOnClickListener {
            showShortToast("it's a short toast")
        }
    }


}


