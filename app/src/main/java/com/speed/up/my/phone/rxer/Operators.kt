package com.speed.up.my.phone.rxer

import android.util.Log
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.core.Observer
import io.reactivex.rxjava3.disposables.Disposable





    fun justOperator(){
        val mList = mutableListOf(1,2,3,4,5,6,7,8,9,10,11,12)
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

    fun fromOperator(){
        val arraysNum = arrayOf(1,2,3,4,5,6,7,8,9,10,11,12)
        val observable = Observable.fromArray(arraysNum)

        val observer = object : Observer<Array<Int>>{
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

    fun rangeOperator():Observable<Int>{
        return Observable.range(1,10)
    }

