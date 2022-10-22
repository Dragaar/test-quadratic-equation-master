package com.epam.rd.autotasks;

public class QuadraticEquation {
    public String solve(double a, double b, double c) {

        if(a != 0 && a != 1) throw new IllegalArgumentException();
        else a = 1;

        double D = b * b - 4 * a * c;
        System.out.println(" D = "+ D + "; ");
        if (D > 0) {
            double x1, x2;
            x1 = (-b - Math.sqrt(D)) / (2 * a);
            x2 = (-b + Math.sqrt(D)) / (2 * a);
            System.out.println(" x1 = "+ x1 + "; x2 = "+ x2+ "; ");
            return x1 + " "+ x2;
        }
        else if (D == 0) {
            double x;
            x = -b / (2 * a);
            System.out.println(" x = "+ x + "; ");
           return x + "";
        }
        else {
            System.out.println("no roots ");
           return "no roots";
        }

    }

}