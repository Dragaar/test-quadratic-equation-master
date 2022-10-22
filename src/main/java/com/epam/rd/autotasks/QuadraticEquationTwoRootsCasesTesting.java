package com.epam.rd.autotasks;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(Parameterized.class)
public class QuadraticEquationTwoRootsCasesTesting {

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { 0, -5, 4, "1.0 4.0" }, { 0, -3, 2, "1.0 2.0" },
                { 0, -13, 12, "1.0 12.0" }, { 0, -7, 12, "3.0 4.0" }
        });
    }

    protected QuadraticEquation quadraticEquation = new QuadraticEquation();

    private double a; private double b; private double c; private String expected1; private String expected2;
    public QuadraticEquationTwoRootsCasesTesting(double a, double b, double c, String expected) {
        if(a == 0) this.a = 1;
        else this.a = a;
        this.b = b;
        this.c = c;
        this.expected1 = expected.split(" ")[0];
        this.expected2 = expected.split(" ")[1];
    }

    @Test
    public void testTwoRoots() {

        boolean result = ((expected1+" "+expected2).equals(quadraticEquation.solve(a, b, c))
        || (expected2+" "+expected1).equals(quadraticEquation.solve(a, b, c)));
        System.out.println(" result = "+ result + "; ");
        assertTrue(result);
    }

}
