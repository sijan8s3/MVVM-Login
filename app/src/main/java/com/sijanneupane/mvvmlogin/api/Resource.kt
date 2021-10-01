package com.sijanneupane.mvvmlogin.api

import okhttp3.ResponseBody

sealed class Resource<out T> {

    //class to wrap the success response
    data class Success<out T>(val value : T): Resource<T>()

    //class to wrap the failure  response
    data class Failure(
        val isNetworkError: Boolean,
        val errorCode: Int?,
        val errorBody: ResponseBody?
    )

}
