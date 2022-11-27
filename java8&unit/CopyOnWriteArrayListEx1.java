package com.collection.concurrentCollectionEx;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListEx1 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("X");
		al.add("Y");
		System.out.println(al);
		CopyOnWriteArrayList cowal = new CopyOnWriteArrayList();
		cowal.addIfAbsent("A");
		cowal.add("B");
		cowal.addIfAbsent("B");
		System.out.println(cowal);
		cowal.addAllAbsent(al);
		System.out.println(cowal);
		ArrayList al1 = new ArrayList();
		al1.add("X");
		al1.add("Y");
		al1.add("Z");
		System.out.println(al1);
		cowal.addAllAbsent(al1);
		System.out.println(cowal);

	}
}
