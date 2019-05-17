package com.example.services;

import android.app.IntentService;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v4.app.JobIntentService;
import android.util.Log;

public class jobIntent_service extends JobIntentService {

    static final int JOB_ID = 100;

    static void enqueue(Context context, Intent intent){
        enqueueWork(context,jobIntent_service.class,JOB_ID,intent);
    }

    @Override
    protected void onHandleWork(@NonNull Intent intent) {
        Log.e("TAG","Service executing");
    }
}
