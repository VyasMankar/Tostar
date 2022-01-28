package com.vyas.vyaskotlintosterlib

import android.content.Context
import android.util.Log
import android.widget.Toast


public class ToasterMessage {
    fun callToast(c: Context?, message: String?) {
        Toast.makeText(c, message, Toast.LENGTH_SHORT).show()
        Log.i("Toast","Message")
    }
}