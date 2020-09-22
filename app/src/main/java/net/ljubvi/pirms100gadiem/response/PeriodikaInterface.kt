package net.ljubvi.pirms100gadiem.response

import retrofit2.Call
import retrofit2.http.GET



interface PeriodikaService {
        @GET("/api/1/issues")
        fun getImage(): Call<periodika>
}

