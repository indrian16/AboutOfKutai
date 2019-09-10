package io.indrian.aboutofkutai.data.repositories

import com.github.ajalt.timberkt.Timber.d
import io.indrian.aboutofkutai.data.model.AboutKutai
import io.indrian.aboutofkutai.data.service.AboutKutaiService
import io.reactivex.Observable
import io.reactivex.Single

class Repository(private val aboutKutaiService: AboutKutaiService) {

    fun getAbouts(): Observable<List<AboutKutai>> {

        return aboutKutaiService.getAbouts()
            .flatMap { abouts -> Observable.fromIterable(abouts) }
            .doOnNext { about ->

                d { "Abouts: "+about.title }
            }
            .toList()
            .toObservable()
    }

    fun getAbout(id: Int): Single<AboutKutai> {

        return aboutKutaiService.getAbout(id)
            .doOnSuccess { about ->

                d { "About: "+about.title }
            }
    }
}