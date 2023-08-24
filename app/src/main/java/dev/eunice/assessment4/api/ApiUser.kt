package dev.eunice.assessment4.api

object ApiUser {
    var retrofit = Retrofit.Builder()
        .baseUrl("https://dummyjson.com/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    fun<T>buildClient(apiInterface: Class<T>):T{
        return  retrofit.create(apiInterface)
    }
}