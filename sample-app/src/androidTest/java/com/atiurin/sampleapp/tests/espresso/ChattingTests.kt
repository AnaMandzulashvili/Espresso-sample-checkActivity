package com.atiurin.sampleapp.tests.espresso

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import com.atiurin.sampleapp.Steps.FindFriendStep
import com.atiurin.sampleapp.Steps.ScrollSteps
import com.atiurin.sampleapp.activity.MainActivity
import com.atiurin.sampleapp.helper.isTextOnScreen
import com.atiurin.sampleapp.helper.isViewDisplayed
import com.atiurin.sampleapp.helper.typeText
import com.atiurin.sampleapp.pages.UIElementPage
import com.atiurin.ultron.extensions.tap
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest
class ChattingTests {

    @get:Rule
    val activityTestRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun textWithMyFriend() {
        with(UIElementPage) {
            isTextOnScreen("Friends")
            nameChandler.isViewDisplayed()
            nameChandler.tap()
            textInput.typeText("Hello Rachel")

            messageInputText.isViewDisplayed()

        }
    }

    @Test
    fun studentTest(){
        val name = FindFriendStep.findFriendFunction(" Emmet Brown")
        ScrollSteps.srollAndClick(name,  "let's go for a drink" )

    }
    @Test
    fun studentTestwo(){
        val name = FindFriendStep.findFriendFunction("Friend17")
        ScrollSteps.srollAndClick(name,   "please change your name" )

    }

}