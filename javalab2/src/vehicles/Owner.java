package vehicles;

import java.util.ArrayList;

public class Owner {
	
	private ArrayList<Vehicle> vehicles = new ArrayList<>();
	private String name;
	private String home;
	private int age;
	
	public Owner(String name, String home, int age) {
		this.name = name;
		this.home = home;
		this.age = age;
		
	}
	
	public void addVehicle(Vehicle v) {
		vehicles.add(v);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHome() {
		return home;
	}

	public void setHome(String home) {
		this.home = home;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public ArrayList<Vehicle> getVehicles() {
		return vehicles;		
	}

}
