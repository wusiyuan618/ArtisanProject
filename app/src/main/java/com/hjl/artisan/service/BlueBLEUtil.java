package com.hjl.artisan.service;

import android.content.Context;

public class BlueBLEUtil {
    private static BlueBLEUtil blueBLEUtil;
    private Context mC;
    private BlueBLEUtil(Context context){
        this.mC=context;
    }
    public synchronized static BlueBLEUtil getInsatn(Context context){
        if(blueBLEUtil==null) blueBLEUtil=new BlueBLEUtil(context);
        return blueBLEUtil;
    }
}
