package com.example.rmoveapp;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class AppListener extends BroadcastReceiver {

@Override
public void onReceive(Context context, Intent arg1) {
    // TODO Auto-generated method stub
	if(arg1==null){
		
	}
	else
	{
		 Toast.makeText(context, " Application remove CSAM!!! ", Toast.LENGTH_SHORT).show();
	}
   
    
    }
}