package com.kaustuv.intentserviceslive;

import android.app.IntentService;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;

import org.greenrobot.eventbus.EventBus;

public class MyIntentService extends IntentService {
    public static final String TAG = "Kaustuv";

    public MyIntentService(){
        super("Hello");
        Log.i(TAG, "MyIntentService: Constructor called on "+ Thread.currentThread().getName());
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.i(TAG, "MyIntentService: onCreate called on "+ Thread.currentThread().getName());
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent){
        Log.i(TAG,"MyIntentService: onHandleIntent called on "+ Thread.currentThread().getName());
        //int st=intent.getIntExtra("sleepTime",0);
        Bundle bb=intent.getBundleExtra("bundle");
        int st=bb.getInt("sleepTime");
        try{
            Thread.sleep(st);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    @Override
    public void onDestroy(){
        super.onDestroy();
        Log.i(TAG,"MyIntentService: onDestroy called on "+ Thread.currentThread().getName());
        EventBus.getDefault().post(new Pojo());
    }
}

