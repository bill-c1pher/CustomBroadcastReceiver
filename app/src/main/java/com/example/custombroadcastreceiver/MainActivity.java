package com.example.custombroadcastreceiver;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;

public class MainActivity extends AppCompatActivity {

    private customBroadcastReceiver mReceiver = new customBroadcastReceiver();

    private static final String ACTION_CUSTOM_BROADCAST = "com.example.custombroadcastreceiver.ACTION_CUSTOM_BROADCAST";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        IntentFilter intentFilter = new IntentFilter();

        intentFilter.addAction(ACTION_CUSTOM_BROADCAST);

        LocalBroadcastManager.getInstance(this).registerReceiver(mReceiver, intentFilter);
    }


    public void sendBroadcast(View view) {


        Intent customBroadcastIntent = new Intent(ACTION_CUSTOM_BROADCAST);

        LocalBroadcastManager.getInstance(this).sendBroadcast(customBroadcastIntent);
    }

    @Override
    protected void onDestroy() {

        LocalBroadcastManager.getInstance(this).unregisterReceiver(mReceiver);
        super.onDestroy();
    }
}