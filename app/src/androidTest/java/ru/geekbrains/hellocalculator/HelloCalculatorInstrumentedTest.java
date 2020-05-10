package ru.geekbrains.hellocalculator;

import android.content.Context;

import androidx.test.filters.LargeTest;
import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.*;
import static androidx.test.espresso.assertion.ViewAssertions.*;
import static androidx.test.espresso.matcher.ViewMatchers.*;

import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
@LargeTest
public class HelloCalculatorInstrumentedTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(
            MainActivity.class);

    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();

        assertEquals("ru.geekbrains.hellocalculator", appContext.getPackageName());
    }

    @Test
    public void addDigits(){
        Page page = new Page();

        page.putArgument("2");
        page.clickPlus();
        page.checkEmptyArgument();
        page.putArgument("3");
        page.clickResult();
        page.checkArgument("5");
    }

    @Test
    public void subDigit(){
        Page page = new Page();

        page.putArgument("2");
        page.clickMinus();
        page.checkEmptyArgument();
        page.putArgument("1");
        page.clickResult();
        page.checkArgument("1");
    }

    @Test
    public void mulDigit(){
        Page page = new Page();

        page.putArgument("2");
        page.clickMulti();
        page.checkEmptyArgument();
        page.putArgument("3");
        page.clickResult();
        page.checkArgument("6");
    }

    @Test
    public void divDigit(){
        Page page = new Page();

        page.putArgument("9");
        page.clickDiv();
        page.checkEmptyArgument();
        page.putArgument("3");
        page.clickResult();
        page.checkArgument("3");
    }

    @Test
    public void clearDigit(){
        Page page = new Page();

        page.putArgument("9");
        page.clickClear();
        page.checkEmptyArgument();
    }

    static class Page {

        // Введем аргумент
        public void putArgument(String arg){
            onView(withId(R.id.argument))
                    .perform(typeText(arg));
        }

        // +
        public void clickPlus(){
            onView(withId(R.id.buttonPlus)).perform(click());
        }

        // -
        public void clickMinus(){
            onView(withId(R.id.buttonMinus)).perform(click());
        }

        // /
        public void clickDiv(){
            onView(withId(R.id.buttonDivide)).perform(click());
        }

        // *
        public void clickMulti(){
            onView(withId(R.id.buttonMultiplication)).perform(click());
        }

        // C
        public void clickClear(){
            onView(withId(R.id.buttonClear)).perform(click());
        }

        // Проверка, что поле очистилось
        public void checkEmptyArgument(){
            onView(withId(R.id.argument))
                    .check(matches(withText("")));
        }

        // =
        public void clickResult(){
            onView(withId(R.id.buttonResult)).perform(click());
        }

        // проверка на аргумент
        public void checkArgument(String result){
            onView(withId(R.id.argument))
                    .check(matches(withText(result)));
        }
    }

}
