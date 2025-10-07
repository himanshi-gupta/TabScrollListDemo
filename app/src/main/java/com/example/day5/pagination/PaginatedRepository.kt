package com.example.day5.pagination

import com.example.day5.models.Item

class PaginatedRepository(private val pagingDataSource: PagingDataSource) {
    private var currentPage = 1
    private val pageSize = 10

    fun loadNextPage(): List<Item>{
        val data = pagingDataSource.loadPage(currentPage, pageSize)
        currentPage++
        return data
    }
}