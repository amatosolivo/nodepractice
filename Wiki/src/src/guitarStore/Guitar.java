package guitarStore;

public class Guitar {
	String serialNumber;
	GuitarSpecs guitarSpecs;
	double price;
	
	public Guitar(String serialNumber, GuitarSpecs specs, double price) {
		this.serialNumber = serialNumber;
		this.guitarSpecs = specs;
		this.price = price;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public GuitarSpecs getGuitarSpecs() {
		return guitarSpecs;
	}

	public void setGuitarSpecs(GuitarSpecs guitarSpecs) {
		this.guitarSpecs = guitarSpecs;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
