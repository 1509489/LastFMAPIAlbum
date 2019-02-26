package com.pixelart.lastfmapialbum.di

import com.pixelart.lastfmapialbum.ui.homescreen.HomeActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [ApplicationModule::class])
interface ApplicationComponent {

    fun injectHomeScreen(homeActivity: HomeActivity)
}