package com.example.iosdeveloper.dagger;


import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {ApiModule.class,AppModule.class})
public interface ApiComponent {

    void inject(MainActivity activity);
}
