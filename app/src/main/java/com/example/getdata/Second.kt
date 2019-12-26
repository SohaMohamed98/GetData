package com.example.getdata

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class Second : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        btnGetData.setOnClickListener {

            var myName=edName.text.toString()
            var i=intent
            i.putExtra("my_name",myName)
            setResult(Activity.RESULT_OK,i)
            finish()
        }
    }
}
