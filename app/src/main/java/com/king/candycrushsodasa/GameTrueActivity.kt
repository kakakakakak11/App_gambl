package com.king.candycrushsodasa

import io.github.a26197993b77e31a4.o7b471d74a5346efb54aa326b892daf01d914ce99.ObfStr
import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.os.Handler
import android.os.Looper
import android.os.Process
import android.view.View
import android.view.animation.AlphaAnimation
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import io.github.a26197993b77e31a4.o7b471d74a5346efb54aa326b892daf01d914ce99.ObfustringThis
import io.michaelrocks.paranoid.Obfuscate
import kotlinx.android.synthetic.main.activity_game_true.*
import kotlinx.android.synthetic.main.activity_game_true.btn_start_wheel
import kotlinx.android.synthetic.main.activity_game_true.score_bet
import kotlinx.android.synthetic.main.activity_game_true.score_bet_minus
import kotlinx.android.synthetic.main.activity_game_true.score_bet_plus
import kotlinx.android.synthetic.main.activity_game_true.text_score
import kotlin.random.Random
@ObfustringThis
@Obfuscate
class GameTrueActivity : AppCompatActivity() {
    var random1 = 0
    var random2 = 0
    val arrayCardsA =
        arrayOf(R.mipmap.asset_a1, R.mipmap.asset_a3, R.mipmap.asset_a2, R.mipmap.asset_a4)
    val arrayCardsV =
        arrayOf(R.mipmap.asset_v1, R.mipmap.asset_v3, R.mipmap.asset_v2, R.mipmap.asset_v4)
    val arrayCardsD =
        arrayOf(R.mipmap.asset_d1, R.mipmap.asset_d3, R.mipmap.asset_d2, R.mipmap.asset_d4)
    val arrayCardsK =
        arrayOf(R.mipmap.asset_k1, R.mipmap.asset_k3, R.mipmap.asset_k2, R.mipmap.asset_k4)
    val arrayCardsVoid = arrayOf(6, 7, 8, 9, 10)
    val arrayCardsAA =
        arrayOf(R.mipmap.asset_a11, R.mipmap.asset_a33, R.mipmap.asset_a22, R.mipmap.asset_a44)
    val arrayCards = arrayOf(
        arrayCardsA,
        arrayCardsK,
        arrayCardsD,
        arrayCardsV,
        arrayCardsAA,
        arrayCardsAA,
        arrayCardsAA,
        arrayCardsAA,
        arrayCardsAA
    )
    val arrayDice = arrayOf(
        R.mipmap.dice1,
        R.mipmap.dice2,
        R.mipmap.dice3,
        R.mipmap.dice4,
        R.mipmap.dice5,
        R.mipmap.dice6
    )
    var startGame = 0
    val status = true
    var timer: CountDownTimer? = null

