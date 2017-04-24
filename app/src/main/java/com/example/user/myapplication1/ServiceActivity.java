package com.example.user.myapplication1;

import android.app.Service;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Service;
import android.os.IBinder;
import android.content.Intent;
import android.os.Bundle;

public class ServiceActivity extends Service {
    int mStartMode;
    IBinder mBinder;
    boolean mAllowRebind;
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return mBinder;
    }
    public void onCreate() {

    }
    public int onStartCommand(Intent intent, int flags, int startId) {
        return mStartMode;
    }
    public boolean onUnbind(Intent intent) {
        return mAllowRebind;
    }
    public void onRebind(Intent intent) {

    }
    public void onDestroy() {

    }
}
