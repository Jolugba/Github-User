package com.example.features.ui.users

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.common.loadImage
import com.example.features.databinding.UsersItemBinding
import com.example.remote.model.Item


class UsersAdapter(
) : RecyclerView.Adapter<UsersAdapter.ViewHolder>() {

    var userItems = mutableListOf<Item>()
    var onClickItemListener: ((Item) -> Unit)? = null

    fun setItems(listItems: List<Item>) {
        userItems.clear()
        userItems.addAll(listItems)
        notifyDataSetChanged()
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolder(
       UsersItemBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
    )

    override fun onBindViewHolder(holder: ViewHolder, position: Int) = holder.bind(userItems[position])

    override fun getItemCount() = userItems.size

    inner class ViewHolder(private val binding: UsersItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: Item) = with(binding) {
            image.loadImage(item.avatar_url)
            name.text=item.login
            root.setOnClickListener {
                onClickItemListener?.invoke(item)
            }
        }
    }

}