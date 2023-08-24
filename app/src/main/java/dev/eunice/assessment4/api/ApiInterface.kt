package dev.eunice.assessment4.api

interface ApiInterface {
    @GET(("/user"))
    suspend fun getUser():Response<UserResponse>

    @GET("/User/{id}")
    suspend fun getUserById(@Path("id")userId:Int):Response<User>


}