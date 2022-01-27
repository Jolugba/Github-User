package com.example.features.ui.users

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.common.NavigationDestinations
import com.example.common.getNameInitialsForSingle
import com.example.common.ob
import com.example.common.showShortSnackbar
import com.example.features.R
import com.example.features.databinding.FragmentGithubUsersBinding
import com.example.remote.model.Item
import dagger.hilt.android.AndroidEntryPoint
import timber.log.Timber

@AndroidEntryPoint
class GithubUsersFragment : Fragment(R.layout.fragment_github_users){

    private var _binding: FragmentGithubUsersBinding? = null
    private val binding get() = _binding!!
    private val viewModel by viewModels<UsersViewModel>()
    private val usersAdapter
            by lazy { UsersAdapter() }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentGithubUsersBinding.bind(view)

        ob(viewModel.userState) {
            when (it) {
                is UsersViewModel.State.Loading -> binding.swipeRefresh.isRefreshing=it.isLoading
                is UsersViewModel.State.ErrorMessage -> showShortSnackbar(it.msg.toString())
                is UsersViewModel.State.Data -> {
                    usersAdapter.setItems(it.userData)
                }
                else -> {}
            }
        }
        setUpRecyclers()
        usersAdapter.onClickItemListener={
            findNavController().navigate(GithubUsersFragmentDirections.goToUserDetailsFragment(it))
        }

    }

    private fun setUpRecyclers() {
        binding.userRecyclerView.apply {
            adapter = usersAdapter
            layoutManager = LinearLayoutManager(context)
        }}


}