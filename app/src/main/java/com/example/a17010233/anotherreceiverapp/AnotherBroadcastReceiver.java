package com.example.a17010233.anotherreceiverapp;


import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class AnotherBroadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Received in AnotherBroadcastReceiver",
                Toast.LENGTH_LONG).show();


    }
}
