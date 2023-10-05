package com.example.android.service;

import  com.example.android.model.Result;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface MovieDataService {

    @GET("movie/popular")
    Call<Result> getPopularMovies(@Query("api_key") String apiKey);

}
