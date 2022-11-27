package com.collections;

import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		
		TreeSet<String> names=new TreeSet<String>();
		names.add("ramakrishna");
		names.add("suresh");
		names.add("akash");
		names.add("mahesh");
		
		System.out.println(names);//Comparable--->DNSO--->compareTo & Comparator
									//Comparator-->CSO-->compare() java.util
		String obj1="ramakrishna";//scp
		String obj2=new String("suresh");//heap

		System.out.println(obj2.compareTo(obj1));
		
		
	//	System.out.println(obj1==obj2);
		
		//System.out.println(name.equals(name1));
		
		//returns +ve if obj1 has to come after object2 
		//returns -ve if obj1 has to come before object2 
		//return 0 if  both are same
		
//lama,rama,wama
	}
	
	
	
	
}
