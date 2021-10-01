package com.sijanneupane.mvvmlogin.api

import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface AuthAPI {

    @FormUrlEncoded //because we are using @Field annotation
    @POST("auth/login")
    fun login(
        @Field("email") email: String,
        @Field("password") password: String
        ) : Any
}