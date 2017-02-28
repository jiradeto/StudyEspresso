package app.pg_applications.com.studyespresso;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by jiradet on 3/1/2017 AD.
 */

@RunWith(AndroidJUnit4.class)
public class MainActivityEspressoTest {

    @Rule
    public ActivityTestRule<MainActivity> mainActivityActivityTestRule = new ActivityTestRule<MainActivity>(MainActivity.class);

    @Test
    public void testEmptyInput() {
        onView(withId(R.id.bt_main)).perform(click());
        onView(withId(R.id.tv_result)).check(matches(withText(R.string.please_input)));
    }

    @Test
    public void inputRealData() {
        onView(withId(R.id.edt_price)).perform(typeText("199"));
        onView(withId(R.id.edt_discount)).perform(typeText("20"));
        onView(withId(R.id.bt_main)).perform(click());
    }

}
