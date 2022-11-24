package electronicsMultilevel;

public class SmartMobile extends Mobile {
	String display;
	String processor;
	String model;

	public SmartMobile(String power, String product, String storage, String brand, int price, int nosim, String display, String processor, String model) {
		super(power, product, storage, brand, price, nosim);
		this.display = display;
		this.processor = processor;
		this.model = model;
	}

	public String toString() {
		return super.toString() + display + processor + model;

	}

}
