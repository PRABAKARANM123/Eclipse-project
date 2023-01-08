package Sorting;

public class Laptop {
	public String brand;
	public int price;
	public int ram;
	public String storage;
	
	public Laptop(String brand, int price, int ram, String storage) {
			this.brand = brand;
			this.price = price;
			this.ram = ram;
			this.storage = storage;
	}	
	
//	public String toString() { //toString overridenmethod
//		return "HI";
//	}
	
	public String toString() {
		return this.price+" : "+this.brand+" : "+this.ram+" : "+this.storage;
	}
	
	
}
