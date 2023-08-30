package dev.eunice.assessment4.repository

import androidx.tracing.perfetto.handshake.protocol.Response
import dev.eunice.assessment4.api.ApiInterface
import dev.eunice.assessment4.api.ApiUser
import dev.eunice.assessment4.model.User
import dev.eunice.assessment4.model.UserResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class UserRepository {
      private val apiuser = ApiUser.buildClient(ApiInterface::class.java)
    suspend fun getUser(): Response<User> {
        return withContext(Dispatchers.IO){
            apiuser.getUser()
        }
    }
}