package com.ghedamsisabri.ui_testing_for_beginner

import android.view.View
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.activityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import com.ghedamsisabri.ui_testing_for_beginner.Helper.getText
import com.ghedamsisabri.ui_testing_for_beginner.Helper.isTextOnScreen
import com.ghedamsisabri.ui_testing_for_beginner.Helper.isViewDisplayed
import com.ghedamsisabri.ui_testing_for_beginner.Helper.tap
import org.hamcrest.Matcher
import org.junit.Assert

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Rule


@RunWith(AndroidJUnit4::class)
@LargeTest
class ExampleInstrumentedTest {

    @get:Rule
    var activityScenarioRule = activityScenarioRule<MainActivity>()

    @Test
    fun checkSecondPage() {
        NextBtn.tap()
        secondPageActivity.isViewDisplayed()

        isTextOnScreen("SecondaryActivity")
        Assert.assertEquals("SecondaryActivity", secondPageActivity.getText(5))
    }

    companion object {
        val NextBtn: Matcher<View> by lazy { withId(R.id.button_next_activity) }
        val secondPageActivity: Matcher<View> by lazy { withId(R.id.activity_secondary_title) }

        // added back button
        val BackBtn: Matcher<View> by lazy { withId(R.id.button_back) }
    }

    // bellow function is added
    fun studentFunction() {
        NextBtn.tap()

        onView(secondPageActivity)
            .check(ViewAssertions.matches(ViewMatchers.withText(R.string.text_secondaryactivity)))

        onView(BackBtn)
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))


    }
}