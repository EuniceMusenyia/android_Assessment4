package dev.eunice.assessment4.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import dev.eunice.assessment4.model.User
import dev.eunice.assessment4.repository.UserRepository

class UserViewModel:ViewModel (){
    val usersRepo = UserRepository()
    val usersLiveData = MutableLiveData<List<User>>()
    val errLiveData = MutableLiveData<String>()

    fun fetchProducts(){
        viewModelScope.launch {
            val response = userRepo.getUsers()
            if (response.isSuccessful){
                usersLiveData.postValue(response.body()?.users)
            }
            else{
                errLiveData.postValue(response.errorBody()?.string())
            }
        }
    }
}