package vehicles;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class Application {
	static Scanner sc = new Scanner(System.in);
	static ArrayList<Owner> owners = new ArrayList<>();
	
	static String line;
	
	public static void main(String args[]) {
		
		readFile();
		saveFile();


		//testInit();
		
		while(true) {
		Menu();
		}
						
	}
	
	private static void Menu() {
		System.out.println("1. List vehicles");
		System.out.println("2. Create Vehicle");
		System.out.println("3. List Owners");
		System.out.println("4. Create Owner");
		System.out.println("5. Quit");
		Integer choice = sc.nextInt();
		if (choice.intValue() == 1) {
			listVehicles();
		} if (choice.intValue() == 2) {
			createVehicle(); 
				
			
		}
	}
	
	private static void readFile()  {
				
		try {			
			Scanner scan = new Scanner(new File(System.getProperty("user.dir") + "\\" +  "owners.txt"));
			while(scan.hasNext()) {
				line = scan.nextLine().toLowerCase().toString();
				if(line.contains("user")) {
					System.out.println("Found user");
					String name = scan.nextLine();
					String home = scan.nextLine();
					int age = Integer.parseInt(scan.nextLine());
					owners.add(new Owner(name, home, age));
					System.out.println(owners.get(0).toString());
				}
			}
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		}
	}
	
	private static void saveFile() {
		
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(System.getProperty("user.dir") + "\\" +  "owners.txt"));
			for (Owner o : owners) {
				writer.write("\n" + "test");
				
			}
			writer.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	public static void testInit() {
		owners.add(new Owner("bill", "gbg", 20));
		owners.add(new Owner("emma", "hjo", 25));
		
		Car c = new Car(2, "bmw", 1980, "white", 400, "AAA 333");
		owners.get(0).addVehicle(c);
		Car r = new Car(4, "www", 1180, "wite", 133, "aAw 333");
		owners.get(0).addVehicle(r);
		Truck t = new Truck(40, 15, "ford", 2000, "black", 500, "BBB 111");
		owners.get(1).addVehicle(t);
		owners.get(0).addVehicle(t);
		
	}
	
	public static void listVehicles() {
		//ArrayList<Vehicle> parseVehicles = new ArrayList<>();
		System.out.println("-----------------");
		System.out.println("Listing Vehicles");
		System.out.println("-----------------");
		
		for (int i = 0; i < owners.size(); i++) {
			for (Vehicle v : owners.get(i).getVehicles()) {
				
				System.out.println((owners.get(i).getName() + "'s " +  v.toString()));
				
			}

		}
		
	}
	
	public static void createVehicle() {
		System.out.println("------------");
		System.out.println("Creating Vehicle");
		System.out.println("------------");
		System.out.println("1. Car");
		System.out.println("2. Truck");
		Integer choice = sc.nextInt();
		if (choice.intValue() == 1) {
			System.out.println("Creating Car");
			System.out.println("------------");
			System.out.println("Passenger amount?");
			int pass = sc.nextInt();
			System.out.println("Manufacturer?");
			String manu = sc.next();
			System.out.println("model year?");
			int model = sc.nextInt();
			System.out.println("color?");
			String color = sc.next();
			System.out.println("weight?");
			int weight = sc.nextInt();
			System.out.println("License No?");
			String license = sc.next();

			Car c = new Car(pass, manu, model, color, weight, license);
			System.out.println(c.toString());
			
			System.out.println("Belongs to?");
			for (int i = 0; i < owners.size(); i++) {
				System.out.println(i + ". " + owners.get(i).getName());
			}
			choice = sc.nextInt();
			for (int i = 0; i < owners.size(); i++) {
				if (choice.intValue() == i) {
					owners.get(i).addVehicle(c);
					System.out.println("Added car to " + owners.get(i).getName());
				}
			}
			
			
			
			
		} else if (choice.intValue() == 2) {
			System.out.println("Creating Truck");
			System.out.println("------------");
			System.out.println("Load Weight?");
			int loadWeight = sc.nextInt();
			System.out.println("Load Area Size?");
			int size = sc.nextInt();
			System.out.println("Manufacturer?");
			String manu = sc.next();
			System.out.println("model year?");
			int model = sc.nextInt();
			System.out.println("color?");
			String color = sc.next();
			System.out.println("weight?");
			int weight = sc.nextInt();
			System.out.println("License No?");
			String license = sc.next();

			Truck t = new Truck(size, loadWeight, manu, model, color, weight, license);
			System.out.println(t.toString());
			
			System.out.println("Belongs to?");
			for (int i = 0; i < owners.size(); i++) {
				System.out.println(i + ". " + owners.get(i).getName());
			}
			choice = sc.nextInt();
			for (int i = 0; i < owners.size(); i++) {
				if (choice.intValue() == i) {
					owners.get(i).addVehicle(t);
					System.out.println("Added Truck to " + owners.get(i).getName());
				}
			}
			
		}
		
		
	}
	
}
