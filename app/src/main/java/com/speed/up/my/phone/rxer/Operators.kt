package com.speed.up.my.phone.rxer

import android.util.Log
import com.speed.up.my.phone.rxer.data.User
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.core.ObservableOnSubscribe
import io.reactivex.rxjava3.core.Observer
import io.reactivex.rxjava3.disposables.Disposable
import java.util.concurrent.TimeUnit

class RxFuns {
    val mUserList = mutableListOf<User>(
        User(1, "First", 22),
        User(2, "Second", 22),
        User(3, "Third", 22),
        User(4, "Fourth", 22),
    )
    fun justOperator() {
        val mList = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12)
        val observable = Observable.just(mList)

        val observer = object : Observer<List<Int>> {
            override fun onSubscribe(d: Disposable) {
                Log.d(MainActivity.TAG, "onSubscribe")
            }

            override fun onNext(t: List<Int>) {
                TODO("Not yet implemented")
            }

            override fun onError(e: Throwable) {
                Log.d(MainActivity.TAG, "onError")
            }

            override fun onComplete() {
                TODO("Not yet implemented")
            }


        }
        observable.subscribe(observer)
    }

    fun fromOperator() {
        val arraysNum = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12)
        val observable = Observable.fromArray(arraysNum)

        val observer = object : Observer<Array<Int>> {
            override fun onSubscribe(d: Disposable) {
                TODO("Not yet implemented")
            }

            override fun onNext(t: Array<Int>) {
                TODO("Not yet implemented")
            }

            override fun onError(e: Throwable) {
                TODO("Not yet implemented")
            }

            override fun onComplete() {
                TODO("Not yet implemented")
            }

        }

        observable.subscribe(observer)
    }

    fun rangeOperator(): Observable<Int> {
        return Observable.range(1, 10)
    }

    fun repeatOperator(): Observable<Int> {
        return Observable.range(1, 10).repeat()
    }

    fun intervalOperator(): Observable<Long> {
        return Observable.interval(1, TimeUnit.SECONDS)
    }

    fun timerOperator(): Observable<Long> {
        return Observable.timer(4, TimeUnit.SECONDS)
    }

    fun createOperator(): Observable<Int> {
        return Observable.create(ObservableOnSubscribe<Int> {

        })
    }

    fun filterOperator(): Observable<User> {
        return Observable.fromIterable(mUserList)
    }

}