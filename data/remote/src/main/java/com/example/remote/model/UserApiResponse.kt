package com.example.remote.model

data class UserApiResponse(val incomplete_results: Boolean,
                           val items: List<Item>,
                           val total_count: Int)



