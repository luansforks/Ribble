package com.luseen.ribble.presentation.home

import android.arch.lifecycle.Lifecycle
import android.arch.lifecycle.OnLifecycleEvent
import com.luseen.ribble.data.network.ApiService
import com.luseen.ribble.data.pref.Preferences
import com.luseen.ribble.di.scope.PerActivity
import com.luseen.ribble.presentation.base.BasePresenter
import javax.inject.Inject

/**
 * Created by Chatikyan on 31.07.2017.
 */
@PerActivity
class HomePresenter private constructor() : BasePresenter<HomeContract.View>(), HomeContract.Presenter {

    @Inject
    protected lateinit var pref: Preferences

    private lateinit var apiService: ApiService

    @Inject
    constructor(apiService: ApiService) : this() {
        this.apiService = apiService
    }

    @OnLifecycleEvent(value = Lifecycle.Event.ON_CREATE)
    fun onCreate() {
        view.openShotFragment()
    }

}