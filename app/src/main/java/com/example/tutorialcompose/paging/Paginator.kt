package com.example.tutorialcompose.paging

interface Paginator<Key,Item> {

   suspend fun  loadNextItems()
    fun  reset()
}
