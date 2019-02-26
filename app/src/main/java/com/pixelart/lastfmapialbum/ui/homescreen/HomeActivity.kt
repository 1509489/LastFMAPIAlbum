package com.pixelart.lastfmapialbum.ui.homescreen

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.pixelart.lastfmapialbum.R
import com.pixelart.lastfmapialbum.di.ApplicationModule
import com.pixelart.lastfmapialbum.di.DaggerApplicationComponent
import com.pixelart.lastfmapialbum.model.Album
import javax.inject.Inject

class HomeActivity : AppCompatActivity(), HomeContract.View {

    @Inject lateinit var homePresenter: HomeContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        DaggerApplicationComponent.builder()
            .applicationModule(ApplicationModule(this))
            .build().injectHomeScreen(this)

        homePresenter.getAlbums("KOD")
    }

    override fun showAlbums(albums: List<Album>) {

    }
}
