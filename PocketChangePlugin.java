/**
 * cordova PocketChange plugin
 * Copyright (c) wenzhi xue 2012
 *
 */
package com.pocketchange.phonegap;

import org.apache.cordova.api.CallbackContext;
import org.apache.cordova.api.Plugin;
import org.apache.cordova.api.PluginResult;
import org.json.JSONArray;
import org.json.JSONException;

import com.pocketchange.android.PocketChange;

import android.content.Intent;
import android.util.Log;

public class PocketChangePlugin extends Plugin{
	
	private String callback;
	private static final String NOTIF = "getNotification";
	private static final String OPENSHOP = "openShop";
	
	@Override
	public PluginResult execute(String action, JSONArray args, String callbackId){
		// TODO Auto-generated method stub
		this.callback = callbackId;  
		if (action.equals(OPENSHOP)) {
			PocketChange.openShop();
		}
		else if (action.equals(NOTIF)) {
			Intent notificationIntent = PocketChange.getPendingNotificationIntent();
			if (notificationIntent != null) {
				this.cordova.getActivity().startActivity(notificationIntent);
				//this.success(new PluginResult(PluginResult.Status.OK,"wwww"), this.callback);
			}
			
		} else{
			return new PluginResult(PluginResult.Status.INVALID_ACTION);
		}
		
		return new PluginResult(PluginResult.Status.OK);
	}

}
