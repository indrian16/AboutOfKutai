package io.indrian.aboutofkutai.screens.detail

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import io.indrian.aboutofkutai.data.repositories.Repository
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers

class DetailVM(private val repository: Repository) : ViewModel() {

    private val compositeDisposable = CompositeDisposable()
    private val mutDetailState = MutableLiveData<DetailState>()

    val detailState: LiveData<DetailState>
        get() = mutDetailState

    init {

        mutDetailState.value = DetailState.Loading
    }

    fun getAbout(id: Int) {

        val disposable = repository.getAbout(id)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .doOnSubscribe { mutDetailState.value = DetailState.Loading }
            .subscribe(
                { about ->

                    mutDetailState.value = DetailState.Loaded(about)
                },
                { error ->

                    mutDetailState.value = DetailState.Error(error)
                }
            )
        compositeDisposable.add(disposable)
    }

    override fun onCleared() {

        compositeDisposable.clear()
        compositeDisposable.dispose()
        super.onCleared()
    }
}