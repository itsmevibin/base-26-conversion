package com.equipe.base26

import android.support.test.InstrumentationRegistry
import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.action.ViewActions.click
import android.support.test.espresso.action.ViewActions.replaceText
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.isDisplayed
import android.support.test.espresso.matcher.ViewMatchers.withId
import android.support.test.espresso.matcher.ViewMatchers.withText
import android.support.test.runner.AndroidJUnit4
import org.hamcrest.Matchers.allOf
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.Before
import android.support.test.rule.ActivityTestRule
import org.junit.Rule






@RunWith(AndroidJUnit4::class)
class MainActivityTest {
  val appContext = InstrumentationRegistry.getTargetContext()
  private var mainActivity: MainActivity? = null

  @Before
  fun setUp() {
    mainActivity = mActivityRule.activity
  }

  @get:Rule
  var mActivityRule: ActivityTestRule<MainActivity> = ActivityTestRule(MainActivity::class.java)

  @Test fun viewTest() {
    onView(allOf(withId(R.id.textView), withText("Base 26")))
    onView(withId(R.id.button)).perform(click()).check(matches(isDisplayed()))

    onView(withId(R.id.editText)).perform(replaceText("AB"))
    onView(withId(R.id.button)).perform(click())
    onView(allOf(withId(R.id.textView), withText("27")))
  }
}