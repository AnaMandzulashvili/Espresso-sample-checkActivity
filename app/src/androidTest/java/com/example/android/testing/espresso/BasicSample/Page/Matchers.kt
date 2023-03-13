package com.example.android.testing.espresso.BasicSample.Page

import android.view.View
import androidx.test.espresso.matcher.ViewMatchers
import com.example.android.testing.espresso.BasicSample.R
import org.hamcrest.Matcher

object Matchers {
    val TextInput: Matcher<View> by lazy { ViewMatchers.withId(R.id.editTextUserInput) }
    val ChangeText: Matcher<View> by lazy { ViewMatchers.withId(R.id.changeTextBt) }
    val TextView: Matcher<View> by lazy { ViewMatchers.withId(R.id.show_text_view) }
    val activityChange: Matcher<View> by lazy { ViewMatchers.withId(R.id.activityChangeTextBtn) }
    //com.example.android.testing.espresso.BasicSample:id/show_text_view
}