package ua.lviv.iot.lab1;

public record Oscillograph(int maxFrequency, float memoryCapacity, String brand, String type, int releaseYear, int price) {
	
	static String celler;
	
	static String getCeller() {
		return celler;
	}
	
	public Oscillograph() {
		this(0, 0.0f, "unknown brand", "unknown type", 0, 0);
	}
	
	public Oscillograph(int maxFrequency, String brand, String type) {
		this(maxFrequency, 0, brand, type, 0, 0);
	}
	
	@Override
	
	public String toString() {
		return String.format("\tBrand: %s\n" + "\tMax Frequency: %d\n" + "\tMemory Capacity: %f\n" + "\tType: %s\n" + "\tRealeas at: %d\n" + "\tPrice: %d\n", brand, maxFrequency, memoryCapacity, type, releaseYear, price);
	}
}
