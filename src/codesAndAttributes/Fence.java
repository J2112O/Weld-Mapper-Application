/*
 * This class captures existing Fence crossings. 
 */

package codesAndAttributes;
import java.util.Scanner;
public class Fence extends BasicAttributes {
	
	Scanner input = new Scanner(System.in);
	
	// Creating and instance of BasicAttributes Class
	BasicAttributes bA = new BasicAttributes();
	
	// An Array of the fence types
	private String[] fenceTypes = {"Barbwire","Chainlink","Chainlink w/Barb","Chicken Wire",
			"Electric","Hog Wire","Metal","Pipe","Plastic","Rock","Steel Cable","Wood"};
	
	private String type;
	private String shotLocation;
	private double height;
	private int strandCount;
		
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
	public void displayFenceTypes(String[] x) {
		for(int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}
	}
	public void fenceDataCollect() {
		System.out.print("Enter the GPS Point for this Code: ");
		bA.gpsShot= input.nextInt();
		input.nextLine();
		System.out.print("Enter the Type of Fence.. \n");
		displayFenceTypes(fenceTypes);
		System.out.print(": ");
		this.type = input.nextLine();
		System.out.print("Shot location (Corner,Post,In Line,In Line(Meandering)): ");
		this.shotLocation = input.nextLine();
		System.out.print("Enter the height of the fence: ");
		this.height = input.nextDouble();
		input.nextLine();
		System.out.print("Enter the strand count: ");
		this.strandCount = input.nextInt();
		input.nextLine();
		System.out.print("Notes: ");
		bA.notes= input.nextLine();
		input.close();
				
	}
}
