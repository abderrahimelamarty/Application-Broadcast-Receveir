package com.example.applicationbroadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;

public class MonBroadcastreceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Intent intentService =new Intent();
        context.startService(intentService);
    }
    public void braodcastIntent(View view){
    Intent intent=new Intent();
    intent.setAction("com.ine2.CUSTUM_INTENT");
    sendBraodcast(intent);
    }

    private void sendBraodcast(Intent intent) {
    }
}
