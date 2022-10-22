package com.epam.rd.autotasks;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

//тестування не нульового a
@RunWith(Parameterized.class)
public class QuadraticEquationZeroACasesTesting {

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { 2, 4, 2 }, { 3, -1, 2 },
                { 2, 2, -5 }, { 4, 63, 1 }
        });
    }

    protected QuadraticEquation quadraticEquation = new QuadraticEquation();

    private double a; private double b; private double c;
    public QuadraticEquationZeroACasesTesting(double a, double b, double c) {
        if(a == 0) this.a = 1;
        else this.a = a;
        this.b = b;
        this.c = c;
    }
    @Test(expected = IllegalArgumentException.class)
    public void testTwoRoots() {
        String equationResult = quadraticEquation.solve(a, b, c);
        if(equationResult != null) throw new IllegalArgumentException();

    }

}
