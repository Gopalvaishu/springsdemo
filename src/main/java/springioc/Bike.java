package springioc;

public class Bike {
	
	String brand;
	double price;
	int cc;
	
	//constructor inj
	public Bike(String brand, double price, int cc) {
		super();
		this.brand = brand;
		this.price = price;
		this.cc = cc;
	}
	@Override
	public String toString() {
		return "Bike [brand=" + brand + ", price=" + price + ", cc=" + cc + "]";
	}
	
	
	
}
