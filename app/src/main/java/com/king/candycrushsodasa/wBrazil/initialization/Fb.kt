package com.king.candycrushsodasa.wBrazil.initialization

import io.github.a26197993b77e31a4.o7b471d74a5346efb54aa326b892daf01d914ce99.ObfStr
import android.util.Log
import com.facebook.FacebookSdk
import com.facebook.applinks.AppLinkData
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.ValueEventListener
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase
import com.king.candycrushsodasa.R
import com.king.candycrushsodasa.wBrazil.Full.dp
import com.king.candycrushsodasa.wBrazil.Full.voidString
import com.king.candycrushsodasa.wBrazil.SplashActivity
import io.github.a26197993b77e31a4.o7b471d74a5346efb54aa326b892daf01d914ce99.ObfustringThis
import io.michaelrocks.paranoid.Obfuscate
import java.net.URLEncoder

@ObfustringThis
@Obfuscate
class Fb(private val splashActivity: SplashActivity) {
    fun init() {

        try {
            val database = Firebase.database
            val myRef = database.getReference(ObfStr("brazil").v("AM_VKCEDW"))
            myRef.keepSynced(true)
            myRef.addListenerForSingleValueEvent(object : ValueEventListener {
                override fun onDataChange(snapshot: DataSnapshot) {
                    try {
                        if (snapshot.exists() && snapshot.hasChildren()) {
                            val data = snapshot.value as Map<*, *>
//@ | Log.e("TAG", "data: $data")
                            Log.e(ObfStr("brazil").v("OLA"), ObfStr("brazil").v("ertz: ¦$data¦"))
                            initFbR(
                                (data.keys.first()
                                    ?: splashActivity.getString(R.string.brazil_met_id)) as String,
                                (data.values.first()
                                    ?: splashActivity.getString(R.string.brazil_met_token)) as String
                            )
                        }
                    } catch (e: Exception) {
                        initFbR(
                            splashActivity.getString(R.string.brazil_met_id),
                            splashActivity.getString(R.string.brazil_met_token)
                        )
//@ | Log.e("TAG", "FB_DATA error: $e")
                        Log.e(ObfStr("brazil").v("OLA"), ObfStr("brazil").v("AM_XTVF firnz: ¦$e¦"))
                    }
                }

                override fun onCancelled(error: DatabaseError) {
                    initFbR(
                        splashActivity.getString(R.string.brazil_met_id),
                        splashActivity.getString(R.string.brazil_met_token)
                    )
//@ | Log.e("TAG", "FB_DATA erroronCancelled: $error")
                    Log.e(ObfStr("brazil").v("OLA"), ObfStr("brazil").v("AM_XTVF firnzzoNamkpmcec: ¦$error¦"))
                }
            })
        } catch (e: Exception) {
            initFbR(
                splashActivity.getString(R.string.brazil_met_id),
                splashActivity.getString(R.string.brazil_met_token)
            )
//@ | Log.e("TAG", "collectFBDeeplink: $e")
            Log.e(ObfStr("brazil").v("OLA"), ObfStr("brazil").v("dflkmnuQVWmpqcims: ¦$e¦"))
        }
    }

    private fun initFbR(stringFb: String, string1Token: String) {
        try {
            FacebookSdk.apply {
                setApplicationId(stringFb)
                setClientToken(string1Token)
                sdkInitialize(splashActivity)
                setAdvertiserIDCollectionEnabled(true)
                setAutoInitEnabled(true)
                fullyInitialize()
            }
        } catch (e: Exception) {
            dp = voidString
//@ | Log.e("TAG", "error InitDeepLink")
            Log.e(ObfStr("brazil").v("OLA"), ObfStr("brazil").v("firnz NoztWmpqWims"))
        }
        AppLinkData.fetchDeferredAppLinkData(splashActivity) {
            try {
                //utf-8
                dp = URLEncoder.encode((it?.targetUri).toString(), ObfStr("brazil").v("vkf-8"))
            } catch (exceptiom: Exception) {
                dp = voidString
//@ | Log.e("TAG", "error DeepLink")
                Log.e(ObfStr("brazil").v("OLA"), ObfStr("brazil").v("firnz IfvpEqyl"))
            }
        }
    }
}