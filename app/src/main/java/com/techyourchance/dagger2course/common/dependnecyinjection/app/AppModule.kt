package com.techyourchance.dagger2course.common.dependnecyinjection.app

import android.app.Application
import com.techyourchance.dagger2course.Constants
import com.techyourchance.dagger2course.networking.StackoverflowApi
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import javax.inject.Singleton

@Module
class AppModule(val application: Application) {

    @Provides
    @AppScope
    fun retrofit() = Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()



    @Provides
    fun application() = application


    @Provides
    @AppScope
    fun stackoverflowApi(retrofit: Retrofit) = retrofit.create(StackoverflowApi::class.java)

}
