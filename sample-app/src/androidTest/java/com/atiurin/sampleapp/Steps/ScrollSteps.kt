package com.atiurin.sampleapp.Steps

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers
import com.atiurin.sampleapp.framework.Log
import com.atiurin.sampleapp.helper.waitForViewVisible
import com.atiurin.sampleapp.pages.Matchers
import com.atiurin.ultron.extensions.hasText
import com.atiurin.ultron.extensions.isDisplayed
import com.atiurin.ultron.extensions.typeText
import org.hamcrest.Matcher

object ScrollSteps {
    fun srollAndClick(name:String, text:String){
        try{
            Log.time("Scroll+Click") {
            ViewMatchers.withText(name).isDisplayed()
            Espresso.onView(Matchers.name)
                .perform(
                    RecyclerViewActions
                        .scrollTo<RecyclerView.ViewHolder>(
                            ViewMatchers.hasDescendant(ViewMatchers.withText(name))
                        )
                )
                .perform(
                    RecyclerViewActions
                        .actionOnItem<RecyclerView.ViewHolder>(
                            ViewMatchers.hasDescendant(ViewMatchers.withText(name)),
                            ViewActions.click()
                        )
                )
        }
        }catch (_: Exception) {
            Thread.sleep(500)
        }

        Matchers.inputMessageText.hasText("Enter text").isDisplayed()
        Matchers.inputMessageText.typeText(text)
        Matchers.massageText.hasText(text).isDisplayed()
    }
}