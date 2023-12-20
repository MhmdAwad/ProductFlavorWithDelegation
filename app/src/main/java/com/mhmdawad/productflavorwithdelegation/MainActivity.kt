package com.mhmdawad.productflavorwithdelegation

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.mhmdawad.productflavorwithdelegation.utils.MyFlavorsImpl

class MainActivity : AppCompatActivity(), MyFlavors by MyFlavorsImpl() {

    companion object {
        const val TAG = "MainActivity"
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val name = getFlavorName()
        Log.d(TAG, name)

    }
}