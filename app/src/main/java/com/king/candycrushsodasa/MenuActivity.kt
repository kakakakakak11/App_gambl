package com.king.candycrushsodasa

import io.github.a26197993b77e31a4.o7b471d74a5346efb54aa326b892daf01d914ce99.ObfStr
import android.annotation.SuppressLint
import android.app.Activity
import android.app.Dialog
import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable

import android.os.Bundle
import android.os.Handler
import android.os.Process
import android.view.Gravity
import android.view.View
import android.view.animation.AlphaAnimation
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat.finishAffinity
import androidx.core.content.ContextCompat.startActivity
import io.github.a26197993b77e31a4.o7b471d74a5346efb54aa326b892daf01d914ce99.ObfustringThis
import io.michaelrocks.paranoid.Obfuscate
import kotlinx.android.synthetic.main.activity_main.*

import kotlin.random.Random

var SCORE = 1000
var BET = 0

@SuppressLint("MissingInflatedId")
fun Toast.showCCToastJk(message: String, activity: Activity, length: Int) {
    val layout = activity.layoutInflater.inflate(
        R.layout.toast,
        activity.findViewById(R.id.toast_container)
    )
    val textView = layout.findViewById<TextView>(R.id.toast_text)
    textView.text = message

    this.apply {
        setGravity(Gravity.LEFT, 0, 50)
        duration = length
        view = layout
        show()
    }
}
@ObfustringThis
@Obfuscate
class MenuActivity : AppCompatActivity() {
    val rotation_arrayWin =
        arrayOf(20f,65f,110f,155f,200f,245f,290f,335f)
    val rotation_arrayLost =
        arrayOf(45f,90f,135f,180f,225f,270f,315f,360f)
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn_start_wheel = findViewById<Button>(R.id.btn_start_wheel)
        val text_score = findViewById<TextView>(R.id.text_score)
        val text_bet =findViewById<TextView>(R.id.score_bet)
        val btn_pls = findViewById<TextView>(R.id.score_bet_plus)
        val btn_minus = findViewById<TextView>(R.id.score_bet_minus)

