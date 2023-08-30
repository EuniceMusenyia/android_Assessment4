package dev.eunice.assessment4.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiUser {
    var retrofit = Retrofit.Builder()
        .baseUrl("hhttps://jsonplaceholder.typicode.com")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    fun<T>buildClient(apiInterface: Class<T>):T{
        return  retrofit.create(apiInterface)
    }
}