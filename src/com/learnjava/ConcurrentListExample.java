package com.learnjava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentListExample {
	public static void main(String[] args) {
		/*ArrayList will through ConcurrentModificationException*/
		//List<String> list = new ArrayList<>();
		/*java.util.concurrent.CopyOnWriteArrayList will not throw any Exception on modification of current list*/
		List<String> list = new CopyOnWriteArrayList<>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		// get the iterator
		Iterator<String> it = list.iterator();

		// manipulate list while iterating
		while (it.hasNext()) {
			System.out.println("list is:" + list);
			String str = it.next();
			System.out.println(str);
			if (str.equals("2")) {
				list.remove("5");
			}

		}
	}
}
