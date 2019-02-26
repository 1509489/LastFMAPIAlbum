package com.pixelart.lastfmapialbum.di

import com.pixelart.lastfmapialbum.ui.homescreen.HomeActivity
import dagger.Component

@Component(modules = [ApplicationModule::class])
interface ApplicationComponent {

    fun injectHomeScreen(homeActivity: HomeActivity)
}