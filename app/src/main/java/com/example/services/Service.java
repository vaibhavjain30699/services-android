package com.example.services;

import android.app.IntentService;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

public class Service extends IntentService {

    public Service() {
        super("Service_Toast");
    }


    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
      //  Toast.makeText(this,"Service Started",Toast.LENGTH_SHORT).show();
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    protected void onHandleIntent(Intent intent) {

        //Toast.makeText(this,"Service Created",Toast.LENGTH_SHORT).show();
        Log.e("TAG","Service Created");

    }
}
