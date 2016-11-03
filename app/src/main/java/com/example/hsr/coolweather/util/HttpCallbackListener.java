package com.example.hsr.coolweather.util;

/**
 * Created by hsr on 2016/11/2.
 */

public interface HttpCallbackListener {
    void onFinish(String response);

    void onError(Exception e);
}
