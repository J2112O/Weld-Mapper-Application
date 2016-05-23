/*
 * This class captures Overhead Power Lines 
 */
package codesAndAttributes;
import java.io.*;
public class OverheadFacility extends BasicAttributes {
	
	BufferedReader br = new BufferedReader(new
			InputStreamReader(System.in));
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
	
	public void overheadFacilityDataCollect() throws IOException {
		System.out.println("Enter the GPS Point for this Code: ");
		bA.setGpsShot(Integer.parseInt(br.readLine()));
		System.out.println("Enter the wire count for the Overhead Facility: ");
		setWireCount(Integer.parseInt(br.readLine()));
		System.out.println("Height: ");
		setHeight(Double.parseDouble(br.readLine()));
	 	System.out.println("Is it a Transmission line? (Yes or No): ");
		setType(br.readLine());
		System.out.println("Notes: ");
		bA.setNotes(br.readLine());

	}
}
