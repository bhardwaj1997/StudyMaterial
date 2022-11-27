package com.java8;

@FunctionalInterface
interface Calculator {
	int add(int a, int b);// (a,b)->a+b; SAM

	default void m1() {

	}

	static void m2() {

	}
}

public abstract class LamdaExWithFI implements Calculator {
	@Override
	public void m1() {

	}

	public static void main(String[] args) {
		Calculator calc = (x, y) -> {
			return x + y;
		};
		calc.m1();
		Calculator.m2();
		System.out.println(calc.add(232, 232));

	}
}
