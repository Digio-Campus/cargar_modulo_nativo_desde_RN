package com.cargarmodulonativodesdern

import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import android.content.Intent
import com.facebook.react.bridge.Promise


class MyModule(context: ReactApplicationContext) : ReactContextBaseJavaModule(context) {
    private var reactContext: ReactApplicationContext = context

    override fun getName(): String {
        return "MyModule"
    }

@ReactMethod
fun calculate(firstNumber: Int, secondNumber: Int, promise: Promise) {
    val result = firstNumber + secondNumber
    promise.resolve(result)
}
}
