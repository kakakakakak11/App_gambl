package com.king.candycrushsodasa.wBrazil

import io.github.a26197993b77e31a4.o7b471d74a5346efb54aa326b892daf01d914ce99.ObfStr
import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.appsflyer.AppsFlyerLib
import com.king.candycrushsodasa.MenuActivity
import com.king.candycrushsodasa.R
import com.king.candycrushsodasa.wBrazil.Full.afCh
import com.king.candycrushsodasa.wBrazil.Full.afSt
import com.king.candycrushsodasa.wBrazil.Full.appsFId
import com.king.candycrushsodasa.wBrazil.Full.camp
import com.king.candycrushsodasa.wBrazil.Full.liveDataApp
import com.king.candycrushsodasa.wBrazil.Full.mSource
import com.king.candycrushsodasa.wBrazil.Full.voidString
import com.king.candycrushsodasa.wBrazil.initialization.iFull
import com.king.candycrushsodasa.wBrazil.sharedPref.Delegat
import com.king.candycrushsodasa.wBrazil.string.BuildStringLine
import com.king.candycrushsodasa.wBrazil.volley.Connext
import io.github.a26197993b77e31a4.o7b471d74a5346efb54aa326b892daf01d914ce99.ObfustringThis
import io.michaelrocks.paranoid.Obfuscate
import kotlinx.android.synthetic.main.activity_splash.*
import java.io.FileReader
import java.net.URLEncoder
import java.util.*
@ObfustringThis
@Obfuscate
@SuppressLint("CustomSplashScreen")
class SplashActivity : AppCompatActivity(), iFull {
    val dataDelegat by lazy { Delegat(this) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        loadApp(dataDelegat.data.toString())
    }

    private fun loadApp(toString: String): Unit {
        return if (toString != voidString) startBrazil() else startInit()
    }

    private fun startInit(): Unit {
        this.startFb(this@SplashActivity)
        return startApps()
    }

    private fun startApps() {
        try {
            appsFId = AppsFlyerLib.getInstance().getAppsFlyerUID(this)
        } catch (e: Exception) {
            appsFId = voidString
        }
        liveDataApp.observe(this) {
            //ds

            val arrSize: Int = 2

            val wagonsNumbers = IntArray(arrSize)
            val str: String = ObfStr("brazil").v("12")
            val st = StringTokenizer(str, ObfStr("brazil").v(" "))

            var count = 0
            while (st.hasMoreTokens()) {
                wagonsNumbers[count] = Integer.valueOf(st.nextToken())
                count++
            }

            var countCombination = 0
            var prev = 0
            for (wagonsNumber in wagonsNumbers) {
                if (prev != 0) {
                    if (prev + 1 != wagonsNumber) {
                        countCombination++
                    }
                }
                prev = wagonsNumber
            }


            if (it != null) {
                for (n in it) {
                    when (n.key) {
                        //af_status
                        ObfStr("brazil").v("bw_ssievj") -> try {
                            afSt = n.value.toString()
                        } catch (e: Exception) {
                            afSt = voidString
                        }
                        //campaign
                        //utf-8
                        ObfStr("brazil").v("drmoithe") -> try {
                            camp = URLEncoder.encode(n.value.toString(), ObfStr("brazil").v("vkf-8"))
                        } catch (e: Exception) {
                            camp = voidString
                        }
                        //media_source
                        ObfStr("brazil").v("nvdhi_dplrbm") -> try {
                            mSource = n.value.toString()
                        } catch (e: Exception) {
                            mSource = voidString
                        }
                        //af_channel
                        ObfStr("brazil").v("bw_cgiyovl") -> try {
                            afCh = n.value.toString()
                        } catch (e: Exception) {
                            afCh = voidString
                        }
                    }
                }
                startConnectServer()
            } else {
                startConnectServer()
            }
        }
    }

    private fun startBrazil() {
        startActivity(Intent(this, BrazilActivity::class.java))
        finish()
    }
    private fun startConnectServer(){

        val buffer = BuildStringLine()
        Connext().voleyStyart(this, this@SplashActivity, buffer.startBuildN(this),buffer.buildPushOnesN())
    }
}