package dev.eunice.assessment4.api

import dev.eunice.assessment4.model.UserResponse
import retrofit2.Response
import retrofit2.http.GET

interface ApiInterface {
    @GET(("/posts"))
    suspend fun getUser(): Response<UserResponse>



}