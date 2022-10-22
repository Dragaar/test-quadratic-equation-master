package com.epam.rd.autotasks;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class QuadraticEquationSingleRootCasesTesting {

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { 0, -6, 9, 3.0 }, { 0, 12, 36, -6.0 },
                { 0, -8, 16, 4.0 }, { 0, -10, 25, 5.0 }
        });
    }

    protected QuadraticEquation quadraticEquation = new QuadraticEquation();

    private double a; private double b; private double c; private String expected;
    public QuadraticEquationSingleRootCasesTesting(double a, double b, double c, double expected) {
        if(a == 0) this.a = 1;
        else this.a = a;
        this.b = b;
        this.c = c;
        this.expected = String.valueOf(expected);
    }

    @Test
    public void testSingleRoot() {
        assertEquals(expected, quadraticEquation.solve(a, b, c));
    }


}