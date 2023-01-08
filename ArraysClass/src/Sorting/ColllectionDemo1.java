package Sorting;

import java.util.ArrayList;
import java.util.Collections;

public class ColllectionDemo1 {
	public static void main(String[] args) {
		Laptop l1 = new Laptop("Apple", 90000, 8, "1TB"); //If Price Is Same
		Laptop l2 = new Laptop("HP", 60000, 12, "4TB");    //compare ram
		Laptop l3 = new Laptop("Dell", 70000, 16, "2TB");
		System.out.println(l1.hashCode());
		
		ArrayList list = new ArrayList();
		list.add(l1);
		list.add(l2);
		list.add(l3);
		//Collections.sort(list);
		ComparatorDemo cd= new ComparatorDemo();
		System.out.println("Befor Sorting List "+list);
		Collections.sort(list, cd);
		System.out.println("After Sorting List "+list);
	}

}
