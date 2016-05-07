package codesAndAttributes;

import java.util.Scanner;
public class Fence {
	
	Scanner input = new Scanner(System.in);
	
	// An Array of the fence types
	private String[] fenceTypes = {"Barbwire","Chainlink","Chainlink w/Barb","Chicken Wire",
			"Electric","Hog Wire","Metal","Pipe","Plastic","Rock","Steel Cable","Wood"};
	
	private int gpsShot;
	private String type;
	private String shotLocation;
	private double height;
	private int strandCount;
	private String notes;
	
	public int getGpsShot() {
		return gpsShot;
	}
	public void setGpsShot(int gpsShot) {
		this.gpsShot = gpsShot;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getShotLocation() {
		return shotLocation;
	}
	public void setShotLocation(String shotLocation) {
		this.shotLocation = shotLocation;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public int getStrandCount() {
		return strandCount;
	}
	public void setStrandCount(int strandCount) {
		this.strandCount = strandCount;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public void displayFenceTypes(String[] x) {
		for(int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}
	}
	public void fenceDataCollect() {
		System.out.print("Enter the GPS Point for this Code: ");
		this.gpsShot = input.nextInt();
		input.nextLine();
		System.out.print("Enter the Type of Fence.. \n");
		displayFenceTypes(fenceTypes);
		System.out.print(": ");
		this.type = input.nextLine();
		System.out.print("Shot location (In-Line or Corner): ");
		this.shotLocation = input.nextLine();
		System.out.print("Enter the height of the fence: ");
		this.height = input.nextDouble();
		input.nextLine();
		System.out.print("Enter the strand count: ");
		this.strandCount = input.nextInt();
		input.nextLine();
		System.out.print("Notes: ");
		this.notes = input.nextLine();
		input.close();
				
	}
}
