package com.atiurin.sampleapp.steps
import androidx.test.espresso.matcher.ViewMatchers.withText
import com.atiurin.sampleapp.pages.Matchers
import com.atiurin.ultron.extensions.click
import com.atiurin.ultron.extensions.typeText

object EnterTextStep {

    fun sendMessage(text: String) {
        Matchers.messageInputText.matches(withText("Enter text").typeText(text))
        Matchers.sendButton.click()
        Matchers.sendMessagesList.assertMatches(withText(text)).isDisplayed()
    }
}
