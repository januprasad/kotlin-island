package com.jenuin.kotlin.example

import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by jenuprasad on 13/06/17.
 */
class RestAPI {
    val pinCodeAPi: APIService

    init {
        val retrofit: Retrofit = Retrofit.Builder()
                .baseUrl("http://postalpincode.in/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        pinCodeAPi = retrofit.create(APIService::class.java)
    }

    fun getPinCode(pinCode: String): Call<Response> {
        return pinCodeAPi.getPincode(pinCode)
    }
}