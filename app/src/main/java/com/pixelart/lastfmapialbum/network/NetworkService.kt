package com.pixelart.lastfmapialbum.network

import com.pixelart.lastfmapialbum.model.AlbumResponse
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface NetworkService {
    @GET("2.0/")
    fun getAlbums(
        @Query("method")method: String,
        @Query("album")album: String,
        @Query("api_key")apiKey: String,
        @Query("format")format: String
    ): Single<AlbumResponse>
}