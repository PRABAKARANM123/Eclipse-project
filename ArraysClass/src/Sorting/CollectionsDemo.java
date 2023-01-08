package Sorting;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo {
	public static void main(String[] args) {
		Laptop l1 = new Laptop("Lenovo", 80000, 8, "1TB");
		Laptop l2 = new Laptop("HP", 90000, 16, "4TB");
		Laptop l3 = new Laptop("Dell", 70000, 12, "2TB");
		System.out.println(l1.hashCode());
		
		ArrayList list = new ArrayList();
		list.add(l1);
		list.add(l2);
		list.add(l3);
		//Collections.sort(list);
		ComparatorDemo cd= new ComparatorDemo();
		System.out.println("Befor Sorting "+list);
		Collections.sort(list, cd);
		System.out.println("After Sorting "+list);
	}

}
