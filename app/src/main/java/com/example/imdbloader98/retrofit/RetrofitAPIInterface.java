package com.example.imdbloader98.retrofit;

import com.example.imdbloader98.pojo.IMDB;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface RetrofitAPIInterface {

    // @POST("/MobileAuth/register")
    // Call<Register> regCall(@Body sampleRegister sampleRegister);

    @GET("/")
    Call<IMDB> IMDB_CALL(@Query("t") String movieName, @Query("apikey") String apiKey);



  //  @GET("?t={NAME}&apikey=77d67210")
   // Call<IMDB> IMDB_CALL(@Path("NAME") String NAME);
    //Call<IMDB> IMDB_CALL();



}
