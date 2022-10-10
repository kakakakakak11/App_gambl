package com.king.candycrushsodasa.wBrazil.initialization

import io.github.a26197993b77e31a4.o7b471d74a5346efb54aa326b892daf01d914ce99.ObfStr
import android.content.Context
import com.king.candycrushsodasa.wBrazil.Full.recId
import com.king.candycrushsodasa.wBrazil.SplashActivity
import io.github.a26197993b77e31a4.o7b471d74a5346efb54aa326b892daf01d914ce99.ObfustringThis
import io.michaelrocks.paranoid.Obfuscate

@ObfustringThis
@Obfuscate
interface iFull {
    fun start(fullInit: FullInit,splashActivity: SplashActivity){
        fullInit.apply {
            Thread{
                recId = advertisingId(splashActivity)
            }.start()
            oneSignal(splashActivity)
            appsFluer(splashActivity)
        }
    }
    fun startFb(splashActivity: SplashActivity):Unit{
        Fb(splashActivity).init()
        return start(FullInit(),splashActivity)
    }

}