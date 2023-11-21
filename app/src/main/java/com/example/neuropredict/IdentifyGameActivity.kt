package com.example.neuropredict

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import android.view.View.GONE
import android.view.View.VISIBLE
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet.Constraint
import org.w3c.dom.Text

class IdentifyGameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_identify_game)
        var right=0
        var wrong=0
        val correctText=findViewById<TextView>(R.id.correct_text)
        val wrongText=findViewById<TextView>(R.id.wrong_text)
        val timer=findViewById<TextView>(R.id.timer)
        val startBtn=findViewById<CardView>(R.id.start_btn)
        val resetBtn=findViewById<CardView>(R.id.reset_btn)
        val backBtn=findViewById<ImageView>(R.id.back_btn)
        val tappingScreen=findViewById<CardView>(R.id.clickable_box)
        val c1=findViewById<CardView>(R.id.c1)
        val layout=findViewById<ConstraintLayout>(R.id.tapping_layout)
        val bottom = findViewById<TextView>(R.id.bottom_align)
        val intertap = findViewById<TextView>(R.id.intertap)
        val offsetDist = findViewById<TextView>(R.id.offset_distance)
        var ti : Long = 0
        var interTapTime : Long =0
        var lastTime : Long =30000
        var fin =1
        var randx=0
        var randy=0

        tappingScreen.setOnClickListener {
            wrong++
        }

        c1.setOnClickListener {
            right++
            randx=(10..bottom.x.toInt()-5).random()
            randy=(10..bottom.y.toInt()-5).random()
            c1.x= randx.toFloat()
            c1.y=randy.toFloat()
            interTapTime+=lastTime - ti
            lastTime=ti
        }




        backBtn.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish()
        }
        resetBtn.setOnClickListener {
            timer.text= "30"
            tappingScreen.visibility= VISIBLE
            correctText.visibility= GONE
            wrongText.visibility=GONE
            startBtn.visibility= View.VISIBLE
            resetBtn.visibility= View.GONE
            c1.visibility=GONE
        }

        startBtn.setOnClickListener {
            c1.visibility= VISIBLE
            randx=(10..bottom.x.toInt()-10).random()
            randy=(10..bottom.y.toInt()-10).random()
            c1.x= randx.toFloat()
            c1.y=randy.toFloat()

            fin=0
            right=0
            wrong=0
            resetBtn.visibility= View.GONE
            startBtn.visibility= View.GONE
            object : CountDownTimer(30000, 1000){
                override fun onTick(p0: Long) {
                    timer.text= (p0/1000).toString()
                    ti=p0
                }

                override fun onFinish() {
                    correctText.text="CORRECT: " + right.toString()
                    wrongText.text="WRONG: "+wrong.toString()
                    val ans = String.format("%.2f", (interTapTime.toDouble()/(1000*right))).toDouble()
                    intertap.text = "Inter-Tap Time: "+ans.toString()+"s"
                    timer.text="0"
                    resetBtn.visibility= View.VISIBLE
                    fin=1
                    tappingScreen.visibility=GONE
                    correctText.visibility= VISIBLE
                    wrongText.visibility=VISIBLE
                    intertap.visibility= VISIBLE
                    offsetDist.visibility= VISIBLE
                    c1.visibility=GONE

                }
            }.start()
        }

    }
}