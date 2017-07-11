package com.example.amr.demoretrofit;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface MyApiEndpointInterface {

    @GET("/svc/topstories/v2/sports.json")
    Call<Data> getAPIKEY(@Query("api_key") String name);

//    @GET("/svc/topstories/v2/{story}.json")
//    Call<Data> getAPIKEY(@Path("story") String user, @Query("api_key") String name);
}