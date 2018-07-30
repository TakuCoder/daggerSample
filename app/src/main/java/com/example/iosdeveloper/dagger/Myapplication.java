package com.example.iosdeveloper.dagger;

import android.app.Application;

public class Myapplication extends Application {

    private ApiComponent apiComponent;
    @Override
    public void onCreate() {
        super.onCreate();

apiComponent = DaggerApiComponent.builder()
        .appModule(new AppModule(this))
        .apiModule(new ApiModule("https://simplifiedcoding.net/demos/"))
        .build();


    }


    public ApiComponent getNetComponent() {
        return apiComponent;
    }
}
