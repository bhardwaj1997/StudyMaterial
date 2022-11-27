package com.collections;

import java.util.Comparator;
import java.util.TreeSet;

class CSO implements Comparator<String> 
{
	@Override
	public int compare(String obj1, String obj2) {
		
		//return -obj1.compareTo(obj2);
		return obj2.compareTo(obj1);
	}
	
}
public class TreeSetEx1 {

	public static void main(String[] args) {
		TreeSet<String> names=new TreeSet<String>(new CSO());
		names.add("ramakrishna");
		names.add("suresh");
		names.add("akash");
		names.add("mahesh");
		System.out.println(names);

	}

}
