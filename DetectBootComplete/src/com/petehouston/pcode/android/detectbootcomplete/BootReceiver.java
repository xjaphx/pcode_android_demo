package com.petehouston.pcode.android.detectbootcomplete;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class BootReceiver extends BroadcastReceiver {

	Context mContext;
	
	@Override
	public void onReceive(Context context, Intent intent) {
		mContext = context;
		String action = intent.getAction();
		// check if it is a BOOT action
		if(action.equalsIgnoreCase(Intent.ACTION_BOOT_COMPLETED)) {
			// do something
			showNotification();
		}
	}
	
	public void showNotification() {
		Toast.makeText(mContext, "A'right, BOOT has been done!", Toast.LENGTH_SHORT).show();
	}

}
