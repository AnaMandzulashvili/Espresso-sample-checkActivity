package com.example.android.testing.espresso.BasicSample.Tests

import androidx.test.espresso.Espresso
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import com.example.android.testing.espresso.BasicSample.ChangeTextBehaviorKtTest
import com.example.android.testing.espresso.BasicSample.Page.MatcherClass
import com.example.android.testing.espresso.BasicSample.R
import com.example.android.testing.espresso.BasicSample.Steps.ChangeTextActionStep
import com.example.android.testing.espresso.BasicSample.Steps.OpenActivityAndChangeTextActionStep
import com.example.android.testing.espresso.BasicSample.getText
import com.example.android.testing.espresso.BasicSample.tap
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest
class ChangeTextTests {

    @Test
    fun firstTest(){
        ChangeTextActionStep.typeText("Ana")
        MatcherClass.changeButtonMatcher.tap()
        Assert.assertEquals("Ana",MatcherClass.logOutButtonMatcher.getText())
    }

    @Test
    fun secondTest(){
       OpenActivityAndChangeTextActionStep.typeTextTwo("Ana")
       MatcherClass.openActivityButtonMatcher.tap()
       Assert.assertEquals("Ana",MatcherClass.logOutButtonMatcher.getText())

       Espresso.onView(MatcherClass.openActivityResultMatcher).check(matches(withText("Ana")))

    }
}