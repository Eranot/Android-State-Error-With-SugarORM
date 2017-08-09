package com.example.eranot.androidstateerrorwithsugarorm

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.evernote.android.state.State
import com.evernote.android.state.StateSaver

class MainActivity : AppCompatActivity() {

    //TO FIX, JUST ADD '@State(AttributeBundler::class)'
    @State var attributes = arrayListOf<Attribute>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        StateSaver.restoreInstanceState(this, savedInstanceState)

        attributes.add(element = Attribute())

        Log.d("Size", attributes.size.toString())

    }

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        StateSaver.saveInstanceState(this, outState!!)
    }
}
