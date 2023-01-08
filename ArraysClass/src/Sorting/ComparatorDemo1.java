package Sorting;

import java.util.Comparator;

public class ComparatorDemo1 implements Comparator {
	@Override
	public int compare(Object obj1, Object obj2) {
		Laptop la1 = (Laptop)obj1;
		Laptop la2 = (Laptop)obj2;
		if(la1.price>la2.price)
			return 1;
		else if(la1.price<la2.price)
			return -1;
//		else {
//			if(l1.ram>l2.ram) {
//				return -1;
//			}
//			else if(l1.ram<l2.ram) {
//				return 1;
//			}
//		}
		return 0;
	}


}
