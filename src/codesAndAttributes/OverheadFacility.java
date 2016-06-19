/*
 * This class captures Overhead Power Lines 
 */
package codesAndAttributes;
import java.io.*;
import java.util.InputMismatchException;

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
		while (true) {
            try {
                System.out.print("Enter the GPS Point for this Feature: ");
                bA.setGpsShot(Integer.parseInt(br.readLine()));
                break;
            } catch (InputMismatchException | NumberFormatException ex) {
                System.out.println("**ERROR** Whole numbers only. No words or decimals.");
            }
        }
		while (true) {
            try {
				System.out.println("Enter the wire count for the Overhead Facility: ");
				setWireCount(Integer.parseInt(br.readLine()));
                break;
            } catch (InputMismatchException | NumberFormatException ex) {
                System.out.println("**ERROR** Whole numbers only. No words or decimals.");
            }
        }
        while (true) {
            try {
                System.out.println("Height: ");
                setHeight(Double.parseDouble(br.readLine()));
                break;
            } catch (InputMismatchException | NumberFormatException ex) {
                System.out.println("**ERROR** Decimal numbers only. No words or whole numbers.");
            }
        }
	 	System.out.println("Is it a Transmission line? (Yes or No): ");
		setType(br.readLine());
		System.out.println("Notes: ");
		bA.setNotes(br.readLine());

	}
}
