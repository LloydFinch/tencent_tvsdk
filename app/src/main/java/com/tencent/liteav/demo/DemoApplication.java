package com.tencent.liteav.demo;

import android.support.multidex.MultiDexApplication;

import com.tencent.bugly.crashreport.CrashReport;
import com.tencent.rtmp.TXLiveBase;

//import com.squareup.leakcanary.LeakCanary;
//import com.squareup.leakcanary.RefWatcher;


public class DemoApplication extends MultiDexApplication {

//    private RefWatcher mRefWatcher;
    private static DemoApplication instance;
    String ugcLicenceUrl = "http://download-1252463788.cossh.myqcloud.com/xiaoshipin/licence_android/TXUgcSDK.licence";
    String ugcKey = "731ebcab46ecc59ab1571a6a837ddfb6";

    @Override
    public void onCreate() {

        super.onCreate();

        instance = this;

        TXLiveBase.setConsoleEnabled(true);
        TXLiveBase.setAppID("1252463788");
        CrashReport.UserStrategy strategy = new CrashReport.UserStrategy(getApplicationContext());
        strategy.setAppVersion(TXLiveBase.getSDKVersionStr());
        CrashReport.initCrashReport(getApplicationContext(),strategy);

        TXLiveBase.getInstance().setLicence(instance, ugcLicenceUrl, ugcKey);

//        File file = getFilesDir();
//        Log.w("DemoApplication", "load:" + file.getAbsolutePath());
//        TXLiveBase.setLibraryPath(file.getAbsolutePath());
        //测试代码
//        TCHttpEngine.getInstance().initContext(getApplicationContext());
//        mRefWatcher = LeakCanary.install(this);
    }

//    public static RefWatcher getRefWatcher(Context context) {
//        DemoApplication application = (DemoApplication) context.getApplicationContext();
//        return application.mRefWatcher;
//    }

    public static DemoApplication getApplication() {
        return instance;
    }

}
