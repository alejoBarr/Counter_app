package com.curso.andrroid.app.practica.counter_app
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import org.junit.Rule
import org.junit.Test

class MainActivityTest {

    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun testCompareButton() {
        onView(withId(R.id.editText1)).perform(typeText("Hola"))
        onView(withId(R.id.editText2)).perform(typeText("Hola"))
        onView(withId(R.id.compareButton)).perform(click())
        onView(withId(R.id.resultTextView)).check(matches(withText("Las cadenas son iguales")))
    }
}
