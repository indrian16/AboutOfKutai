package io.indrian.aboutofkutai.screens.main.fragments

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import io.indrian.aboutofkutai.data.repositories.Repository
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers

class AboutsKutaiVM(private val repository: Repository) : ViewModel() {

    private val compositeDisposable = CompositeDisposable()
    private val mutAboutsKutaiState = MutableLiveData<AboutsKutaiState>()

    val aboutsKutaiState: LiveData<AboutsKutaiState>
        get() = mutAboutsKutaiState

    init {

        mutAboutsKutaiState.value = AboutsKutaiState.Loading
    }

    fun getAbouts() {

        val disposable = repository.getAbouts()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .doOnSubscribe { mutAboutsKutaiState.value = AboutsKutaiState.Loading }
                .subscribe(
                    { abouts ->

                        mutAboutsKutaiState.value = AboutsKutaiState.LoadedAbouts(abouts)
                    },
                    { error ->

                        mutAboutsKutaiState.value = AboutsKutaiState.Error(error)
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