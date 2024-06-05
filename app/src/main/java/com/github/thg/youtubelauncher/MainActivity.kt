package com.github.thg.youtubelauncher

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.provider.Browser
import androidx.activity.ComponentActivity


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://youtube.com"))
        browserIntent.putExtra(Browser.EXTRA_APPLICATION_ID, applicationContext.packageName);
        startActivity(browserIntent)
        Handler(Looper.getMainLooper()).postDelayed({
            finishAndRemoveTask()
        }, 2000)
    }
}

