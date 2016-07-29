package com.mlick.demo;

import android.app.Application;

import com.lite.library.utils.CrashHandler;

import cn.jpush.android.api.JPushInterface;

/**
 * Created by lxx on 2016/5/20 9:32
 */
public class DemoApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        //注册crashHandler
        CrashHandler crashHandler = CrashHandler.getInstance();
        crashHandler.init(getApplicationContext());

        JPushInterface.setDebugMode(true);    // 设置开启日志,发布时请关闭日志
        JPushInterface.init(this);            // 初始化 JPush
    }
}
