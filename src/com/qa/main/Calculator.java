package com.qa.main;

public class Calculator {

    public int add(int num1, int num2) {
        return num1 + num2;
    }

    // method
    public double divide() {
        System.out.println("oops");
        return Double.MIN_VALUE;
    }

    // overloaded method (two arguments)
    public double divide(double num1, double num2) {
        try {
            // if num2 is bigger than num1, then throw nftbe
            if (num1 < num2) {
                throw new NumberFormatTooBigException();
            }
            return num1 / num2;
        } catch (NumberFormatTooBigException nftbe) {
            System.out.println("fancy new exception");
            nftbe.printStackTrace();
            return 0;
        } catch (RuntimeException rte) {
            System.out.println("oh no, runtime exception");
            rte.printStackTrace();
            return 0;
        } catch (Exception e) {
            System.out.println("oh no, exception");
            e.printStackTrace();
            return 0;
        }
    }

    // overloaded method (three arguments)
    public double divide(double num1, double num2, double num3) {
        return num1 / num2 / num3;
    }

    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public int subtract(int num1, int num2) {
        return num1 - num2;
    }
}