package com.genexus.superapps.bankx.application

import android.content.Context
import android.widget.Toast
import com.genexus.android.core.application.LifecycleListeners
import com.genexus.android.core.superapps.MiniApp
import com.genexus.android.core.superapps.MiniAppStopReason

class MiniAppLifecycleListener(private val context: Context): LifecycleListeners.CompleteMiniApp {
    override fun onMiniAppStarted(miniApp: MiniApp) {}
    override fun onMiniAppException(miniApp: MiniApp, t: Throwable) {}
    override fun onMiniAppStopped(miniApp: MiniApp, reason: MiniAppStopReason) {
        if (reason == MiniAppStopReason.AUTHORIZATION)
            Toast.makeText(context, "Mini App access token is no longer valid", Toast.LENGTH_LONG)
                .show()
    }
}