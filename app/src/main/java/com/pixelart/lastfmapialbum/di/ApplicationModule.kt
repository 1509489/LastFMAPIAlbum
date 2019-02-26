package com.pixelart.lastfmapialbum.di

import androidx.appcompat.app.AppCompatActivity
import com.pixelart.lastfmapialbum.network.NetworkService
import com.pixelart.lastfmapialbum.ui.homescreen.HomeActivity
import com.pixelart.lastfmapialbum.ui.homescreen.HomeContract
import com.pixelart.lastfmapialbum.ui.homescreen.HomePresenter
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(includes = [NetworkModule::class])
class ApplicationModule(private val activity: AppCompatActivity) {

    @Provides
    @Singleton
    fun providesHomePresenter(networkService: NetworkService): HomeContract.Presenter =
        HomePresenter(networkService, activity as HomeActivity)
}