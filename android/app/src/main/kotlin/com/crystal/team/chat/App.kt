package com.crystal.team.chat

import android.content.Context
import io.flutter.app.FlutterApplication
import androidx.multidex.MultiDex

class App : FlutterApplication() {

    override fun attachBaseContext(base: Context) {
        super.attachBaseContext(base)
        MultiDex.install(this)
    }
}