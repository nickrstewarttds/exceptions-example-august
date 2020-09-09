package com.qa.main;

public class Runner {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
//		System.out.println(calc.add(9, 6));
//		System.out.println(calc.add(5, 8));
//		System.out.println(calc.add(2, 6));
//		System.out.println(calc.add(7, 4));

//		System.out.println(calc.divide());
//		System.out.println(calc.divide(4.0, 2.0));
//		System.out.println(calc.divide(4.0, 2.0, 1.0));

        System.out.println(calc.divide(1.0, 2.0)); // nftbe
        System.out.println(calc.divide(2.0, 1.0)); // ok
    }

}
