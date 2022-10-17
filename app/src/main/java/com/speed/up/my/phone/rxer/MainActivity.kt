package com.speed.up.my.phone.rxer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.core.Observer
import io.reactivex.rxjava3.disposables.Disposable

class MainActivity : AppCompatActivity() {
    companion object {
        const val TAG = "MainActivity"
    }
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val observable = Observable.just(1)
        val observer = object : Observer<Int>{
            override fun onSubscribe(d: Disposable) {
                Log.d(TAG, "onSubscribe")
            }

            override fun onNext(t: Int) {
                Log.d(TAG, "onNext")
            }

            override fun onError(e: Throwable) {
                Log.d(TAG, "onError")
            }

            override fun onComplete() {
                TODO("Not yet implemented")
            }

        }
        observable.subscribe(observer)
    }
}