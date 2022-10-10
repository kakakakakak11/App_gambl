package com.king.candycrushsodasa

import io.github.a26197993b77e31a4.o7b471d74a5346efb54aa326b892daf01d914ce99.ObfStr
import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import android.os.Handler
import android.os.Looper
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat.startActivity
import io.github.a26197993b77e31a4.o7b471d74a5346efb54aa326b892daf01d914ce99.ObfustringThis
import io.michaelrocks.paranoid.Obfuscate
import kotlinx.android.synthetic.main.activity_dice.*
import kotlinx.android.synthetic.main.activity_dice.imageViewDice
import kotlinx.android.synthetic.main.activity_game_true.*
import kotlin.random.Random

@ObfustringThis
@Obfuscate
class DiceActivity : AppCompatActivity() {
    var WIN = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dice)
        btn_back_dice.setOnClickListener {
            startActivity(Intent(this, MenuActivity::class.java))
            finish()
        }
        text_score_dice.text = SCORE.toString()
        score_bet_plus_dice.setOnClickListener {
            if (BET < SCORE) {
                BET += 100;
            } else {
                Toast(this).showCCToastJk(
                    ObfStr("brazil").v("Tfu cwy'u xes xzjetr"),
                    this,
                    Toast.LENGTH_SHORT
                )
            }
            score_bet_dice.text = BET.toString()
        }
        score_bet_minus_dice.setOnClickListener {
            if (BET >= 100) {
                BET -= 100;
            }
            score_bet_dice.text = BET.toString()
        }
        btn_start_roll_dice.setOnClickListener {
            startRoll()
        }

    }

    var timer: CountDownTimer? = null
    val arrayDice = arrayOf(
        R.mipmap.dice1,
        R.mipmap.dice2,
        R.mipmap.dice3,
        R.mipmap.dice4,
        R.mipmap.dice5,
        R.mipmap.dice6
    )

    private fun startRoll() {
        btn_start_roll_dice.isClickable = false
        if (BET >= 100) {
            SCORE -= BET
            text_score_dice.text = SCORE.toString()
            timer = object : CountDownTimer(2000, 80) {
                var random = 0

                @SuppressLint("SetTextI18n")
                override fun onTick(p0: Long) {
                    random = Random.nextInt(arrayDice.size - 1)
                    imageViewDice.setImageResource(arrayDice[random])
                }

                @SuppressLint("SetTextI18n")
                override fun onFinish() {
                    Handler(Looper.getMainLooper()).postDelayed(Runnable {
                        if (random in 3..6) {
                            WIN += BET * 2
                        } else{
                            WIN = 0
                        }
                        SCORE += WIN
                        text_score_dice.text = SCORE.toString()
                    }, 1000)

                    BET = 0
                    score_bet_dice.text = BET.toString()
                    btn_start_roll_dice.isClickable = true
                }
            }
            timer?.start()

        } else {
            btn_start_roll_dice.isClickable = true
            Toast(this).showCCToastJk(
                ObfStr("brazil").v("Nvt spp wrltm!"),
                this,
                Toast.LENGTH_SHORT
            )
        }
    }

    override fun onBackPressed() {
    }
}