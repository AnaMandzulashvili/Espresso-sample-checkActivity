package com.example.android.testing.espresso.BasicSample.Steps

import com.example.android.testing.espresso.BasicSample.Helper.tap
import com.example.android.testing.espresso.BasicSample.Helper.typeText
import com.example.android.testing.espresso.BasicSample.Page.Matchers

object StepClass {
    fun typeText(text:String){
        Matchers.TextInput.typeText(text)
        Matchers.activityChange.tap()

    }
}