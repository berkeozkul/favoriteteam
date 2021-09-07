package com.example.favoriteteam.push

import android.content.Context
import android.text.TextUtils
import android.util.Log
import com.huawei.agconnect.config.AGConnectServicesConfig
import com.huawei.hms.aaid.HmsInstanceId

import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
/*
class PushManager {

companion object {
    private var pushToken: String? = null
    private var accessToken: String? = null
    private var context : Context? = null

    fun getToken() {
        object : Thread() {
            override fun run() {
                try {
                    val appId: String =
                        AGConnectServicesConfig.fromContext(context).getString("client/app_id")
                    pushToken = HmsInstanceId.getInstance(context).getToken(appId, "HCM")

                    if (!TextUtils.isEmpty(pushToken)) {
                        Log.i("PushActivity", "get token:$pushToken")
                    }
                } catch (e: Exception) {
                    Log.i("PushActivity", "getToken failed, $e")
                }
            }
        }.start()
    }

    fun getAccessToken() {
        AccessTokenClient.getClient().create(AccessTokenInterface::class.java)
            .createAccessToken(
                "client_credentials",
                "Your_App_Secret_Key",
                "Your_App_ID"
            )
            .enqueue(object : Callback<AccessTokenModel> {
                override fun onFailure(call: Call<AccessTokenModel>, t: Throwable) {
                    Log.d("PushActivity", "ERROR : " + t.message)
                }

                override fun onResponse(
                    call: Call<AccessTokenModel>,
                    response: Response<AccessTokenModel>
                ) {
                    if (response.isSuccessful) {
                        Log.d("PushActivity", "Token " + response.body()?.access_token)
                        accessToken = response.body()?.access_token
                    }
                }
            })
    }

    fun sendNotification(pushToken : String) {

        val notifMessageBody: NotificationMessageBody = NotificationMessageBody.Builder(
            "NOTIFICATIN TITTLE HERE", "NOTIFICATION BODY HERE",
            arrayOf(pushToken)
        )
            .build()

        NotificationClient.getClient().create(NotificationInterface::class.java)
            .createNotification(
                "Bearer $accessToken",
                notifMessageBody
            )
            .enqueue(object : Callback<NotificationMessage> {
                override fun onFailure(call: Call<NotificationMessage>, t: Throwable) {
                    Log.d("PushActivity", "ERROR :  " + t.message)
                }

                override fun onResponse(
                    call: Call<NotificationMessage>,
                    response: Response<NotificationMessage>
                ) {
                    if (response.isSuccessful) {
                        Log.d("PushActivity", "Response " + response.body())
                    }
                }

            })
    }

}

}

 */
