package vehicles;

public class Truck extends Vehicle {

	private int loadWeight;
	private int loadAreaSize;
	
	public Truck(int loadWeight, int loadAreaSize, String manufacturer, int model, String color, int weight, String licenseNo) {
		super(manufacturer, model, color, weight, licenseNo);
		this.loadAreaSize = loadAreaSize;
		this.loadWeight = loadWeight;
	}
	
	@Override
	public String toString() {
		return "Vehicle: Truck [manufacturer=" + getManufacturer() + ", model=" + getModel() + ", color=" + getColor() + ", weight=" + getWeight()
				+ ", licenseNo=" + getLicenseNo()  + ", loadWeight=" + getLoadWeight() + ", loadAreaSize=" + getLoadAreaSize() + "]";
	}
	
	public int getLoadWeight() {
		return loadWeight;
	}
	public void setLoadWeight(int loadWeight) {
		this.loadWeight = loadWeight;
	}
	public int getLoadAreaSize() {
		return loadAreaSize;
	}
	public void setLoadAreaSize(int loadAreaSize) {
		this.loadAreaSize = loadAreaSize;
	}
	
}
