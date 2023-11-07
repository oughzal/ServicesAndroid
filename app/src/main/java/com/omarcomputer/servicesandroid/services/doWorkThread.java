package com.omarcomputer.servicesandroid.services;

import android.util.Log;

public class doWorkThread extends  Thread{
    private  boolean isRunning = true;
    private int i = 0;

    @Override
    public void run() {
        while (isRunning){
            Log.i("MonServiceTAG", "i = " + i++);
            if(isRunning){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            if(Thread.interrupted()){
                break;
            }

            }
        }
    }

    @Override
    public void interrupt() {
        isRunning = false;
        super.interrupt();
    }
}
