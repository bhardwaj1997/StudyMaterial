package com.collections;

import java.util.HashMap;

public class Test {

	public static void main(String[] args) {
		HashMap<Long,Employee> emps=new HashMap<Long,Employee>();
		emps.put(979797978l, new Employee(12,"suresh","hyd",238.6f));//entry
		emps.put(788445545l, new Employee(13,"naresh","delhi",138.6f));
		emps.put(454578458l, new Employee(131,"ramesh","hyd",238.6f));
		emps.put(789878948l, new Employee(169,"mahesh","hyd",738.6f));
		emps.put(447878489l, new Employee(121,"sandeep","banglore",238.6f));
		System.out.println(emps);
	//hashing-->hashcode()
	}

}
