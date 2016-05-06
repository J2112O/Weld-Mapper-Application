package codesAndAttributes;
import java.util.Scanner;

public class ExistingFacility {
	Scanner input = new Scanner(System.in);
	
	private int gpsShot;
	private String owner;
	private double size;
	private String crossingProp;
	private String depthMethod;
	private double depthInDecFeet;
	private double clearanceInDecFeet;
	private String notes;
	
	// An array of the Depth Methods
	private String[] depthMethodTypes = {"Open Cut","Locator","Exposed","Potholed"};
	
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public double getSize() {
		return size;
	}
	public void setSize(double size) {
		this.size = size;
	}
	public String getCrossingProp() {
		return crossingProp;
	}
	public void setCrossingProp(String crossingProp) {
		this.crossingProp = crossingProp;
	}
	public String getDepthMethod() {
		return depthMethod;
	}
	public void setDepthMethod(String depthMethod) {
		this.depthMethod = depthMethod;
	}
	public double getDepthInDecFeet() {
		return depthInDecFeet;
	}
	public void setDepthInDecFeet(double depthInDecFeet) {
		this.depthInDecFeet = depthInDecFeet;
	}
	public double getClearanceInDecFeet() {
		return clearanceInDecFeet;
	}
	public void setClearanceInDecFeet(double clearanceInDecFeet) {
		this.clearanceInDecFeet = clearanceInDecFeet;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public int getGpsShot() {
		return gpsShot;
	}
	public void setGpsShot(int gpsShot) {
		this.gpsShot = gpsShot;
	}	
	
	public void existingFacilityDataCollect() {
		System.out.print("Enter the GPS Point for this Code: ");
		this.gpsShot = input.nextInt();
		input.nextLine();		
		System.out.println("Enter the owner of the Existing Facility: ");
		this.owner = input.nextLine();
		System.out.print("Enter the size(in inches) of the Existing Facility: ");
		this.size = input.nextInt();
		input.nextLine();
		System.out.print("Crossing proposed route?(Yes or No) ");
		this.crossingProp = input.nextLine();
		System.out.print("Depth Method.. \n");
		displayDepthMethods(depthMethodTypes);
		System.out.print(": ");
		this.depthMethod = input.nextLine();
		System.out.print("Depth in Decimal Feet: ");
		this.depthInDecFeet = input.nextDouble();
		input.nextLine();
		System.out.print("Clearance in Decimal Feet: ");
		this.clearanceInDecFeet = input.nextDouble();
		input.nextLine();
		System.out.print("Enter any Notes(None if no notes): ");
		this.notes = input.nextLine();
		input.close();
		}
	public void displayDepthMethods(String[] x) {
		for(int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}
	}
}
