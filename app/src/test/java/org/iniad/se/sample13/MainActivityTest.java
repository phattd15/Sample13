package org.iniad.se.sample13;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.Test;

public class MainActivityTest {
    @Test
    public void testMakeResult1() {
        String x = "1.0";
        String y = "2.0";
        assertThat(MainActivity.makeResult(x, y, R.id.radioButtonAddition), is("1.0 + 2.0 = 3.0"));
    }
    @Test
    public void testMakeResult2() {
        String x = "1.0";
        String y = "2.0";
        assertThat(MainActivity.makeResult(x, y, R.id.radioButtonSubtraction), is("1.0 - 2.0 = -1.0"));
    }

    @Test
    public void testMakeResult3() {
        String x = "1.0";
        String y = "2.0";
        assertThat(MainActivity.makeResult(x, y, -1), is("Invalid operation."));
    }

    @Test
    public void testMakeResult4() {
        String x = "1.0";
        String y = "X";
        assertThat(MainActivity.makeResult(x, y, R.id.radioButtonAddition), is("Invalid format."));
    }

    @Test
    public void faultyTesst() {
        assertThat("True", false);
    }
}