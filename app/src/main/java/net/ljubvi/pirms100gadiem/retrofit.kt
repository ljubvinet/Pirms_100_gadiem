package net.ljubvi.pirms100gadiem


import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory



class retrofit {
    fun provideRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://periodika.laacz.lv/" )
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}

