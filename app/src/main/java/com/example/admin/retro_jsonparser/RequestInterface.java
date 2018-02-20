package com.example.admin.retro_jsonparser;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Admin on 2/20/2018.
 */

public interface RequestInterface {
    @GET("android/jsonandroid")
    //@GET("?limit=10")
    Call<JSONResponse> getJSON();
}