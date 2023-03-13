package com.atiurin.sampleapp.tests.compose
import androidx.compose.ui.test.hasTestTag
import com.atiurin.sampleapp.activity.ComposeListActivity
import com.atiurin.sampleapp.compose.contactsListTestTag
import com.atiurin.sampleapp.steps.EnterTextStep
import com.atiurin.sampleapp.steps.OpenChatStep
import com.atiurin.ultron.core.compose.createUltronComposeRule
import org.junit.Rule
import org.junit.Test

class CollectionInteractionTest {
    @get:Rule
    val composeRule = createUltronComposeRule<ComposeListActivity>()
    val list = hasTestTag(contactsListTestTag)

    @Test
    fun firstTest() {
        OpenChatStep.checkAndClick("Chandler Bing")
        EnterTextStep.sendMessage("Is your appium working ?")
    }
}
