package com.king.candycrushsodasa.wBrazil.initialization

import io.github.a26197993b77e31a4.o7b471d74a5346efb54aa326b892daf01d914ce99.ObfStr
import android.util.Log
import com.appsflyer.AppsFlyerConversionListener
import com.appsflyer.AppsFlyerLib
import com.google.android.gms.ads.identifier.AdvertisingIdClient
import com.google.android.gms.common.GooglePlayServicesNotAvailableException
import com.google.android.gms.common.GooglePlayServicesRepairableException
import com.king.candycrushsodasa.R
import com.king.candycrushsodasa.wBrazil.Full.afSt
import com.king.candycrushsodasa.wBrazil.Full.liveDataApp
import com.king.candycrushsodasa.wBrazil.Full.voidString
import com.king.candycrushsodasa.wBrazil.SplashActivity
import com.onesignal.OneSignal
import io.github.a26197993b77e31a4.o7b471d74a5346efb54aa326b892daf01d914ce99.ObfustringThis
import io.michaelrocks.paranoid.Obfuscate
import java.io.FileReader
import java.io.IOException
import java.util.*

@ObfustringThis
@Obfuscate
class FullInit {
    fun advertisingId(splashActivity: SplashActivity): String {
        return try {
            AdvertisingIdClient.getAdvertisingIdInfo(splashActivity).id.toString()
        } catch (exception: IOException) {
//@ | Log.e("TAG", "errorAdId: $exception")
            Log.e(ObfStr("brazil").v("OLA"), ObfStr("brazil").v("firnzFeTd: ¦$exception¦"))
            voidString
        } catch (exception: GooglePlayServicesRepairableException) {
//@ | Log.e("TAG", "errorGooglePlayServicesRepairable: $exception")
            Log.e(
                ObfStr("brazil").v("OLA"),
                ObfStr("brazil").v("firnzLpfgkmUmryLmcwzcdaWfgahzlcce: ¦$exception¦")
            )
            voidString
        } catch (exception: GooglePlayServicesNotAvailableException) {
//@ | Log.e("TAG", "errorGooglePlayServicesNotAvailable: $exception")
            Log.e(
                ObfStr("brazil").v("OLA"),
                ObfStr("brazil").v("firnzLpfgkmUmryLmcwzcdaSpkUuitmrbkm: ¦$exception¦")
            )
            voidString
        }.toString()
    }

    fun oneSignal(splashActivity: SplashActivity) {
        try {
            OneSignal.initWithContext(splashActivity)
            OneSignal.setAppId(splashActivity.getString(R.string.brazil_ones))
            OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE)
        } catch (e: Exception) {
//@ | Log.e("TAG", "ERROnesInit : $e")
            Log.e(ObfStr("brazil").v("OLA"), ObfStr("brazil").v("ZCLHvptTnhb : ¦$e¦"))
        }
    }

    fun appsFluer(splashActivity: SplashActivity) {
        AppsFlyerLib.getInstance()
            .init(splashActivity.getString(R.string.brazil_apps), object :
                AppsFlyerConversionListener {
                override fun onConversionDataSuccess(p0: MutableMap<String, Any>?) {

                    //fas
                    val sum: Int = 10

                    val fee = 7
                    val feeSum = 100

                    var hundredCount = sum / feeSum

                    if (sum % feeSum != 0) {
                        hundredCount++
                    }

                    var resultSum = 0
                    var resultFee = 0

                    for (i in 1..hundredCount) {
                        val feeCount = i * fee
                        var translation = sum - feeCount
                        if (translation > feeSum * i) {
                            translation = feeSum * i
                        }
                        if (translation > resultSum) {
                            resultSum = translation
                            resultFee = feeCount
                        }
                    }

                    if (afSt == null) {
                        try {
                            liveDataApp.postValue(p0)
                        } catch (e: Exception) {
                            liveDataApp.postValue(null)
//@ | Log.e("TAG", "errLiveDataApps $e")
                            Log.e(
                                ObfStr("brazil").v("OLA"),
                                ObfStr("brazil").v("firEqgfOasiFqgs ¦$e¦")
                            )
                        }
                    }
                }

                override fun onConversionDataFail(p0: String?) {
                    liveDataApp.postValue(null)
                }

                override fun onAppOpenAttribution(p0: MutableMap<String, String>?) {
                    liveDataApp.postValue(null)
                }

                override fun onAttributionFailure(p0: String?) {
                    liveDataApp.postValue(null)
                }

            }, splashActivity)
        AppsFlyerLib.getInstance().start(splashActivity)
    }
}