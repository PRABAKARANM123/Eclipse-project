package ArraysClass;

import java.util.Arrays;

public class ArraysBasics {

	public static void main(String[] args) {
		int[] a = {10,20,30};
		int[] b = {20,10,30};
		System.out.println(Arrays.equals(a, b));
		Arrays.sort(b); //it sort Assending order
		for(int i=0; i<b.length; i++) {
			System.out.println(b[i]);
		}
		//System.out.println(b);

	}

}