    var WIN = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_true)
        startRotationCards(imageView_cart1, textCards1, textCards1_2, -1)
        startRotationCards(imageView_cart2, textCards2, textCards2_2, -1)
        startRotationCards(imageView_cart3, textCards3, textCards3_2, -1)
        text_score.text = SCORE.toString()

        menu_back.setOnClickListener {
            animMenuBack(1.0f, 0.0f, true, R.anim.anim_btn)
        }
        btn_back_menu_two.setOnClickListener {
            animMenuBack(0.0f, 1.0f, false, R.anim.anim_reverse)
        }

        btn_rules_back.setOnClickListener {
            MenuActivity().startDialogRules(this)
        }
        btn_exit_back.setOnClickListener {
            finishAffinity()
            Process.killProcess(Process.myPid())
        }
        btn_back.setOnClickListener {
            if(status) {
                if (startGame == 2) {
                    startActivity(Intent(this, MenuActivity::class.java))
                    finish()
                } else {
                    Toast(this).showCCToastJk(
                        ObfStr("brazil").v("Xfmotpuv tgm rbde eqctk!"),
                        this,
                        Toast.LENGTH_SHORT
                    )
                }
            }else{
                Toast(this).showCCToastJk(
                    ObfStr("brazil").v("Xfmotpuv tgm rbde eqctk!"),
                    this,
                    Toast.LENGTH_SHORT
                )
            }
        }

        score_bet_plus.setOnClickListener {
            if (startGame != 2) {
                if (startGame == 0){
                    if(SCORE - BET >= 200) {
                        if (BET + 100 <= SCORE) {
                            BET += 100
                        } else {
                            Toast(this).showCCToastJk(
                                ObfStr("brazil").v("Tfu cwy'u xes xzjetr"),
                                this,
                                Toast.LENGTH_SHORT
                            )
                        }
                        score_bet.text = BET.toString()
                    }
                }else {
                    if (BET + 100 <= SCORE) {
                        BET += 100
                    } else {
                        Toast(this).showCCToastJk(
                            ObfStr("brazil").v("Tfu cwy'u xes xzjetr"),
                            this,
                            Toast.LENGTH_SHORT
                        )
                    }
                    score_bet.text = BET.toString()
                }
            } else {
                Toast(this).showCCToastJk(
                    ObfStr("brazil").v("qiera Wpcl sw durrs bsf xalm!"),
                    this,
                    Toast.LENGTH_SHORT
                )
            }
        }
        score_bet_minus.setOnClickListener {
            if (BET >= 100) {
                BET -= 100
            }
            score_bet.text = BET.toString()
        }
        btn_start_wheel.setOnClickListener {
            if (startGame == 2) {
                btn_start_wheel.isClickable = false
                startGame = 0
                reverseAllCards(imageView_cart1, textCards1, textCards1_2)
                reverseAllCards(imageView_cart2, textCards2, textCards2_2)
                reverseAllCards(imageView_cart3, textCards3, textCards3_2)
                reverseAllCards(imageView_cart4, textCards4, textCards4_2)
                reverseAllCards(imageView_cart5, textCards5, textCards5_2)
                Handler(Looper.getMainLooper()).postDelayed(Runnable {
                    startRotationCards(imageView_cart1, textCards1, textCards1_2, -1)
                    startRotationCards(imageView_cart2, textCards2, textCards2_2, -1)
                    startRotationCards(imageView_cart3, textCards3, textCards3_2, -1)
                    btn_start_wheel.isClickable = true
                }, 1500)
                BET = 0
                WIN = 0
                score_bet.text = BET.toString()
            } else {
                startRoll()
            }
        }

    }

    fun animMenuBack(
        alphaStart: Float,
        alphaFinish: Float,
        startMenu: Boolean,
        animReverse: Int,
    ) {
        val animation: Animation = AlphaAnimation(alphaStart, alphaFinish)
        animation.duration = 500
        animation.startOffset = 50
        menu_back.startAnimation(animation)
        linear_game.startAnimation(animation)
        Handler().postDelayed({
            if (startMenu) {
                linear_game.visibility = View.INVISIBLE
                menu_back.visibility = View.INVISIBLE
                layout_anim_back.visibility = View.VISIBLE
            } else {
                linear_game.visibility = View.VISIBLE
                menu_back.visibility = View.VISIBLE
                layout_anim_back.visibility = View.INVISIBLE
            }
        }, 500)
        val animationBtn: Animation = AnimationUtils.loadAnimation(this, animReverse)
        layout_anim_back.startAnimation(animationBtn)
    }

    private fun reverseAllCards(imageView: ImageView, textView1: TextView, textView2: TextView) {
        imageView.animate().rotationY(90f).setDuration(500).withEndAction {
            textView1.apply {
                visibility = View.INVISIBLE
            }
            textView2.apply {
                visibility = View.INVISIBLE
            }
            imageView.setImageResource(R.mipmap.koloda)
            imageView.animate().rotationY(180f).setDuration(500).start()
            imageView.setTag(0)
        }
    }

    private fun startRoll() {
        btn_start_wheel.isClickable = false
        if (BET >= 100) {
            SCORE -= BET
            WIN += BET
            text_score.text = SCORE.toString()
            timer = object : CountDownTimer(2000, 80) {
                var random = 0

                @SuppressLint("SetTextI18n")
                override fun onTick(p0: Long) {
                    random = Random.nextInt(arrayDice.size - 1)
                    imageViewDice.setImageResource(arrayDice[random])
                }

                @SuppressLint("SetTextI18n")
                override fun onFinish() {
                    val numberOrnonum = Random.nextBoolean()
                    if (numberOrnonum) {
                        if (random == 5) random = 4
                    } else {
                        var par = 0
                        if (random == 1) {
                            par = 5
                        } else if (random == 2) {
                            par = 6
                        } else if (random == 3) {
                            par = 7
                        } else if (random >= 4) {
                            par = 8
                        }
                        random = par
                    }
                    if (startGame == 0) {
                        startRotationCards(imageView_cart4, textCards4, textCards4_2, random)
                        startGame += 1
                    } else if (startGame == 1) {
                        startGame += 1
                        startRotationCards(imageView_cart5, textCards5, textCards5_2, random)
                        Handler(Looper.getMainLooper()).postDelayed(Runnable {
                            startEndGame()
                        }, 1000)

                    }
                    BET = 0
                    score_bet.text = BET.toString()
                    btn_start_wheel.isClickable = true
                }
            }
            timer?.start()

        } else {
            btn_start_wheel.isClickable = true
            Toast(this).showCCToastJk(
                ObfStr("brazil").v("Nvt spp wrltm!"),
                this,
                Toast.LENGTH_SHORT
            )
        }
    }

    private fun startEndGame() {
        val arrayTags = listOf<String>(
            imageView_cart1.tag.toString(),
            imageView_cart2.tag.toString(),
            imageView_cart3.tag.toString(),
            imageView_cart4.tag.toString(),
            imageView_cart5.tag.toString()
        )
        val arrayFilter = arrayTags.groupingBy { it }.eachCount().filter { it.value > 1 }
        if (arrayFilter.size == 2) {
            if ((imageView_cart1.tag.toString() == imageView_cart2.tag.toString() && imageView_cart2.tag.toString() == imageView_cart3.tag.toString())
                || (imageView_cart1.tag.toString() == imageView_cart2.tag.toString() && imageView_cart2.tag.toString() == imageView_cart4.tag.toString())
                || (imageView_cart1.tag.toString() == imageView_cart2.tag.toString() && imageView_cart2.tag.toString() == imageView_cart5.tag.toString())
                || (imageView_cart2.tag.toString() == imageView_cart3.tag.toString() && imageView_cart3.tag.toString() == imageView_cart4.tag.toString())
                || (imageView_cart2.tag.toString() == imageView_cart3.tag.toString() && imageView_cart3.tag.toString() == imageView_cart5.tag.toString())
                || (imageView_cart1.tag.toString() == imageView_cart3.tag.toString() && imageView_cart3.tag.toString() == imageView_cart4.tag.toString())
                || (imageView_cart1.tag.toString() == imageView_cart3.tag.toString() && imageView_cart3.tag.toString() == imageView_cart4.tag.toString())
                || (imageView_cart1.tag.toString() == imageView_cart4.tag.toString() && imageView_cart4.tag.toString() == imageView_cart5.tag.toString())
                || (imageView_cart2.tag.toString() == imageView_cart4.tag.toString() && imageView_cart4.tag.toString() == imageView_cart5.tag.toString())
                || (imageView_cart3.tag.toString() == imageView_cart4.tag.toString() && imageView_cart4.tag.toString() == imageView_cart5.tag.toString())
            ) {
                WIN += BET * 2
            }
            WIN += BET / 2 + BET / 4
        } else if (arrayFilter.size == 1) {
            if ((imageView_cart1.tag.toString() == imageView_cart2.tag.toString() && imageView_cart2.tag.toString() == imageView_cart3.tag.toString() && imageView_cart3.tag.toString() == imageView_cart4.tag.toString()) ||
                (imageView_cart1.tag.toString() == imageView_cart2.tag.toString() && imageView_cart2.tag.toString() == imageView_cart3.tag.toString() && imageView_cart3.tag.toString() == imageView_cart5.tag.toString()) ||
                (imageView_cart1.tag.toString() == imageView_cart2.tag.toString() && imageView_cart2.tag.toString() == imageView_cart4.tag.toString() && imageView_cart4.tag.toString() == imageView_cart5.tag.toString()) ||
                (imageView_cart1.tag.toString() == imageView_cart3.tag.toString() && imageView_cart3.tag.toString() == imageView_cart4.tag.toString() && imageView_cart4.tag.toString() == imageView_cart5.tag.toString()) ||
                (imageView_cart2.tag.toString() == imageView_cart3.tag.toString() && imageView_cart3.tag.toString() == imageView_cart4.tag.toString() && imageView_cart4.tag.toString() == imageView_cart5.tag.toString())
            ) {
                WIN += BET * 3
            } else if ((imageView_cart1.tag.toString() == imageView_cart2.tag.toString() && imageView_cart2.tag.toString() == imageView_cart3.tag.toString())
                || (imageView_cart1.tag.toString() == imageView_cart2.tag.toString() && imageView_cart2.tag.toString() == imageView_cart4.tag.toString())
                || (imageView_cart1.tag.toString() == imageView_cart2.tag.toString() && imageView_cart2.tag.toString() == imageView_cart5.tag.toString())
                || (imageView_cart2.tag.toString() == imageView_cart3.tag.toString() && imageView_cart3.tag.toString() == imageView_cart4.tag.toString())
                || (imageView_cart2.tag.toString() == imageView_cart3.tag.toString() && imageView_cart3.tag.toString() == imageView_cart5.tag.toString())
                || (imageView_cart1.tag.toString() == imageView_cart3.tag.toString() && imageView_cart3.tag.toString() == imageView_cart4.tag.toString())
                || (imageView_cart1.tag.toString() == imageView_cart3.tag.toString() && imageView_cart3.tag.toString() == imageView_cart4.tag.toString())
                || (imageView_cart1.tag.toString() == imageView_cart4.tag.toString() && imageView_cart4.tag.toString() == imageView_cart5.tag.toString())
                || (imageView_cart2.tag.toString() == imageView_cart4.tag.toString() && imageView_cart4.tag.toString() == imageView_cart5.tag.toString())
                || (imageView_cart3.tag.toString() == imageView_cart4.tag.toString() && imageView_cart4.tag.toString() == imageView_cart5.tag.toString())
            ) {
                WIN += BET
            }

            WIN += BET / 2
        } else if (arrayFilter.isEmpty()) {
            WIN = 0
        }
        BET = 0
        SCORE += WIN
        text_score.text = SCORE.toString()
        score_bet.text = BET.toString()
    }

    @SuppressLint("ResourceAsColor")
    fun startRotationCards(
        im: ImageView,
        textView1: TextView,
        textView2: TextView,
        parameters: Int
    ) {
        im.animate().rotationY(90f).setDuration(500).withEndAction {
            var tag = 0
            if (parameters != -1) {
                if (parameters >= 3) {
                    if (parameters == 1) {
                        random1 = 3
                        random2 = Random.nextInt(arrayCardsV.size - 1)
                    } else if (parameters == 2) {
                        random1 = 2
                        random2 = Random.nextInt(arrayCardsV.size - 1)
                    } else if (parameters == 3) {
                        random1 = 1
                        random2 = Random.nextInt(arrayCardsV.size - 1)
                    } else if (parameters >= 4) {
                        random1 = 0
                        random2 = Random.nextInt(arrayCardsV.size - 1)
                    }
                    tag = random1
                    textView1.visibility = View.INVISIBLE
                    textView2.visibility = View.INVISIBLE
                } else {
                    random1 = 4
                    random2 = parameters
                    val randomText = Random.nextInt(arrayCardsVoid.size - 1)
                    tag = arrayCardsVoid[randomText]
                    textView1.apply {
                        visibility = View.VISIBLE
                        text = arrayCardsVoid[randomText].toString()
                    }
                    textView2.apply {
                        visibility = View.VISIBLE
                        text = arrayCardsVoid[randomText].toString()
                    }
                }
            } else {
                random1 = Random.nextInt(arrayCards.size - 1)
                random2 = Random.nextInt(arrayCardsA.size - 1)
                if (random1 >= 4) {
                    val randomText = Random.nextInt(arrayCardsVoid.size - 1)
                    tag = arrayCardsVoid[randomText]
                    textView1.apply {
                        visibility = View.VISIBLE
                        text = arrayCardsVoid[randomText].toString()
                    }
                    textView2.apply {
                        visibility = View.VISIBLE
                        text = arrayCardsVoid[randomText].toString()
                    }
                } else {
                    tag = random1
                    textView1.visibility = View.INVISIBLE
                    textView2.visibility = View.INVISIBLE
                }
            }
            im.setImageResource(arrayCards[random1][random2])
            im.animate().rotationY(180f).setDuration(500).start()
            im.setTag(tag)

        }
    }

    override fun onBackPressed() {
    }
}