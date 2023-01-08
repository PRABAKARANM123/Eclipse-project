package ArraysClass;

public class TypeCastingDemo {
	public static void main(String[] args) {
		int i=5;
		long l = (long)i;//  Up Casting
		System.out.println(l);
		double l2 = (double)i;
		System.out.println(l2);
		
		//Down Casting
		short s = (short)i;
		System.out.println(s);
		byte b = (byte)i;
		System.out.println(b);
	}

}
