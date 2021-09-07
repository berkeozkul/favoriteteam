package com.example.favoriteteam

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.util.Log
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.favoriteteam.R
import com.huawei.agconnect.config.AGConnectServicesConfig
import com.huawei.hms.aaid.HmsInstanceId
import com.huawei.hms.analytics.HiAnalytics
import com.huawei.hms.analytics.HiAnalyticsInstance
import com.huawei.hms.analytics.HiAnalyticsTools


var pushToken: String? = null
var accessToken: String? = null
var context : Context? = null
lateinit  var instance : HiAnalyticsInstance

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getToken()


        HiAnalyticsTools.enableLog()
        instance = HiAnalytics.getInstance(applicationContext)
        instance.setAnalyticsEnabled(true)
        instance.regHmsSvcEvent()






    }
}



    fun getToken() {
        object : Thread() {
            override fun run() {
                try {
                    val appId: String =
                        AGConnectServicesConfig.fromContext(context).getString("client/app_id")
                    pushToken = HmsInstanceId.getInstance(context).getToken(appId, "HCM")

                    if (!TextUtils.isEmpty(pushToken)) {
                        Log.i("PushActivity", "get token:${pushToken}")
                    }
                } catch (e: Exception) {
                    Log.i("PushActivity", "getToken failed, $e")
                }
            }
        }.start()
    }


