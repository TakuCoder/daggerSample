package com.example.iosdeveloper.dagger;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {

    @GET("marvel")
    Call<List<Hero>> getHeroes();
}
