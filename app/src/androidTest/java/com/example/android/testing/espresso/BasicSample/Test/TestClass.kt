package com.example.android.testing.espresso.BasicSample.Test

import androidx.test.espresso.Espresso
import androidx.test.filters.LargeTest
import androidx.test.runner.AndroidJUnit4
import com.example.android.testing.espresso.BasicSample.Helper.getText
import com.example.android.testing.espresso.BasicSample.Page.Matchers
import com.example.android.testing.espresso.BasicSample.Steps.StepClass
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest
class TestClass {

    @Test
    fun mainFunction(){
        StepClass.typeText("ana")
        Assert.assertEquals("ana",Matchers.TextView.getText())

    }
}