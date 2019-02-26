package com.pixelart.lastfmapialbum.ui.homescreen

import com.pixelart.lastfmapialbum.model.Album

interface HomeContract {
    interface View{
        fun showAlbums(albums: List<Album>)
    }
    interface Presenter{
        fun getAlbums(album: String)
    }
}