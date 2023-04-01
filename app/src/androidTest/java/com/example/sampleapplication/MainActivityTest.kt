package com.example.sampleapplication

import androidx.test.espresso.Espresso.*
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class MainActivityTest{

    @get:Rule
    var activityScenarioRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun userInputTest(){
        onView(withId(R.id.editTextTextPersonName)).perform(typeText("Parag Sharma"), ViewActions.closeSoftKeyboard())
        onView(withId(R.id.button)).perform(click())

        onView(withId(R.id.textView)).check(matches(withText("Hello, Parag Sharma")))
    }
}