package com.example.neuropredict

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.cardview.widget.CardView
import com.google.android.material.textfield.TextInputEditText
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val patientId=findViewById<TextInputEditText>(R.id.patient_id)
        val sendButton=findViewById<CardView>(R.id.send_button)

        sendButton.setOnClickListener {

            if(patientId.text!=null && patientId.text!!.isNotBlank()) {
                val intent = Intent(this, MainActivity::class.java)
                val apiInterface = RetrofitClient.getRetrofitInstance().create(ApiInterface::class.java)
                val call: Call<User> = apiInterface.getUserInformation(patientId.toString())
                call.enqueue(object : Callback<User> {
                    override fun onResponse(call: Call<User>, response: Response<User>) {
                        startActivity(intent)
                        finish()
                    }

                    override fun onFailure(call: Call<User>, t: Throwable) {
                        Toast.makeText(this@LoginActivity, "Please try again later!!"+t.message, Toast.LENGTH_SHORT).show()
                    }
                })

            }else{
                Toast.makeText(this, "Please Enter the Patient Id.!!!", Toast.LENGTH_SHORT).show()
            }
        }


    }
}

private fun <T> Call<T>.enqueue(any: Any) {

}
