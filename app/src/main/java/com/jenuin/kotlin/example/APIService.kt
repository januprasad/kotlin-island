package com.jenuin.kotlin.example

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * Created by jenuprasad on 13/06/17.
 */
const val PINCODE = "api/pincode/{pincode}"

interface APIService {

    @GET(PINCODE)
    fun getPincode(@Path("pincode") pincode: String): Call<Response>

}