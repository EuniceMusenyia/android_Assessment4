package dev.eunice.assessment4.model

data class UserResponse(
    var users : List<User>,
    var title : String,
    var body: String
)
