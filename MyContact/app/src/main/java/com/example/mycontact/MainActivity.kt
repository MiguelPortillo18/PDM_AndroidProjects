package com.example.mycontact

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    private val TAG : String = MainActivity::class.qualifiedName.toString()

    companion object{
        val EMAIL_KEY = "text_email"
        val MESSAGE_KEY = "text_message"
    }

    lateinit var mEmailEditText : EditText
    lateinit var mMessageEditText : EditText
    lateinit var mActionSend : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bindView()
        addEventListener()
    }

    private fun bindView(){
        mEmailEditText = findViewById(R.id.et_email)
        mMessageEditText = findViewById(R.id.et_message)
        mActionSend = findViewById(R.id.action_send)
    }

    fun addEventListener(){
        mActionSend.setOnClickListener{
            val email : String = mEmailEditText.text.toString()
            val message : String = mMessageEditText.text.toString()

            Log.d(TAG, "$email ---- $message")

            var intent = Intent(this, SecondActivity::class.java)
            intent.putExtra(EMAIL_KEY,email)
            intent.putExtra(MESSAGE_KEY, message)
            startActivity(intent)
        }
    }
}
