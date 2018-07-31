package com.example.administrator.saredemo.utils;

/**
 * Created by Administrator on 2018/7/30.
 */

public class NativeUtils {
    static {
        System.loadLibrary("NativeUtils");
    }
    public static native String getStringFromNative();
}
