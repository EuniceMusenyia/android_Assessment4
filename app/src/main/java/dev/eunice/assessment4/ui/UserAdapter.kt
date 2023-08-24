package dev.eunice.assessment4.ui

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class UserAdapter (var UserList: List<User>, var context: Context):RecyclerView.Adapter<UserViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        var binding = UserlistBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return UserViewHolder(binding)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        var myUser = UserList[position]
        var binding = holder.binding

        binding.tvusers.text = myUser.users
        binding.tvuserids.text = myUser.userids
        binding.tvdescription.text = myUser.description.toString()

        Picasso
            .get()
            .load(myUser.thumbnail)
            .resize(200,200)
            .centerCrop()

        holder.binding.cvUser.setOnClickListener {
            val intent = Intent(context, UserDetailsActivity::class.java)
            intent.putExtra("USER_ID", myUser.users
            intent.putExtra("USER_TITLE", myUser.userids)
            intent.putExtra("USER_DESCRIPTION", myUser.description)

            context.startActivity(intent)
        }

    }

    override fun getItemCount(): Int {
        return UserList.size

    }
}
class UserViewHolder(var binding: UserlistBinding): RecyclerView.ViewHolder(binding.root)