package com.atiurin.sampleapp.Steps

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers
import com.atiurin.sampleapp.R
import com.atiurin.sampleapp.data.repositories.ContactRepositoty
import com.atiurin.sampleapp.framework.Log
import com.atiurin.sampleapp.helper.scrollAndClick
import com.atiurin.sampleapp.helper.waitForViewVisible
import com.atiurin.sampleapp.pages.Matchers
import com.atiurin.ultron.extensions.hasText
import com.atiurin.ultron.extensions.isDisplayed
import com.atiurin.ultron.extensions.typeText
import org.hamcrest.Matcher

object FindFriendStep {
    fun findFriendFunction(name:String): String {
    Matchers.name.hasText(name).isDisplayed()
        return name
    }
}