package electronicsMultilevel;

public class Mobile extends Elctronics {
	String brand;
	int price;
	int nosim;

	public Mobile(String power, String product, String storage, String brand, int price, int nosim) {
		super (power, product, storage);
		this.brand = brand;
		this.price = price;
		this.nosim = nosim;
	}

	public String toString() {
		return super.toString()+brand+price+nosim;
	}

}
