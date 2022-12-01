package com.yash.Collection5;

import java.util.Collections;
import java.util.Vector;

public class Test {

	public static void main(String[] args) {

		Vector<Item> v = new Vector<Item>();
		v.add(new Item(101, "pepsi", 90));
		v.add(new Item(105, "coke", 65));
		v.add(new Item(103, "Fanta", 80));
		v.add(new Item(102, "Redbull", 100));
		v.add(new Item(104, "Fruity", 30));

		Collections.sort(v, new Id());

		for (Item i : v)

			System.out.println(
					"Items Id: " + i.getItemId() + "  Items NAME:  " + i.getName() + "  Item price:  " + i.getPrice());
	}

}
