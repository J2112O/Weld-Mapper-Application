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

    Codes codes = new Codes();
	
	private int wireCount;
	private double height;
	private String type;
		
	public int getWireCount() {
		return wireCount;
	}
	private void setWireCount(int wireCount) {
		this.wireCount = wireCount;
	}
	public double getHeight() {
		return height;
	}
	private void setHeight(double height) {
		this.height = height;
	}
	public String getType() {
		return type;
	}
	private void setType(String type) {
		this.type = type;
	}
	
	void overheadFacilityDataCollect() throws IOException {
		while (true) {
            try {
                System.out.print("Enter the GPS Point for this Feature: ");
                this.setGpsShot(Integer.parseInt(br.readLine()));
                break;
            } catch (InputMismatchException | NumberFormatException ex) {
                System.out.println(codes.iIInt);
            }
        }
		while (true) {
            try {
				System.out.println("Enter the wire count for the Overhead Facility: ");
				this.setWireCount(Integer.parseInt(br.readLine()));
                break;
            } catch (InputMismatchException | NumberFormatException ex) {
                System.out.println(codes.iIInt);
            }
        }
        while (true) {
            try {
                System.out.println("Height: ");
                this.setHeight(Double.parseDouble(br.readLine()));
                break;
            } catch (InputMismatchException | NumberFormatException ex) {
                System.out.println(codes.iIDbl);
            }
        }
	 	System.out.println("Is it a Transmission line? (Yes or No): ");
		this.setType(br.readLine());
		System.out.println("Notes: ");
		this.setNotes(br.readLine());

	}
}
