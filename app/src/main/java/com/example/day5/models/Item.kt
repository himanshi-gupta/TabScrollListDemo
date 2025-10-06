package com.example.day5.models

data class Item(
    val isHorizontal: Boolean,
    var isLiked: Boolean = false,
    val title: String = "",
    val horizontalItems: List<Int> = emptyList()
)