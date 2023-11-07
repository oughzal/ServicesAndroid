package com.omarcomputer.servicesandroid.services;

import android.content.Intent;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.core.app.JobIntentService;

public class MyJobIntentService extends JobIntentService {
    @Override
    protected void onHandleWork(@NonNull Intent intent) {
        for(int i=0;i<=100;i++) {
            Log.i("JobIntentServiceTag", "i=" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
