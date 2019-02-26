package com.pixelart.lastfmapialbum.ui.homescreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.pixelart.lastfmapialbum.R
import com.pixelart.lastfmapialbum.model.Album

class HomeActivity : AppCompatActivity(), HomeContract.View {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
    }

    override fun showAlbums(albums: List<Album>) {

    }
}
