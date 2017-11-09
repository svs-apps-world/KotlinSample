package com.dev.svs.kotlinsample

import android.content.Context
import android.widget.Toast

/**
 * Created by snehal on 11/3/17.
 */

fun Context.showLongToast(message: CharSequence) {
    Toast.makeText(this, message, Toast.LENGTH_LONG).show()
}

fun Context.showShortToast(message: CharSequence) {
    Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
}