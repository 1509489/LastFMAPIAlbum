package com.pixelart.lastfmapialbum.ui.homescreen

import com.pixelart.lastfmapialbum.common.API_KEY
import com.pixelart.lastfmapialbum.common.FORMAT
import com.pixelart.lastfmapialbum.common.METHOD
import com.pixelart.lastfmapialbum.model.AlbumResponse
import com.pixelart.lastfmapialbum.network.NetworkService
import io.reactivex.SingleObserver
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers

class HomePresenter(private val networkService: NetworkService, private val view: HomeContract.View): HomeContract.Presenter {

    override fun getAlbums(album: String) {
        networkService.getAlbums(METHOD, album, API_KEY, FORMAT)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object : SingleObserver<AlbumResponse>{
                override fun onSuccess(t: AlbumResponse) {

                }

                override fun onSubscribe(d: Disposable) {

                }

                override fun onError(e: Throwable) {

                }
            })
    }
}