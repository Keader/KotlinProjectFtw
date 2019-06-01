package com.forcetower.kotlinprojectftw.injection

import android.content.Context
import com.forcetower.kotlinprojectftw.BaseApplication
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import javax.inject.Singleton

@Module
object AppModule {
    @Singleton
    @Provides
    @JvmStatic
    fun provideContext(application: BaseApplication): Context{
        return application
    }

    @Singleton
    @Provides
    @JvmStatic
    fun provideClient() : OkHttpClient {
        return OkHttpClient.Builder().build()
    }
}