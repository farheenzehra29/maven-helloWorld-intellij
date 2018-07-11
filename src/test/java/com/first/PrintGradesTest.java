package com.first;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertThat;


public class PrintGradesTest {

    PrintGrades pg;

    @Before
    public void setup() {
        pg = new PrintGrades();
        System.out.println("In set up method");

    }
    @Ignore
    @Test
    public void testForA() {

        String result = pg.print(95);
        assertEquals("You got an A!", result);
    }

    @Test
    public void test2() {
        PrintGrades pg = new PrintGrades();
        String result = pg.print(90);
        assertNotEquals("You got an A!", result);
    }

    @Test
    public void testForB() {

        String result = pg.print(84);
        assertEquals("You got a B!", result);
    }

    @Test
    public void testForC() {

        String result = pg.print(75);
        assertEquals("You got a C!", result);
        assertNotEquals("You got a B!", result);

    }

    @Test
    public void testStringMethods2() {

        boolean b = pg.stringMethods2("You got Distinction");
        Assert.assertTrue(b);

        boolean b2 = pg.stringMethods2("You got 3");
        Assert.assertFalse(b2);
        assertThat("You got Distinction", CoreMatchers.containsString("Distinction"));

    }


}