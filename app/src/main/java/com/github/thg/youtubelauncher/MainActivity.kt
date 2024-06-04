package com.github.thg.youtubelauncher

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        System.out.println("YouTubeLauncher")
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://youtube.com"))
        startActivity(browserIntent)
        finish()
    }
}

