package dev.eunice.assessment4.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import dev.eunice.assessment4.R

class MainActivity<User> : AppCompatActivity() {
    val userViewModel:User by viewModels()
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }


    override fun onResume() {
        super.onResume()
        userViewModel.fetchUsers()

        userViewModel.errLiveData.observe(this, Observer { err->
            Toast.makeText(baseContext, err, Toast.LENGTH_LONG).show()
        })

        userViewModel.usersLiveData.observe(this, Observer { usersList->
            binding.rvusers.layoutManager = GridLayoutManager(this@MainActivity,
                2)
            binding.rvusers.adapter = UserAdapter(usersList,this)
        })
    }
}