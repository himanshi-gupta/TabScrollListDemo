package com.example.day5.pagination

import com.example.day5.models.Item

class PagingDataSource {
    fun loadPage(page: Int, pageSize: Int): List<Item>{
        val start = (page-1) * pageSize
        val end = start + pageSize
        return (start until end).map {
            Item(false, false,"Item $it")
        }
    }
}