package net.ljubvi.pirms100gadiem.response

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class CatRepository {

    private val retrofit = Retrofit.Builder()
        .baseUrl("https://api.thecatapi.com/v1/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    private val service = retrofit.create(PeriodikaService::class.java)

    fun getImage(): LiveData<periodika> {
        val data = MutableLiveData<periodika>()

        service.getImage().enqueue(object : Callback<List<periodika>> {
            override fun onResponse(
                call: Call<List<periodika>>,
                response: Response<List<periodika>>
            ) {
                println(response.body())
                data.postValue(response.body()?.first())
            }

            override fun onFailure(call: Call<List<periodika>>, t: Throwable) {
                println(t.message)
                //I'm feeling lucky!
            }
        })

        return data
    }

}

