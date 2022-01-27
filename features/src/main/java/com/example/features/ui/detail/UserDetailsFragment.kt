package com.example.features.ui.detail

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.example.common.getNameInitialsForSingle
import com.example.common.loadImage
import com.example.common.togglePictureVisibility
import com.example.features.R
import com.example.features.databinding.FragmentUserDetailsBinding


class UserDetailsFragment : Fragment(R.layout.fragment_user_details) {

    private var _binding: FragmentUserDetailsBinding? = null
    private val binding get() = _binding!!
    private val safeArgs: UserDetailsFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentUserDetailsBinding.bind(view)

        with(binding) {
            name.text = safeArgs.users.login
            picture.loadImage(safeArgs.users.avatar_url)
            placeholder.text = getNameInitialsForSingle(safeArgs.users.login)
            if (safeArgs.users.avatar_url.isNullOrEmpty()) {
                togglePictureVisibility(false, placeholder, picture)
            } else {
                togglePictureVisibility(true, placeholder, picture)
            }


        }
    }


}