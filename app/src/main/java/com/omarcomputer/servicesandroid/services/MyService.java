package com.omarcomputer.servicesandroid.services;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class MyService extends Service {
    doWorkThread thread = new doWorkThread();
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        Toast.makeText(this, "service bound", Toast.LENGTH_SHORT).show();
        thread.start();
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
       thread.start();

        return START_STICKY;

    }


    @Override
    public void onDestroy() {
        super.onDestroy();
        thread.interrupt();
        Toast.makeText(this, "service stopped", Toast.LENGTH_SHORT).show();
    }
}
