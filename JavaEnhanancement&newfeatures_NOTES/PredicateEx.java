package com.java8;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.function.Supplier;

import com.collections.Employee;
@FunctionalInterface
interface AddOfThree{
	
	int add(int a,int b,int c);
	
	
}
public class PredicateEx {
	public static void main(String[] args) {

		IntPredicate predicate = i -> i % 2 == 0;// test()-->
		System.out.println(predicate.test(20));

		Predicate<String> predicate1 = name -> name.length() > 6; // test()-->
		System.out.println(predicate1.test("priya"));
		// apply
		Function<String, String> function = name -> name.toUpperCase();
		System.out.println(function.apply("ramakrishna"));
		Function<String, Integer> function1 = name -> name.length();
		System.out.println(function1.apply("ramakrishna"));
		
		BiFunction<Integer,Integer, Integer> function2 = (a,b) ->a+a;
		System.out.println(function2.apply(5,9));
		
		AddOfThree add=(a,b,c)->a+b+c;
		System.out.println(add.add(12, 1, 5));
		
		
		Consumer<Employee> consumer=emp->System.out.println(emp.getEname().substring(0, 2));
		Employee emp=new Employee(12,"suresh","hyd",9000);
		consumer.accept(emp);
		
		Supplier<Boolean> suplier=()->true;
		System.out.println(suplier.get());
		
	}
}
