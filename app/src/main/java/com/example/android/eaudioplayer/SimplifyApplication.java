package com.example.android.eaudioplayer;

import android.app.Application;
import android.content.pm.PackageManager;
import android.os.Bundle;

import com.simplify.android.sdk.Simplify;

public class SimplifyApplication extends Application {

    Simplify simplify;


    @Override
    public void onCreate() {
        super.onCreate();

        simplify = new Simplify();

        // init Simplify SDK with public api key stored in metadata
        try {
            Bundle bundle = getPackageManager().getApplicationInfo(getPackageName(), PackageManager.GET_META_DATA).metaData;

            // init simplify api key
            String apiKey = bundle.getString("com.example.android.eaudioplayer.apiKey", null);
            if (apiKey != null) {
                simplify.setApiKey(apiKey);
            }

            // init android pay public key
            String androidPayPublicKey = bundle.getString("com.example.android.eaudioplayer.androidPayPublicKey", null);
            if (androidPayPublicKey != null) {
                simplify.setAndroidPayPublicKey(androidPayPublicKey);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    Simplify getSimplify() {
        return simplify;
    }
}
