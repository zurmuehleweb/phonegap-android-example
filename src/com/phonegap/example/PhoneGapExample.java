package com.phonegap.example;

import android.os.Bundle;
import org.apache.cordova.DroidGap;

public class PhoneGapExample extends DroidGap
{
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        super.loadUrl("file:///android_asset/www/index.html");
    }
}

