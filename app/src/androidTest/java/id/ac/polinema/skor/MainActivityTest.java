package id.ac.polinema.skor;


import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

import androidx.test.espresso.ViewInteraction;
import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.Espresso.pressBack;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.replaceText;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void mainActivityTest() {
        ViewInteraction appCompatButton = onView(
                allOf(withId(R.id.button_add_home), withText("Add Score Home"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.fragment),
                                        0),
                                2),
                        isDisplayed()));
        appCompatButton.perform(click());

        ViewInteraction appCompatEditText = onView(
                allOf(withId(R.id.input_name),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.fragment),
                                        0),
                                3),
                        isDisplayed()));
        appCompatEditText.perform(replaceText("bagus"), closeSoftKeyboard());

        ViewInteraction appCompatEditText2 = onView(
                allOf(withId(R.id.input_minute), withText("0"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.fragment),
                                        0),
                                4),
                        isDisplayed()));
        appCompatEditText2.perform(replaceText("06464"));

        ViewInteraction appCompatEditText3 = onView(
                allOf(withId(R.id.input_minute), withText("06464"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.fragment),
                                        0),
                                4),
                        isDisplayed()));
        appCompatEditText3.perform(closeSoftKeyboard());

        pressBack();

        ViewInteraction appCompatButton2 = onView(
                allOf(withId(R.id.button_save), withText("Save"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.fragment),
                                        0),
                                5),
                        isDisplayed()));
        appCompatButton2.perform(click());

        ViewInteraction appCompatButton3 = onView(
                allOf(withId(R.id.button_add_away), withText("Add Score Away"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.fragment),
                                        0),
                                3),
                        isDisplayed()));
        appCompatButton3.perform(click());

        ViewInteraction appCompatEditText4 = onView(
                allOf(withId(R.id.input_name),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.fragment),
                                        0),
                                3),
                        isDisplayed()));
        appCompatEditText4.perform(replaceText("bagus"), closeSoftKeyboard());

        ViewInteraction appCompatEditText5 = onView(
                allOf(withId(R.id.input_minute), withText("0"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.fragment),
                                        0),
                                4),
                        isDisplayed()));
        appCompatEditText5.perform(replaceText("0645"));

        ViewInteraction appCompatEditText6 = onView(
                allOf(withId(R.id.input_minute), withText("0645"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.fragment),
                                        0),
                                4),
                        isDisplayed()));
        appCompatEditText6.perform(closeSoftKeyboard());

        pressBack();

        ViewInteraction appCompatButton4 = onView(
                allOf(withId(R.id.button_save), withText("Save"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.fragment),
                                        0),
                                5),
                        isDisplayed()));
        appCompatButton4.perform(click());

        ViewInteraction appCompatButton5 = onView(
                allOf(withId(R.id.button_add_home), withText("Add Score Home"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.fragment),
                                        0),
                                2),
                        isDisplayed()));
        appCompatButton5.perform(click());

        ViewInteraction appCompatEditText7 = onView(
                allOf(withId(R.id.input_name),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.fragment),
                                        0),
                                3),
                        isDisplayed()));
        appCompatEditText7.perform(replaceText("fariz"), closeSoftKeyboard());

        ViewInteraction appCompatEditText8 = onView(
                allOf(withId(R.id.input_minute), withText("0"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.fragment),
                                        0),
                                4),
                        isDisplayed()));
        appCompatEditText8.perform(replaceText("0465"));

        ViewInteraction appCompatEditText9 = onView(
                allOf(withId(R.id.input_minute), withText("0465"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.fragment),
                                        0),
                                4),
                        isDisplayed()));
        appCompatEditText9.perform(closeSoftKeyboard());

        pressBack();

        ViewInteraction appCompatButton6 = onView(
                allOf(withId(R.id.button_save), withText("Save"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.fragment),
                                        0),
                                5),
                        isDisplayed()));
        appCompatButton6.perform(click());

        ViewInteraction appCompatButton7 = onView(
                allOf(withId(R.id.button_add_away), withText("Add Score Away"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.fragment),
                                        0),
                                3),
                        isDisplayed()));
        appCompatButton7.perform(click());

        ViewInteraction appCompatEditText10 = onView(
                allOf(withId(R.id.input_name),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.fragment),
                                        0),
                                3),
                        isDisplayed()));
        appCompatEditText10.perform(replaceText("jahdh"), closeSoftKeyboard());

        ViewInteraction appCompatEditText11 = onView(
                allOf(withId(R.id.input_minute), withText("0"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.fragment),
                                        0),
                                4),
                        isDisplayed()));
        appCompatEditText11.perform(replaceText("0646"));

        ViewInteraction appCompatEditText12 = onView(
                allOf(withId(R.id.input_minute), withText("0646"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.fragment),
                                        0),
                                4),
                        isDisplayed()));
        appCompatEditText12.perform(closeSoftKeyboard());

        pressBack();

        pressBack();

        pressBack();

        ViewInteraction appCompatButton8 = onView(
                allOf(withId(R.id.button_save), withText("Save"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.fragment),
                                        0),
                                5),
                        isDisplayed()));
        appCompatButton8.perform(click());

        ViewInteraction appCompatButton9 = onView(
                allOf(withId(R.id.button_add_away), withText("Add Score Away"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.fragment),
                                        0),
                                3),
                        isDisplayed()));
        appCompatButton9.perform(click());

        ViewInteraction appCompatButton10 = onView(
                allOf(withId(R.id.button_cancel), withText("Cancel"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.fragment),
                                        0),
                                6),
                        isDisplayed()));
        appCompatButton10.perform(click());
    }

    private static Matcher<View> childAtPosition(
            final Matcher<View> parentMatcher, final int position) {

        return new TypeSafeMatcher<View>() {
            @Override
            public void describeTo(Description description) {
                description.appendText("Child at position " + position + " in parent ");
                parentMatcher.describeTo(description);
            }

            @Override
            public boolean matchesSafely(View view) {
                ViewParent parent = view.getParent();
                return parent instanceof ViewGroup && parentMatcher.matches(parent)
                        && view.equals(((ViewGroup) parent).getChildAt(position));
            }
        };
    }
}
