package com.coolweather.android.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by HSJ91 on 2020/3/13.
 */

public class HttpUtil {

    public static void sendOkHttpRequest(String adddress,okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(adddress).build();
        client.newCall(request).enqueue(callback);
    }
}
