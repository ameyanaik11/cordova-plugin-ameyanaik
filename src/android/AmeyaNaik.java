package com.ameyanaik.cordova;

import org.apache.cordova.*;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONException;

public class AmeyaNaik extends CordovaPlugin {
    public static final String TAG = "AmeyaIP";

    public static String targetUrl = "http://www.ameyanaik.com";

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
		if (action.equals("sendFail")) {
            return false;
        }
	    JSONObject r = new JSONObject();
        r.put("owner", "Ameya Naik");
        r.put("targetUrl", targetUrl);
        r.put("action", action.toString());
        r.put("jsonArgs", args.toString());
        callbackContext.success(r);		
    	return true;
    }
}
