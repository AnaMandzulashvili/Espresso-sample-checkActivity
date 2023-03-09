package com.example.android.testing.espresso.BasicSample.Page

import android.view.View
import androidx.test.espresso.matcher.ViewMatchers
import com.example.android.testing.espresso.BasicSample.R
import org.hamcrest.Matcher

object MatcherClass {

    val logOutButtonMatcher: Matcher<View> by lazy { ViewMatchers.withId(R.id.editTextUserInput) }
    val changeButtonMatcher: Matcher<View> by lazy{ ViewMatchers.withId(R.id.changeTextBt)}
    val openActivityButtonMatcher: Matcher<View> by lazy{ ViewMatchers.withId(R.id.activityChangeTextBtn)}
    val openActivityResultMatcher: Matcher<View> by lazy{ ViewMatchers.withId(R.id.show_text_view)}
}