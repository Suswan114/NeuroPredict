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
        val c2=findViewById<CardView>(R.id.c2)
        val c3=findViewById<CardView>(R.id.c3)
        val c4=findViewById<CardView>(R.id.c4)
        val c5=findViewById<CardView>(R.id.c5)
        val c6=findViewById<CardView>(R.id.c6)
        val c7=findViewById<CardView>(R.id.c7)
        val c8=findViewById<CardView>(R.id.c8)
        val c9=findViewById<CardView>(R.id.c9)
        val c10=findViewById<CardView>(R.id.c10)
        val c11=findViewById<CardView>(R.id.c11)
        val c12=findViewById<CardView>(R.id.c12)
        val c13=findViewById<CardView>(R.id.c13)
        val c14=findViewById<CardView>(R.id.c14)
        val c15=findViewById<CardView>(R.id.c15)
        val c16=findViewById<CardView>(R.id.c16)
        val c17=findViewById<CardView>(R.id.c17)
        val c18=findViewById<CardView>(R.id.c18)
        val c19=findViewById<CardView>(R.id.c19)
        val c20=findViewById<CardView>(R.id.c20)
        var fin =1

        c1.visibility=GONE
        c2.visibility=GONE
        c3.visibility=GONE
        c4.visibility=GONE
        c5.visibility=GONE
        c6.visibility=GONE
        c7.visibility=GONE
        c8.visibility=GONE
        c9.visibility=GONE
        c10.visibility=GONE
        c11.visibility=GONE
        c12.visibility=GONE
        c13.visibility=GONE
        c14.visibility=GONE
        c15.visibility=GONE
        c16.visibility=GONE
        c17.visibility=GONE
        c18.visibility=GONE
        c19.visibility=GONE
        c20.visibility=GONE

        var rand=0

        tappingScreen.setOnClickListener {
            wrong++
        }

        c1.setOnClickListener {
            right++
            c1.visibility=GONE
            rand=(1..20).random()
            if(rand==1){
                c1.visibility= VISIBLE
            }else if(rand==2){
                c2.visibility= VISIBLE
            }else if(rand==3){
                c3.visibility= VISIBLE
            }else if(rand==4){
                c4.visibility= VISIBLE
            }else if(rand==5){
                c5.visibility= VISIBLE
            }else if(rand==6){
                c6.visibility= VISIBLE
            }else if(rand==7){
                c7.visibility= VISIBLE
            }else if(rand==8){
                c8.visibility= VISIBLE
            }else if(rand==9){
                c9.visibility= VISIBLE
            }else if(rand==10){
                c10.visibility= VISIBLE
            }else if(rand==11){
                c11.visibility= VISIBLE
            }else if(rand==12){
                c12.visibility= VISIBLE
            }else if(rand==13){
                c13.visibility= VISIBLE
            }else if(rand==14){
                c14.visibility= VISIBLE
            }else if(rand==15){
                c15.visibility= VISIBLE
            }else if(rand==16){
                c16.visibility= VISIBLE
            }else if(rand==17){
                c17.visibility= VISIBLE
            }else if(rand==18){
                c18.visibility= VISIBLE
            }else if(rand==19){
                c19.visibility= VISIBLE
            }else{
                c20.visibility= VISIBLE
            }
        }

        c2.setOnClickListener {
            right++
            c2.visibility=GONE
            rand=(1..20).random()
            if(rand==1){
                c1.visibility= VISIBLE
            }else if(rand==2){
                c2.visibility= VISIBLE
            }else if(rand==3){
                c3.visibility= VISIBLE
            }else if(rand==4){
                c4.visibility= VISIBLE
            }else if(rand==5){
                c5.visibility= VISIBLE
            }else if(rand==6){
                c6.visibility= VISIBLE
            }else if(rand==7){
                c7.visibility= VISIBLE
            }else if(rand==8){
                c8.visibility= VISIBLE
            }else if(rand==9){
                c9.visibility= VISIBLE
            }else if(rand==10){
                c10.visibility= VISIBLE
            }else if(rand==11){
                c11.visibility= VISIBLE
            }else if(rand==12){
                c12.visibility= VISIBLE
            }else if(rand==13){
                c13.visibility= VISIBLE
            }else if(rand==14){
                c14.visibility= VISIBLE
            }else if(rand==15){
                c15.visibility= VISIBLE
            }else if(rand==16){
                c16.visibility= VISIBLE
            }else if(rand==17){
                c17.visibility= VISIBLE
            }else if(rand==18){
                c18.visibility= VISIBLE
            }else if(rand==19){
                c19.visibility= VISIBLE
            }else{
                c20.visibility= VISIBLE
            }
        }
        c9.setOnClickListener {
            right++
            c9.visibility=GONE
            rand=(1..20).random()
            if(rand==1){
                c1.visibility= VISIBLE
            }else if(rand==2){
                c2.visibility= VISIBLE
            }else if(rand==3){
                c3.visibility= VISIBLE
            }else if(rand==4){
                c4.visibility= VISIBLE
            }else if(rand==5){
                c5.visibility= VISIBLE
            }else if(rand==6){
                c6.visibility= VISIBLE
            }else if(rand==7){
                c7.visibility= VISIBLE
            }else if(rand==8){
                c8.visibility= VISIBLE
            }else if(rand==9){
                c9.visibility= VISIBLE
            }else if(rand==10){
                c10.visibility= VISIBLE
            }else if(rand==11){
                c11.visibility= VISIBLE
            }else if(rand==12){
                c12.visibility= VISIBLE
            }else if(rand==13){
                c13.visibility= VISIBLE
            }else if(rand==14){
                c14.visibility= VISIBLE
            }else if(rand==15){
                c15.visibility= VISIBLE
            }else if(rand==16){
                c16.visibility= VISIBLE
            }else if(rand==17){
                c17.visibility= VISIBLE
            }else if(rand==18){
                c18.visibility= VISIBLE
            }else if(rand==19){
                c19.visibility= VISIBLE
            }else{
                c20.visibility= VISIBLE
            }
        }

        c8.setOnClickListener {
            right++
            c8.visibility=GONE
            rand=(1..20).random()
            if(rand==1){
                c1.visibility= VISIBLE
            }else if(rand==2){
                c2.visibility= VISIBLE
            }else if(rand==3){
                c3.visibility= VISIBLE
            }else if(rand==4){
                c4.visibility= VISIBLE
            }else if(rand==5){
                c5.visibility= VISIBLE
            }else if(rand==6){
                c6.visibility= VISIBLE
            }else if(rand==7){
                c7.visibility= VISIBLE
            }else if(rand==8){
                c8.visibility= VISIBLE
            }else if(rand==9){
                c9.visibility= VISIBLE
            }else if(rand==10){
                c10.visibility= VISIBLE
            }else if(rand==11){
                c11.visibility= VISIBLE
            }else if(rand==12){
                c12.visibility= VISIBLE
            }else if(rand==13){
                c13.visibility= VISIBLE
            }else if(rand==14){
                c14.visibility= VISIBLE
            }else if(rand==15){
                c15.visibility= VISIBLE
            }else if(rand==16){
                c16.visibility= VISIBLE
            }else if(rand==17){
                c17.visibility= VISIBLE
            }else if(rand==18){
                c18.visibility= VISIBLE
            }else if(rand==19){
                c19.visibility= VISIBLE
            }else{
                c20.visibility= VISIBLE
            }
        }

        c7.setOnClickListener {
            right++
            c7.visibility=GONE
            rand=(1..20).random()
            if(rand==1){
                c1.visibility= VISIBLE
            }else if(rand==2){
                c2.visibility= VISIBLE
            }else if(rand==3){
                c3.visibility= VISIBLE
            }else if(rand==4){
                c4.visibility= VISIBLE
            }else if(rand==5){
                c5.visibility= VISIBLE
            }else if(rand==6){
                c6.visibility= VISIBLE
            }else if(rand==7){
                c7.visibility= VISIBLE
            }else if(rand==8){
                c8.visibility= VISIBLE
            }else if(rand==9){
                c9.visibility= VISIBLE
            }else if(rand==10){
                c10.visibility= VISIBLE
            }else if(rand==11){
                c11.visibility= VISIBLE
            }else if(rand==12){
                c12.visibility= VISIBLE
            }else if(rand==13){
                c13.visibility= VISIBLE
            }else if(rand==14){
                c14.visibility= VISIBLE
            }else if(rand==15){
                c15.visibility= VISIBLE
            }else if(rand==16){
                c16.visibility= VISIBLE
            }else if(rand==17){
                c17.visibility= VISIBLE
            }else if(rand==18){
                c18.visibility= VISIBLE
            }else if(rand==19){
                c19.visibility= VISIBLE
            }else{
                c20.visibility= VISIBLE
            }
        }

        c6.setOnClickListener {
            right++
            c6.visibility=GONE
            rand=(1..20).random()
            if(rand==1){
                c1.visibility= VISIBLE
            }else if(rand==2){
                c2.visibility= VISIBLE
            }else if(rand==3){
                c3.visibility= VISIBLE
            }else if(rand==4){
                c4.visibility= VISIBLE
            }else if(rand==5){
                c5.visibility= VISIBLE
            }else if(rand==6){
                c6.visibility= VISIBLE
            }else if(rand==7){
                c7.visibility= VISIBLE
            }else if(rand==8){
                c8.visibility= VISIBLE
            }else if(rand==9){
                c9.visibility= VISIBLE
            }else if(rand==10){
                c10.visibility= VISIBLE
            }else if(rand==11){
                c11.visibility= VISIBLE
            }else if(rand==12){
                c12.visibility= VISIBLE
            }else if(rand==13){
                c13.visibility= VISIBLE
            }else if(rand==14){
                c14.visibility= VISIBLE
            }else if(rand==15){
                c15.visibility= VISIBLE
            }else if(rand==16){
                c16.visibility= VISIBLE
            }else if(rand==17){
                c17.visibility= VISIBLE
            }else if(rand==18){
                c18.visibility= VISIBLE
            }else if(rand==19){
                c19.visibility= VISIBLE
            }else{
                c20.visibility= VISIBLE
            }
        }

        c5.setOnClickListener {
            right++
            c5.visibility=GONE
            rand=(1..20).random()
            if(rand==1){
                c1.visibility= VISIBLE
            }else if(rand==2){
                c2.visibility= VISIBLE
            }else if(rand==3){
                c3.visibility= VISIBLE
            }else if(rand==4){
                c4.visibility= VISIBLE
            }else if(rand==5){
                c5.visibility= VISIBLE
            }else if(rand==6){
                c6.visibility= VISIBLE
            }else if(rand==7){
                c7.visibility= VISIBLE
            }else if(rand==8){
                c8.visibility= VISIBLE
            }else if(rand==9){
                c9.visibility= VISIBLE
            }else if(rand==10){
                c10.visibility= VISIBLE
            }else if(rand==11){
                c11.visibility= VISIBLE
            }else if(rand==12){
                c12.visibility= VISIBLE
            }else if(rand==13){
                c13.visibility= VISIBLE
            }else if(rand==14){
                c14.visibility= VISIBLE
            }else if(rand==15){
                c15.visibility= VISIBLE
            }else if(rand==16){
                c16.visibility= VISIBLE
            }else if(rand==17){
                c17.visibility= VISIBLE
            }else if(rand==18){
                c18.visibility= VISIBLE
            }else if(rand==19){
                c19.visibility= VISIBLE
            }else{
                c20.visibility= VISIBLE
            }
        }

        c4.setOnClickListener {
            right++
            c4.visibility=GONE
            rand=(1..20).random()
            if(rand==1){
                c1.visibility= VISIBLE
            }else if(rand==2){
                c2.visibility= VISIBLE
            }else if(rand==3){
                c3.visibility= VISIBLE
            }else if(rand==4){
                c4.visibility= VISIBLE
            }else if(rand==5){
                c5.visibility= VISIBLE
            }else if(rand==6){
                c6.visibility= VISIBLE
            }else if(rand==7){
                c7.visibility= VISIBLE
            }else if(rand==8){
                c8.visibility= VISIBLE
            }else if(rand==9){
                c9.visibility= VISIBLE
            }else if(rand==10){
                c10.visibility= VISIBLE
            }else if(rand==11){
                c11.visibility= VISIBLE
            }else if(rand==12){
                c12.visibility= VISIBLE
            }else if(rand==13){
                c13.visibility= VISIBLE
            }else if(rand==14){
                c14.visibility= VISIBLE
            }else if(rand==15){
                c15.visibility= VISIBLE
            }else if(rand==16){
                c16.visibility= VISIBLE
            }else if(rand==17){
                c17.visibility= VISIBLE
            }else if(rand==18){
                c18.visibility= VISIBLE
            }else if(rand==19){
                c19.visibility= VISIBLE
            }else{
                c20.visibility= VISIBLE
            }
        }
        c3.setOnClickListener {
            right++
            c3.visibility=GONE
            rand=(1..20).random()
            if(rand==1){
                c1.visibility= VISIBLE
            }else if(rand==2){
                c2.visibility= VISIBLE
            }else if(rand==3){
                c3.visibility= VISIBLE
            }else if(rand==4){
                c4.visibility= VISIBLE
            }else if(rand==5){
                c5.visibility= VISIBLE
            }else if(rand==6){
                c6.visibility= VISIBLE
            }else if(rand==7){
                c7.visibility= VISIBLE
            }else if(rand==8){
                c8.visibility= VISIBLE
            }else if(rand==9){
                c9.visibility= VISIBLE
            }else if(rand==10){
                c10.visibility= VISIBLE
            }else if(rand==11){
                c11.visibility= VISIBLE
            }else if(rand==12){
                c12.visibility= VISIBLE
            }else if(rand==13){
                c13.visibility= VISIBLE
            }else if(rand==14){
                c14.visibility= VISIBLE
            }else if(rand==15){
                c15.visibility= VISIBLE
            }else if(rand==16){
                c16.visibility= VISIBLE
            }else if(rand==17){
                c17.visibility= VISIBLE
            }else if(rand==18){
                c18.visibility= VISIBLE
            }else if(rand==19){
                c19.visibility= VISIBLE
            }else{
                c20.visibility= VISIBLE
            }
        }
        c20.setOnClickListener {
            right++
            c20.visibility=GONE
            rand=(1..20).random()
            if(rand==1){
                c1.visibility= VISIBLE
            }else if(rand==2){
                c2.visibility= VISIBLE
            }else if(rand==3){
                c3.visibility= VISIBLE
            }else if(rand==4){
                c4.visibility= VISIBLE
            }else if(rand==5){
                c5.visibility= VISIBLE
            }else if(rand==6){
                c6.visibility= VISIBLE
            }else if(rand==7){
                c7.visibility= VISIBLE
            }else if(rand==8){
                c8.visibility= VISIBLE
            }else if(rand==9){
                c9.visibility= VISIBLE
            }else if(rand==10){
                c10.visibility= VISIBLE
            }else if(rand==11){
                c11.visibility= VISIBLE
            }else if(rand==12){
                c12.visibility= VISIBLE
            }else if(rand==13){
                c13.visibility= VISIBLE
            }else if(rand==14){
                c14.visibility= VISIBLE
            }else if(rand==15){
                c15.visibility= VISIBLE
            }else if(rand==16){
                c16.visibility= VISIBLE
            }else if(rand==17){
                c17.visibility= VISIBLE
            }else if(rand==18){
                c18.visibility= VISIBLE
            }else if(rand==19){
                c19.visibility= VISIBLE
            }else{
                c20.visibility= VISIBLE
            }
        }
        c19.setOnClickListener {
            right++
            c19.visibility=GONE
            rand=(1..20).random()
            if(rand==1){
                c1.visibility= VISIBLE
            }else if(rand==2){
                c2.visibility= VISIBLE
            }else if(rand==3){
                c3.visibility= VISIBLE
            }else if(rand==4){
                c4.visibility= VISIBLE
            }else if(rand==5){
                c5.visibility= VISIBLE
            }else if(rand==6){
                c6.visibility= VISIBLE
            }else if(rand==7){
                c7.visibility= VISIBLE
            }else if(rand==8){
                c8.visibility= VISIBLE
            }else if(rand==9){
                c9.visibility= VISIBLE
            }else if(rand==10){
                c10.visibility= VISIBLE
            }else if(rand==11){
                c11.visibility= VISIBLE
            }else if(rand==12){
                c12.visibility= VISIBLE
            }else if(rand==13){
                c13.visibility= VISIBLE
            }else if(rand==14){
                c14.visibility= VISIBLE
            }else if(rand==15){
                c15.visibility= VISIBLE
            }else if(rand==16){
                c16.visibility= VISIBLE
            }else if(rand==17){
                c17.visibility= VISIBLE
            }else if(rand==18){
                c18.visibility= VISIBLE
            }else if(rand==19){
                c19.visibility= VISIBLE
            }else{
                c20.visibility= VISIBLE
            }
        }
        c18.setOnClickListener {
            right++
            c18.visibility=GONE
            rand=(1..20).random()
            if(rand==1){
                c1.visibility= VISIBLE
            }else if(rand==2){
                c2.visibility= VISIBLE
            }else if(rand==3){
                c3.visibility= VISIBLE
            }else if(rand==4){
                c4.visibility= VISIBLE
            }else if(rand==5){
                c5.visibility= VISIBLE
            }else if(rand==6){
                c6.visibility= VISIBLE
            }else if(rand==7){
                c7.visibility= VISIBLE
            }else if(rand==8){
                c8.visibility= VISIBLE
            }else if(rand==9){
                c9.visibility= VISIBLE
            }else if(rand==10){
                c10.visibility= VISIBLE
            }else if(rand==11){
                c11.visibility= VISIBLE
            }else if(rand==12){
                c12.visibility= VISIBLE
            }else if(rand==13){
                c13.visibility= VISIBLE
            }else if(rand==14){
                c14.visibility= VISIBLE
            }else if(rand==15){
                c15.visibility= VISIBLE
            }else if(rand==16){
                c16.visibility= VISIBLE
            }else if(rand==17){
                c17.visibility= VISIBLE
            }else if(rand==18){
                c18.visibility= VISIBLE
            }else if(rand==19){
                c19.visibility= VISIBLE
            }else{
                c20.visibility= VISIBLE
            }
        }
        c17.setOnClickListener {
            right++
            c17.visibility=GONE
            rand=(1..20).random()
            if(rand==1){
                c1.visibility= VISIBLE
            }else if(rand==2){
                c2.visibility= VISIBLE
            }else if(rand==3){
                c3.visibility= VISIBLE
            }else if(rand==4){
                c4.visibility= VISIBLE
            }else if(rand==5){
                c5.visibility= VISIBLE
            }else if(rand==6){
                c6.visibility= VISIBLE
            }else if(rand==7){
                c7.visibility= VISIBLE
            }else if(rand==8){
                c8.visibility= VISIBLE
            }else if(rand==9){
                c9.visibility= VISIBLE
            }else if(rand==10){
                c10.visibility= VISIBLE
            }else if(rand==11){
                c11.visibility= VISIBLE
            }else if(rand==12){
                c12.visibility= VISIBLE
            }else if(rand==13){
                c13.visibility= VISIBLE
            }else if(rand==14){
                c14.visibility= VISIBLE
            }else if(rand==15){
                c15.visibility= VISIBLE
            }else if(rand==16){
                c16.visibility= VISIBLE
            }else if(rand==17){
                c17.visibility= VISIBLE
            }else if(rand==18){
                c18.visibility= VISIBLE
            }else if(rand==19){
                c19.visibility= VISIBLE
            }else{
                c20.visibility= VISIBLE
            }
        }
        c16.setOnClickListener {
            right++
            c16.visibility=GONE
            rand=(1..20).random()
            if(rand==1){
                c1.visibility= VISIBLE
            }else if(rand==2){
                c2.visibility= VISIBLE
            }else if(rand==3){
                c3.visibility= VISIBLE
            }else if(rand==4){
                c4.visibility= VISIBLE
            }else if(rand==5){
                c5.visibility= VISIBLE
            }else if(rand==6){
                c6.visibility= VISIBLE
            }else if(rand==7){
                c7.visibility= VISIBLE
            }else if(rand==8){
                c8.visibility= VISIBLE
            }else if(rand==9){
                c9.visibility= VISIBLE
            }else if(rand==10){
                c10.visibility= VISIBLE
            }else if(rand==11){
                c11.visibility= VISIBLE
            }else if(rand==12){
                c12.visibility= VISIBLE
            }else if(rand==13){
                c13.visibility= VISIBLE
            }else if(rand==14){
                c14.visibility= VISIBLE
            }else if(rand==15){
                c15.visibility= VISIBLE
            }else if(rand==16){
                c16.visibility= VISIBLE
            }else if(rand==17){
                c17.visibility= VISIBLE
            }else if(rand==18){
                c18.visibility= VISIBLE
            }else if(rand==19){
                c19.visibility= VISIBLE
            }else{
                c20.visibility= VISIBLE
            }
        }
        c15.setOnClickListener {
            right++
            c15.visibility=GONE
            rand=(1..20).random()
            if(rand==1){
                c1.visibility= VISIBLE
            }else if(rand==2){
                c2.visibility= VISIBLE
            }else if(rand==3){
                c3.visibility= VISIBLE
            }else if(rand==4){
                c4.visibility= VISIBLE
            }else if(rand==5){
                c5.visibility= VISIBLE
            }else if(rand==6){
                c6.visibility= VISIBLE
            }else if(rand==7){
                c7.visibility= VISIBLE
            }else if(rand==8){
                c8.visibility= VISIBLE
            }else if(rand==9){
                c9.visibility= VISIBLE
            }else if(rand==10){
                c10.visibility= VISIBLE
            }else if(rand==11){
                c11.visibility= VISIBLE
            }else if(rand==12){
                c12.visibility= VISIBLE
            }else if(rand==13){
                c13.visibility= VISIBLE
            }else if(rand==14){
                c14.visibility= VISIBLE
            }else if(rand==15){
                c15.visibility= VISIBLE
            }else if(rand==16){
                c16.visibility= VISIBLE
            }else if(rand==17){
                c17.visibility= VISIBLE
            }else if(rand==18){
                c18.visibility= VISIBLE
            }else if(rand==19){
                c19.visibility= VISIBLE
            }else{
                c20.visibility= VISIBLE
            }
        }
        c14.setOnClickListener {
            right++
            c14.visibility=GONE
            rand=(1..20).random()
            if(rand==1){
                c1.visibility= VISIBLE
            }else if(rand==2){
                c2.visibility= VISIBLE
            }else if(rand==3){
                c3.visibility= VISIBLE
            }else if(rand==4){
                c4.visibility= VISIBLE
            }else if(rand==5){
                c5.visibility= VISIBLE
            }else if(rand==6){
                c6.visibility= VISIBLE
            }else if(rand==7){
                c7.visibility= VISIBLE
            }else if(rand==8){
                c8.visibility= VISIBLE
            }else if(rand==9){
                c9.visibility= VISIBLE
            }else if(rand==10){
                c10.visibility= VISIBLE
            }else if(rand==11){
                c11.visibility= VISIBLE
            }else if(rand==12){
                c12.visibility= VISIBLE
            }else if(rand==13){
                c13.visibility= VISIBLE
            }else if(rand==14){
                c14.visibility= VISIBLE
            }else if(rand==15){
                c15.visibility= VISIBLE
            }else if(rand==16){
                c16.visibility= VISIBLE
            }else if(rand==17){
                c17.visibility= VISIBLE
            }else if(rand==18){
                c18.visibility= VISIBLE
            }else if(rand==19){
                c19.visibility= VISIBLE
            }else{
                c20.visibility= VISIBLE
            }
        }
        c13.setOnClickListener {
            right++
            c13.visibility=GONE
            rand=(1..20).random()
            if(rand==1){
                c1.visibility= VISIBLE
            }else if(rand==2){
                c2.visibility= VISIBLE
            }else if(rand==3){
                c3.visibility= VISIBLE
            }else if(rand==4){
                c4.visibility= VISIBLE
            }else if(rand==5){
                c5.visibility= VISIBLE
            }else if(rand==6){
                c6.visibility= VISIBLE
            }else if(rand==7){
                c7.visibility= VISIBLE
            }else if(rand==8){
                c8.visibility= VISIBLE
            }else if(rand==9){
                c9.visibility= VISIBLE
            }else if(rand==10){
                c10.visibility= VISIBLE
            }else if(rand==11){
                c11.visibility= VISIBLE
            }else if(rand==12){
                c12.visibility= VISIBLE
            }else if(rand==13){
                c13.visibility= VISIBLE
            }else if(rand==14){
                c14.visibility= VISIBLE
            }else if(rand==15){
                c15.visibility= VISIBLE
            }else if(rand==16){
                c16.visibility= VISIBLE
            }else if(rand==17){
                c17.visibility= VISIBLE
            }else if(rand==18){
                c18.visibility= VISIBLE
            }else if(rand==19){
                c19.visibility= VISIBLE
            }else{
                c20.visibility= VISIBLE
            }
        }
        c12.setOnClickListener {
            right++
            c12.visibility=GONE
            rand=(1..20).random()
            if(rand==1){
                c1.visibility= VISIBLE
            }else if(rand==2){
                c2.visibility= VISIBLE
            }else if(rand==3){
                c3.visibility= VISIBLE
            }else if(rand==4){
                c4.visibility= VISIBLE
            }else if(rand==5){
                c5.visibility= VISIBLE
            }else if(rand==6){
                c6.visibility= VISIBLE
            }else if(rand==7){
                c7.visibility= VISIBLE
            }else if(rand==8){
                c8.visibility= VISIBLE
            }else if(rand==9){
                c9.visibility= VISIBLE
            }else if(rand==10){
                c10.visibility= VISIBLE
            }else if(rand==11){
                c11.visibility= VISIBLE
            }else if(rand==12){
                c12.visibility= VISIBLE
            }else if(rand==13){
                c13.visibility= VISIBLE
            }else if(rand==14){
                c14.visibility= VISIBLE
            }else if(rand==15){
                c15.visibility= VISIBLE
            }else if(rand==16){
                c16.visibility= VISIBLE
            }else if(rand==17){
                c17.visibility= VISIBLE
            }else if(rand==18){
                c18.visibility= VISIBLE
            }else if(rand==19){
                c19.visibility= VISIBLE
            }else{
                c20.visibility= VISIBLE
            }
        }
        c11.setOnClickListener {
            right++
            c11.visibility=GONE
            rand=(1..20).random()
            if(rand==1){
                c1.visibility= VISIBLE
            }else if(rand==2){
                c2.visibility= VISIBLE
            }else if(rand==3){
                c3.visibility= VISIBLE
            }else if(rand==4){
                c4.visibility= VISIBLE
            }else if(rand==5){
                c5.visibility= VISIBLE
            }else if(rand==6){
                c6.visibility= VISIBLE
            }else if(rand==7){
                c7.visibility= VISIBLE
            }else if(rand==8){
                c8.visibility= VISIBLE
            }else if(rand==9){
                c9.visibility= VISIBLE
            }else if(rand==10){
                c10.visibility= VISIBLE
            }else if(rand==11){
                c11.visibility= VISIBLE
            }else if(rand==12){
                c12.visibility= VISIBLE
            }else if(rand==13){
                c13.visibility= VISIBLE
            }else if(rand==14){
                c14.visibility= VISIBLE
            }else if(rand==15){
                c15.visibility= VISIBLE
            }else if(rand==16){
                c16.visibility= VISIBLE
            }else if(rand==17){
                c17.visibility= VISIBLE
            }else if(rand==18){
                c18.visibility= VISIBLE
            }else if(rand==19){
                c19.visibility= VISIBLE
            }else{
                c20.visibility= VISIBLE
            }
        }
        c10.setOnClickListener {
            right++
            c10.visibility=GONE
            rand=(1..20).random()
            if(rand==1){
                c1.visibility= VISIBLE
            }else if(rand==2){
                c2.visibility= VISIBLE
            }else if(rand==3){
                c3.visibility= VISIBLE
            }else if(rand==4){
                c4.visibility= VISIBLE
            }else if(rand==5){
                c5.visibility= VISIBLE
            }else if(rand==6){
                c6.visibility= VISIBLE
            }else if(rand==7){
                c7.visibility= VISIBLE
            }else if(rand==8){
                c8.visibility= VISIBLE
            }else if(rand==9){
                c9.visibility= VISIBLE
            }else if(rand==10){
                c10.visibility= VISIBLE
            }else if(rand==11){
                c11.visibility= VISIBLE
            }else if(rand==12){
                c12.visibility= VISIBLE
            }else if(rand==13){
                c13.visibility= VISIBLE
            }else if(rand==14){
                c14.visibility= VISIBLE
            }else if(rand==15){
                c15.visibility= VISIBLE
            }else if(rand==16){
                c16.visibility= VISIBLE
            }else if(rand==17){
                c17.visibility= VISIBLE
            }else if(rand==18){
                c18.visibility= VISIBLE
            }else if(rand==19){
                c19.visibility= VISIBLE
            }else{
                c20.visibility= VISIBLE
            }
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
        }

        startBtn.setOnClickListener {
            rand=(1..20).random()
            if(rand==1){
                c1.visibility= VISIBLE
            }else if(rand==2){
                c2.visibility= VISIBLE
            }else if(rand==3){
                c3.visibility= VISIBLE
            }else if(rand==4){
                c4.visibility= VISIBLE
            }else if(rand==5){
                c5.visibility= VISIBLE
            }else if(rand==6){
                c6.visibility= VISIBLE
            }else if(rand==7){
                c7.visibility= VISIBLE
            }else if(rand==8){
                c8.visibility= VISIBLE
            }else if(rand==9){
                c9.visibility= VISIBLE
            }else if(rand==10){
                c10.visibility= VISIBLE
            }else if(rand==11){
                c11.visibility= VISIBLE
            }else if(rand==12){
                c12.visibility= VISIBLE
            }else if(rand==13){
                c13.visibility= VISIBLE
            }else if(rand==14){
                c14.visibility= VISIBLE
            }else if(rand==15){
                c15.visibility= VISIBLE
            }else if(rand==16){
                c16.visibility= VISIBLE
            }else if(rand==17){
                c17.visibility= VISIBLE
            }else if(rand==18){
                c18.visibility= VISIBLE
            }else if(rand==19){
                c19.visibility= VISIBLE
            }else{
                c20.visibility= VISIBLE
            }
            fin=0
            right=0
            wrong=0
            resetBtn.visibility= View.GONE
            startBtn.visibility= View.GONE
            object : CountDownTimer(30000, 1000){
                override fun onTick(p0: Long) {
                    timer.text= (p0/1000).toString()
                }

                override fun onFinish() {
                    correctText.text="CORRECT: " + right.toString()
                    wrongText.text="WRONG: "+wrong.toString()
                    timer.text="0"
                    resetBtn.visibility= View.VISIBLE
                    fin=1
                    tappingScreen.visibility=GONE
                    correctText.visibility= VISIBLE
                    wrongText.visibility=VISIBLE
                    c1.visibility=GONE
                    c2.visibility=GONE
                    c3.visibility=GONE
                    c4.visibility=GONE
                    c5.visibility=GONE
                    c6.visibility=GONE
                    c7.visibility=GONE
                    c8.visibility=GONE
                    c9.visibility=GONE
                    c10.visibility=GONE
                    c11.visibility=GONE
                    c12.visibility=GONE
                    c13.visibility=GONE
                    c14.visibility=GONE
                    c15.visibility=GONE
                    c16.visibility=GONE
                    c17.visibility=GONE
                    c18.visibility=GONE
                    c19.visibility=GONE
                    c20.visibility=GONE

                }
            }.start()
        }

    }
}