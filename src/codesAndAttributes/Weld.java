/*
 *	This package captures all the information for each weld 
 */
package codesAndAttributes;
import java.util.Scanner;

public class Weld extends BasicAttributes {
	
	Scanner input = new Scanner(System.in);
	// Creating a new instance of the class Basic Attributes below.
	BasicAttributes bA = new BasicAttributes();

	private String weldType;
	private String weldId;
	private String pipeBack;
	private String pipeAhead;
	private String heatAhead;
	private double lengthAhead;
	private String wallChange;
	private String pipeLocation;
	private String welderInitials;

	public String getWeldType() {
		return weldType;
	}
	public void setWeldType(String weldType) {
		this.weldType = weldType;
	}
	public String getWeldId() {
		return weldId;
	}
	public void setWeldId(String weldId) {
		this.weldId = weldId;
	}
	public String getPipeBack() {
		return pipeBack;
	}
	public void setPipeBack(String pipeBack) {
		this.pipeBack = pipeBack;
	}
	public String getPipeAhead() {
		return pipeAhead;
	}
	public void setPipeAhead(String pipeAhead) {
		this.pipeAhead = pipeAhead;
	}
	public String getHeatAhead() {
		return heatAhead;
	}
	public void setHeatAhead(String heatAhead) {
		this.heatAhead = heatAhead;
	}
	public double getLengthAhead() {
		return lengthAhead;
	}
	public void setLengthAhead(double lengthAhead) {
		this.lengthAhead = lengthAhead;
	}
	public String getWallChange() {
		return wallChange;
	}
	public void setWallChange(String wallChange) {
		this.wallChange = wallChange;
	}
	public String getPipeLocation() {
		return pipeLocation;
	}
	public void setPipeLocation(String pipeLocation) {
		this.pipeLocation = pipeLocation;
	}
	public String getWelderInitials() {
		return welderInitials;
	}
	public void setWelderInitials(String welderInitials) {
		this.welderInitials = welderInitials;
	}
	public void weldDataCollect() {
		System.out.print("Enter the GPS Point for this Code: ");
		bA.gpsShot = input.nextInt();
		input.nextLine();		
		System.out.println("Enter the Weld Type.. ");
		displayCertainTypes(bA.weldTypes);
		System.out.print(": ");
		this.weldType = input.nextLine();
		System.out.print("Enter the Weld ID (X-Ray Number): ");
		this.weldId = input.nextLine();
		System.out.print("Enter the Pipe (Name or ID) back: ");
		this.pipeBack = input.nextLine();
		System.out.print("Enter the Pipe (Name or ID) ahead: ");
		this.pipeAhead = input.nextLine();
		System.out.print("Enter the Heat ahead: ");
		this.heatAhead = input.nextLine();
		System.out.print("Enter the Length ahead: ");
		this.lengthAhead = input.nextDouble();
		input.nextLine();
		System.out.print("Enter the Natural Ground shot for cover: ");
		bA.ngc = input.nextInt();
		input.nextLine();
		System.out.print("Enter the Cover: ");
		bA.cover= input.nextDouble();
		input.nextLine();
		System.out.print("Wall change? (Yes or No) ");
		this.wallChange = input.nextLine();
		System.out.print("Pipe in ditch (Yes or No): ");
		this.pipeLocation = input.nextLine();
		System.out.println("Welder initialis: ");
		this.welderInitials = input.nextLine();
		System.out.print("Enter any Notes (None if no notes): ");
		bA.notes= input.nextLine();
		input.close();
	}
}
