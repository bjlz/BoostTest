package com.example.boosttest;

import android.app.Application;

import com.example.boosttest.flutter_support.BoostRouterDelegate;
import com.idlefish.flutterboost.FlutterBoost;
import com.idlefish.flutterboost.FlutterBoostDelegate;

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        initBoost();
    }

    private void initBoost() {
        FlutterBoostDelegate delegate = new BoostRouterDelegate();

        FlutterBoost.Callback onEngineReady = engine -> {
            // no-op
        };

        FlutterBoost.instance().setup(this, delegate, onEngineReady);
    }
}
