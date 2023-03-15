package com.atiurin.sampleapp.pages

import androidx.test.espresso.matcher.ViewMatchers
import com.atiurin.sampleapp.R

object Matchers {
    val name by lazy { ViewMatchers.withId(R.id.tv_name) }
    val inputMessageText by lazy {ViewMatchers.withId(R.id.message_input_text)}
    val massageText by lazy {ViewMatchers.withId(R.id.message_text)}
}