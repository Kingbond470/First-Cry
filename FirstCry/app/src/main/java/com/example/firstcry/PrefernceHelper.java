package com.example.firstcry;

import android.content.Context;
import android.content.SharedPreferences;

public class PrefernceHelper {

    public static final String PREFERENCE_DB="mausam.firstcry";

    public static SharedPreferences getDataPreference(Context context){
        return context.getSharedPreferences(PREFERENCE_DB,Context.MODE_PRIVATE);
    }

    public static void writeStringToPreference(Context context,String key, String value){
        SharedPreferences.Editor editor=getDataPreference(context).edit();
        editor.putString(key, value);
        editor.apply();
    }

    public static String getStringFromPreference(Context context,String key){
        return  getDataPreference(context).getString(key,null);
    }

    public static void writeIntToPreference(Context context,String key, int value){
        SharedPreferences.Editor editor=getDataPreference(context).edit();
        editor.putInt(key, value);
        editor.apply();
    }

    public static int getIntFromPreference(Context context,String key){
        return  getDataPreference(context).getInt(key,0);
    }

}
