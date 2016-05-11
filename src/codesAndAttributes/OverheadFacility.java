/*
 * This class captures Overhead Power Lines 
 */
package codesAndAttributes;
import java.util.Scanner;
public class OverheadFacility extends BasicAttributes {
	Scanner input = new Scanner(System.in);
	//Creating an instance of the Basic Attributes Class here
	BasicAttributes bA = new BasicAttributes();
	
	private int wireCount;
	private double height;
	private String type;
		
	public int getWireCount() {
		return wireCount;
	}
	public void setWireCount(int wireCount) {
		this.wireCount = wireCount;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public void overheadFacilityDataCollect() {
		System.out.println("Enter the GPS Shot for this Code: ");
		bA.gpsShot = input.nextInt();
		input.nextLine();
		System.out.println("Enter the wire count for the Overhead Facility: ");
		this.wireCount = input.nextInt();
		input.nextLine();
		System.out.println("Height: ");
		this.height = input.nextDouble();
		input.nextLine();
		System.out.println("Transmission line? (Yes or No): ");
		this.type = input.nextLine();
		System.out.println("Notes: ");
		bA.notes = input.nextLine();
		input.close();
	}
}
