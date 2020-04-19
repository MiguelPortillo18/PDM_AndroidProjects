package com.example.mycontact

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

    private val TAG : String = SecondActivity::class.qualifiedName.toString()

    lateinit var mDisplayEmailTextView : TextView
    lateinit var mDisplayMessageTextView : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        bindView()

        if(intent != null){
            val email = intent.getStringExtra(MainActivity.EMAIL_KEY)
            val message = intent.getStringExtra(MainActivity.MESSAGE_KEY)

            mDisplayEmailTextView.text = email
            mDisplayMessageTextView.text = message
        }
    }

    fun bindView(){
        mDisplayEmailTextView = findViewById(R.id.tv_display_email)
        mDisplayMessageTextView = findViewById(R.id.tv_display_message)
    }
}
