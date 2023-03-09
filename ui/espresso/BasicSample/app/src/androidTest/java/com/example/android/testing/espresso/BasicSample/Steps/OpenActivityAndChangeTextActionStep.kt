package com.example.android.testing.espresso.BasicSample.Steps

import com.example.android.testing.espresso.BasicSample.Page.MatcherClass
import com.example.android.testing.espresso.BasicSample.typeText

object OpenActivityAndChangeTextActionStep {

    fun typeTextTwo(text:String){
        MatcherClass.logOutButtonMatcher.typeText(text)
    }
}