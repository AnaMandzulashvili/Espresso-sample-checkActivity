package com.atiurin.sampleapp.steps
import androidx.test.espresso.matcher.ViewMatchers.withText
import com.atiurin.sampleapp.pages.Matchers
import com.atiurin.ultron.extensions.click
import com.atiurin.ultron.extensions.isDisplayed

object OpenChatStep {

    fun checkAndClick(contactName: String) {
        Matchers.dashboardBtn.isDisplayed()
        Matchers.name.matches(withText(contactName).click())
    }
}
