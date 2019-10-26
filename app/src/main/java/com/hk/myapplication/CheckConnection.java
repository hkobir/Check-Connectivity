package com.hk.myapplication;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.widget.Toast;

public class CheckConnection extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        ConnectivityManager connectivityManager = (ConnectivityManager)context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
        boolean isConnected = networkInfo!=null||networkInfo.isConnectedOrConnecting();
        if(isConnected){
            Toast.makeText(context,"Back to the on line",Toast.LENGTH_SHORT).show();
        }
        else{

            Toast.makeText(context,"You are offline",Toast.LENGTH_SHORT).show();
        }
    }
}
