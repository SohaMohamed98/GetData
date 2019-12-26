package com.example.getdata

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ActionMode
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnOne.setOnClickListener {

            var i=Intent("com.soha.GETDATA" )
            startActivityForResult(i,2)
            //startActivity(i)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if(requestCode==2 && resultCode== Activity.RESULT_OK){
          //  var data=intent()
            var inten =data!!.extras?.getString("my_name")
            Toast.makeText(this,inten,Toast.LENGTH_LONG).show()

        }
    }
    }



