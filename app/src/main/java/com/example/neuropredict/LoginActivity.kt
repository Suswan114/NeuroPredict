package com.example.neuropredict

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.cardview.widget.CardView
import com.google.android.material.textfield.TextInputEditText

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val patientId=findViewById<TextInputEditText>(R.id.patient_id)
        val sendButton=findViewById<CardView>(R.id.send_button)

        sendButton.setOnClickListener {

            if(patientId.text!=null && patientId.text!!.isNotBlank()) {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                finish()
            }else{
                Toast.makeText(this, "Please Enter the Patient Id.!!!", Toast.LENGTH_SHORT).show()
            }
        }


    }
}