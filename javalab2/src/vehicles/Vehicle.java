package vehicles;

public class Vehicle {
	
	private String manufacturer;
	private int model;
	private String color;
	private int weight;
	private String licenseNo;
	public static enum fuel {
		DIESEL, GAS, ELECTRIC
		
	}
	
	public Vehicle(String manufacturer, int model, String color, int weight, String licenseNo) {
		this.manufacturer = manufacturer;
		this.model = model;
		this.color = color;
		this.weight = weight;
		this.licenseNo = licenseNo;
	}
	
	

	@Override
	public String toString() {
		return "Vehicle [manufacturer=" + manufacturer + ", model=" + model + ", color=" + color + ", weight=" + weight
				+ ", licenseNo=" + licenseNo + "]";
	}
	public String getManufacturer() {
		return manufacturer;
	}

	public int getModel() {
		return model;
	}

	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}

	public int getWeight() {
		return weight;
	}

	public String getLicenseNo() {
		return licenseNo;
	}
	public void setLicenseNo(String licenseNo) {
		this.licenseNo = licenseNo;
	}

}
