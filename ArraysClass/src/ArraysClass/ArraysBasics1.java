package ArraysClass;

import java.util.Arrays;

public class ArraysBasics1 {
	public static void main(String[] args) {
		String[] names = {"nithyasuburam", "suresh", "suriyan","nithyakalyani", "vishal"};
		Arrays.sort(names);  // it sort alphapetical order
		for(int i=0; i<names.length; i++) {
			System.out.println(names[i]);
		}
		
		
		ComparatorDemo cd = new ComparatorDemo();
		Arrays.sort(names, cd);
		System.out.println("\nUsing Comparator Interface\n");
		for(int i=0; i<names.length; i++) {
			System.out.println(names[i]);
		}
	}

}
