package vehicles;

public class Car extends Vehicle {

	public Car(int passengers, String manufacturer, int model, String color, int weight, String licenseNo) {
		super(manufacturer, model, color, weight, licenseNo);
		this.passengers = passengers;
		
		
	}

	@Override
	public String toString() {
		return "Vehicle: Car [manufacturer=" + getManufacturer() + ", model=" + getModel() + ", color=" + getColor() + ", weight=" + getWeight()
				+ ", licenseNo=" + getLicenseNo()  + ", passengers=" + getPassengers() + "]";
	}

	private int passengers;

	public int getPassengers() {
		return passengers;
	}

	public void setPassengers(int passengers) {
		this.passengers = passengers;
	}
	
	
}
