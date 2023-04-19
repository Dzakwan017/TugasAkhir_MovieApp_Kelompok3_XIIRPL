package com.arthlimchiu.mymovies

import com.example.tugasakhir_movieapp_kelompok3_xiirpl.GetMoviesResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query


interface Api {

    @GET("movie/popular")
    fun getPopularMovies(
        @Query("api_key") apiKey: String = "138b3a3c21cb90bed1bb5b106b7dddb2",
        @Query("page") page: Int
    ): Call<GetMoviesResponse>

    @GET("movie/top_rated")
    fun getTopRatedMovies(
        @Query("api_key") apiKey: String = "138b3a3c21cb90bed1bb5b106b7dddb2",
        @Query("page") page: Int
    ): Call<GetMoviesResponse>

    @GET("movie/upcoming")
    fun getUpcomingMovies(
        @Query("api_key") apiKey: String = "138b3a3c21cb90bed1bb5b106b7dddb2",
        @Query("page") page: Int
    ): Call<GetMoviesResponse>
}