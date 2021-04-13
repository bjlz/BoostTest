package com.example.boosttest.flutter_support;

import android.content.Intent;

import com.idlefish.flutterboost.FlutterBoost;
import com.idlefish.flutterboost.FlutterBoostDelegate;
import com.idlefish.flutterboost.containers.FlutterBoostActivity;

import java.util.HashMap;
import java.util.Map;

import io.flutter.embedding.android.FlutterActivityLaunchConfigs;

/**
 * Flutter Boost 页面路由实现
 */
public class BoostRouterDelegate implements FlutterBoostDelegate {

    /**
     * 开启原生页面
     */
    @Override
    public void pushNativeRoute(String pageName, HashMap<String, String> arguments) {
//        Class<?> pageClz = null;
//
//        // 在此处处理页面名称与实际页面间的映射
//        switch (pageName) {
//            case "native_second":
//                pageClz = SecondNativeActivity.class;
//                break;
//        }
//
//        if (pageClz == null) return;
//
//        Intent intent = new Intent(FlutterBoost.instance().currentActivity(), pageClz);
//        intent.putExtra("boostParams", arguments);
//
//        FlutterBoost.instance().currentActivity().startActivity(intent);
    }


    /**
     * 开启 Flutter 页面
     */
    @Override
    public void pushFlutterRoute(String pageName, String uniqueId, HashMap<String, String> arguments) {
        Intent intent = new FlutterBoostActivity.CachedEngineIntentBuilder(
                FlutterBoostActivity.class, FlutterBoost.ENGINE_ID)
                .backgroundMode(FlutterActivityLaunchConfigs.BackgroundMode.opaque)
                .destroyEngineWithActivity(false)
                .uniqueId(uniqueId)
                .url(pageName)
                .urlParams(arguments)
                .build(FlutterBoost.instance().currentActivity());

        FlutterBoost.instance().currentActivity().startActivity(intent);
    }
}
