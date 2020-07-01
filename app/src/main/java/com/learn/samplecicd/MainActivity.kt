package com.learn.samplecicd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()
    }

    private fun init() {

        val email=et_id.text.trim().toString()
        val password=et_password.text.trim().toString()

        btn_submit.setOnClickListener {


            if(!TextUtils.isEmpty(password) && !TextUtils.isEmpty(password) && password=="0000"){

                Toast.makeText(this,"Login Successful",Toast.LENGTH_SHORT).show()
            }else{
                if(TextUtils.isEmpty(email)){
                    Toast.makeText(this,"Enter Email",Toast.LENGTH_SHORT).show()
                }
                if(TextUtils.isEmpty(password)){
                    Toast.makeText(this,"Enter PIN",Toast.LENGTH_SHORT).show()
                }
            }





        }
    }


}