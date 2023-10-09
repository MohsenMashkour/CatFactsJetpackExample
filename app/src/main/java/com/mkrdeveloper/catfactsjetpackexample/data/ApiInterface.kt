package com.mkrdeveloper.catfactsjetpackexample.data

import com.mkrdeveloper.catfactsjetpackexample.model.CatFact
import retrofit2.Response
import retrofit2.http.GET

interface ApiInterface {

   @GET("/fact")
   suspend fun getRandomFact(): Response<CatFact>
}