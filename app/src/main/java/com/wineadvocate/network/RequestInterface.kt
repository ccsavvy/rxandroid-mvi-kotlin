package com.wineadvocate.network

import com.wineadvocate.model.DataClassPhoto
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

/**
 *  Created by Christian on Thursday Mar, 2019
 */

interface RequestInterface {

    @GET("/photos")
    fun getPhotos() : Observable<List<DataClassPhoto>>

    @GET("/photos")
    fun getAlbum(@Query("albumId") albumId : String) : Observable<List<DataClassPhoto>>
}