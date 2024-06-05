package com.carefirstpraxis.carefirst_notes_android

import DataModel
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface RetrofitAPI {
  // as we are making a post request to post a data
  // so we are annotating it with post
  // and along with that we are passing a parameter as users
  @POST("login")
  @FormUrlEncoded
  fun login(
    @Field("data") data: String
  ): Call<DataModel?>?
}