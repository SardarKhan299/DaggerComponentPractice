package com.techyourchance.dagger2course.common.dependnecyinjection.activity

import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import com.techyourchance.dagger2course.common.dependnecyinjection.app.AppComponent
import com.techyourchance.dagger2course.screens.common.ScreensNavigator
import dagger.Module
import dagger.Provides

@Module
class ActivityModule(val activity: AppCompatActivity) {

    @Provides
    fun activity() = activity

    @Provides
    @ActivityScope
    fun screensNavigator(activity: AppCompatActivity) = ScreensNavigator(activity)

    @Provides
    fun layoutInflater(activity: AppCompatActivity) = LayoutInflater.from(activity)

    @Provides
    fun fragmentManager(activity: AppCompatActivity) = activity.supportFragmentManager

}