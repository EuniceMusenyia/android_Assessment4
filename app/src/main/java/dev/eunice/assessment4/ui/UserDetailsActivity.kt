package dev.eunice.assessment4.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class UserDetailsActivity:AppCompatActivity () {

    private val tvuserId: Any
    private lateinit var binding: UserDetailsActivity

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = UserDetailsActivity().inflate(layoutInflater)
        setContentView(binding.root)

        val users = intent.getStringExtra("USE_ID")
        val userId = intent.getStringExtra("USER_TITLE")
        val description = intent.getStringExtra("USER_DESCRIPTION")

        populateUserDetails(
             users, userId, description
        )
    }

    private fun populateUserDetails(
        userId: String?,
        users: String?,
        description: String?,

    ) {
        binding.tvuser.text = users
        binding.tvuserId.text = userId
        binding.tvtitle.text = title.toString()
        binding.tvdescription.text = description.toString()


//        Picasso.get()
//            .load(thumbnail)
//            .resize(250, 250)
//            .centerCrop()
//            .into(binding.ivuser)
    }
}