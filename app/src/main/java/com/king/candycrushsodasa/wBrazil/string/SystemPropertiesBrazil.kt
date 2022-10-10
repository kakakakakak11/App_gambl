package com.king.candycrushsodasa.wBrazil.string

import io.github.a26197993b77e31a4.o7b471d74a5346efb54aa326b892daf01d914ce99.ObfStr
import android.annotation.SuppressLint
import io.github.a26197993b77e31a4.o7b471d74a5346efb54aa326b892daf01d914ce99.ObfustringThis
import io.michaelrocks.paranoid.Obfuscate
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader
import java.lang.reflect.Method
@ObfustringThis
@Obfuscate
object SystemPropertiesBrazil {
    private var failedUsingReflection = false
    private var getPropMethod: Method? = null

    @SuppressLint("PrivateApi")
    fun getProp(propName: String, defaultResult: String = ObfStr("brazil").v("")): String {
        if (!failedUsingReflection) try {
            if (getPropMethod == null) {
                val clazz = Class.forName(ObfStr("brazil").v("bedqwte.fs.LgduvmIzzqvrsqpt"))
                getPropMethod = clazz.getMethod(ObfStr("brazil").v("hvt"), String::class.java, String::class.java)
            }
            return getPropMethod?.invoke(null, propName, defaultResult) as String?
                ?: defaultResult
        } catch (e: Exception) {
            getPropMethod = null
            failedUsingReflection = true
        }
        var process: Process? = null
        try {
            process = Runtime.getRuntime().exec(ObfStr("brazil").v("hvtozzq \"¦$propName¦\" \"¦$defaultResult¦\""))
            val reader = BufferedReader(InputStreamReader(process.inputStream))
            return reader.readLine()
        } catch (_: IOException) {
        } finally {
            process?.destroy()
        }
        return defaultResult
    }
}