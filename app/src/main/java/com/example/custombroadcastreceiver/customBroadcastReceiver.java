package com.example.custombroadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class customBroadcastReceiver extends BroadcastReceiver {

    private static final String ACTION_CUSTOM_BROADCAST = "com.example.custombroadcastreceiver.ACTION_CUSTOM_BROADCAST";

    @Override
    public void onReceive(Context context, Intent intent) {

        String intentAction = intent.getAction();

        if(intentAction!=null && intentAction==ACTION_CUSTOM_BROADCAST) {
            Toast.makeText(context, "Custom Broadcast Received", Toast.LENGTH_SHORT).show();
        }
    }
}