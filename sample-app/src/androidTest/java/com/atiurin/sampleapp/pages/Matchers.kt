package com.atiurin.sampleapp.pages

import android.view.View
import androidx.test.espresso.matcher.ViewMatchers
import com.atiurin.sampleapp.R
import com.atiurin.ultron.core.espresso.recyclerview.withRecyclerView
import org.hamcrest.Matcher

object Matchers {

    val dashboardBtn: Matcher<View> by lazy { ViewMatchers.withId(R.id.drawer_layout) }
    val name by lazy { ViewMatchers.withId(R.id.tv_name) }
    val sendMessagesList = withRecyclerView(R.id.messages_list)

    val messageInputText: Matcher<View> by lazy { ViewMatchers.withId(R.id.message_input_text) }
    val sendButton: Matcher<View> by lazy { ViewMatchers.withId(R.id.send_button) }
}
