package com.example.mysearch.model.data

sealed class DataModel {

    data class Success(val data: List<SearchResult>?) : DataModel()
    data class Error(val error: Throwable) : DataModel()
    data class Loading(val progress: Int?) : DataModel()
}
