package com.forcetower.kotlinprojectftw

import android.app.Activity
import android.app.Application
import com.forcetower.kotlinprojectftw.injection.AppInjector
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject

class BaseApplication : Application(), HasActivityInjector  {

    override fun onCreate(){
        super.onCreate()
        AppInjector.inject(this)
    }

    @Inject
    lateinit var activityInjector: DispatchingAndroidInjector<Activity>
    override fun activityInjector(): AndroidInjector<Activity> {
        return activityInjector
    }
}