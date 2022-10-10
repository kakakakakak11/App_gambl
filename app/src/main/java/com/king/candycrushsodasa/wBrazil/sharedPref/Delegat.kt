package com.king.candycrushsodasa.wBrazil.sharedPref

import io.github.a26197993b77e31a4.o7b471d74a5346efb54aa326b892daf01d914ce99.ObfStr
import android.content.Context
import android.content.SharedPreferences
import android.preference.PreferenceManager
import io.github.a26197993b77e31a4.o7b471d74a5346efb54aa326b892daf01d914ce99.ObfustringThis
import io.michaelrocks.paranoid.Obfuscate
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty
@ObfustringThis
@Obfuscate
class Delegat(context: Context) {
    private val pref: SharedPreferences = PreferenceManager.getDefaultSharedPreferences(context)
    var data by SharedPrefDel.loadAndSaveData()
    private object SharedPrefDel{

        fun loadAndSaveData(defValue: Set<String>? = null) = object :
            ReadWriteProperty<Delegat, Set<String>?> {
            override fun getValue(thisRef: Delegat, property: KProperty<*>): Set<String>? {
                return thisRef.pref.getStringSet(property.name, defValue)
            }

            override fun setValue(thisRef: Delegat, property: KProperty<*>, value: Set<String>?) {
                thisRef.pref.edit().putStringSet(property.name, value).apply()
            }

        }

    }
}