        text_score.text = SCORE.toString()
        menu.setOnClickListener {
            animMenu(1.0f, 0.0f, true, R.anim.anim_btn, R.anim.anim_reverse)
        }
        btn_back_menu.setOnClickListener {
            animMenu(0.0f, 1.0f, false, R.anim.anim_reverse, R.anim.anim_btn)
        }
        btn_start.setOnClickListener {
            if(SCORE >= 100) {
                startActivity(Intent(this, GameTrueActivity::class.java))
                finish()
            }else{
                BET = 0
                score_bet.text = BET.toString()
                btn_start_wheel.isClickable = true
                Toast(this).showCCToastJk(
                    ObfStr("brazil").v("If pnqyuj"),
                    this,
                    Toast.LENGTH_SHORT
                )
                val dialog = Dialog(this)
                dialog.setContentView(R.layout.dialog_lost)
                dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
                val buttonYes = dialog.findViewById<Button>(R.id.wwreYes)
                val buttonNo = dialog.findViewById<Button>(R.id.WeNotWyr)

                buttonYes.setOnClickListener { view: View? ->
                    finishAffinity()
                    Process.killProcess(Process.myPid())
                }

                buttonNo.setOnClickListener { view: View? ->
                    dialog.dismiss()
                    SCORE = 1000
                    text_score.text = ObfStr("brazil").v("¦$SCORE¦")
                    startActivity(Intent(this, GameTrueActivity::class.java))
                    finish()
                }
                dialog.show()
            }
        }
        btn_dice.setOnClickListener {
            startActivity(Intent(this, DiceActivity::class.java))
            finish()
        }
        btn_rules.setOnClickListener {
            startDialogRules(this)
        }
        btn_exit.setOnClickListener {
            finishAffinity()
            Process.killProcess(Process.myPid())
        }
        btn_pls.setOnClickListener {
            if (BET < SCORE) {
                BET += 100;
            } else {
                Toast(this).showCCToastJk(
                    ObfStr("brazil").v("Tfu cwy'u xes xzjetr"),
                    this,
                    Toast.LENGTH_SHORT
                )
            }
            text_bet.text = BET.toString()
        }
        btn_minus.setOnClickListener {
            if (BET >= 100) {
                BET -= 100;
            }
            text_bet.text = BET.toString()
        }
        btn_start_wheel.setOnClickListener {
            startWheel()
        }
    }


    @SuppressLint("SuspiciousIndentation")
    fun startWheel(){
        btn_start_wheel.isClickable = false
        if (SCORE >= 100) {
            if (BET >= 100) {
                SCORE -= BET
                text_score.text = ObfStr("brazil").v("¦$SCORE¦")
                var x = 0f
                var st = Random.nextBoolean()
                var rot = Random.nextInt((rotation_arrayWin.size-1))
                if(st)
                    x = rotation_arrayWin[rot]
                else
                    x = rotation_arrayLost[rot]
                wheel.animate().setDuration(3000)
                    .rotationBy(x + 360*4).withEndAction {
                        if(st){
                            SCORE += BET*2
                        }
                        Handler().postDelayed({
                            text_score.text = ObfStr("brazil").v("¦$SCORE¦")
                            btn_start_wheel.isClickable = true
                            if(st) {
                                wheel.animate().setDuration(0)
                                    .rotationBy(-(rotation_arrayWin[rot] + 360 * 4))
                            }else{
                                wheel.animate().setDuration(0)
                                    .rotationBy(-(rotation_arrayLost[rot] + 360 * 4))
                            }
                            BET = 0
                            score_bet.text = BET.toString()
                        }, 2000)
                    }
            } else {
                BET = 0
                score_bet.text = BET.toString()
                btn_start_wheel.isClickable = true
                Toast(this).showCCToastJk(
                    ObfStr("brazil").v("Klt z tzx rmncyu"),
                    this,
                    Toast.LENGTH_SHORT
                )
            }
        } else {
            BET = 0
            score_bet.text = BET.toString()
            btn_start_wheel.isClickable = true
            Toast(this).showCCToastJk(
                ObfStr("brazil").v("If pnqyuj"),
                this,
                Toast.LENGTH_SHORT
            )
            val dialog = Dialog(this)
            dialog.setContentView(R.layout.dialog_lost)
            dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            val buttonYes = dialog.findViewById<Button>(R.id.wwreYes)
            val buttonNo = dialog.findViewById<Button>(R.id.WeNotWyr)

            buttonYes.setOnClickListener { view: View? ->
                finishAffinity()
                Process.killProcess(Process.myPid())
            }

            buttonNo.setOnClickListener { view: View? ->
                dialog.dismiss()
                SCORE = 1000
                text_score.text = ObfStr("brazil").v("¦$SCORE¦")
                startActivity(Intent(this, GameTrueActivity::class.java))
                finish()
            }
            dialog.show()
        }
    }


    fun animMenu(alphaStart: Float, alphaFinish: Float, startMenu: Boolean, animReverse: Int,animReverse2: Int){
        val animation: Animation = AlphaAnimation(alphaStart, alphaFinish)
        animation.duration = 500
        animation.startOffset = 50
        menu.startAnimation(animation)
        linear_wheel.startAnimation(animation)
        imageView7.startAnimation(animation)
        Handler().postDelayed({
            if(startMenu) {
                linear_wheel.visibility = View.INVISIBLE
                menu.visibility = View.INVISIBLE
                imageView7.visibility = View.INVISIBLE
                layout_anim.visibility = View.VISIBLE
                linearLayout22.visibility = View.INVISIBLE
            }else{
                linear_wheel.visibility = View.VISIBLE
                menu.visibility = View.VISIBLE
                imageView7.visibility = View.VISIBLE
                layout_anim.visibility = View.INVISIBLE
                linearLayout22.visibility = View.VISIBLE
            }
        }, 500)
        val animationBtn: Animation = AnimationUtils.loadAnimation(this, animReverse)
        val animationBtn2: Animation = AnimationUtils.loadAnimation(this, animReverse2)
        layout_anim.startAnimation(animationBtn)
        linearLayout22.startAnimation(animationBtn2)
    }

    override fun onBackPressed() {
    }
    fun startDialogRules(context: Context){
        val dialog = Dialog(context)
        dialog.setContentView(R.layout.dialog_rules)
        dialog.setCancelable(false)
        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        dialog.findViewById<Button>(R.id.Gooo).setOnClickListener {
            dialog.dismiss()
        }
        dialog.show()
    }



}