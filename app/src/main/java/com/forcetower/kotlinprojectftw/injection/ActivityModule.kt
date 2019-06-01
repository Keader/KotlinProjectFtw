package com.forcetower.kotlinprojectftw.injection

import com.forcetower.kotlinprojectftw.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityModule {

    @ContributesAndroidInjector
    abstract fun mainActivity(): MainActivity

}