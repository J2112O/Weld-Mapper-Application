/*
 * This class captures existing Fence crossings. 
 */
package codesAndAttributes;
import java.io.*;
import java.util.InputMismatchException;

public class Fence extends BasicAttributes {
	
	BufferedReader br = new BufferedReader(new
			InputStreamReader(System.in));
	
	// Creating and instance of BasicAttributes Class
	BasicAttributes bA = new BasicAttributes();

    Codes codes = new Codes();

	private String type;
	private String shotLocation;
	private double height;
	private int strandCount;
		
	public String getType() {
		return type;
	}
	private void setType(String type) {
		this.type = type;
	}
	public String getShotLocation() {
		return shotLocation;
	}
	private void setShotLocation(String shotLocation) {
		this.shotLocation = shotLocation;
	}
	public double getHeight() {
		return height;
	}
	private void setHeight(double height) {
		this.height = height;
	}
	public int getStrandCount() {
		return strandCount;
	}
	private void setStrandCount(int strandCount) {
		this.strandCount = strandCount;
	}

	void fenceDataCollect() throws NumberFormatException, IOException {
		while (true) {
            try {
                System.out.print("Enter the GPS Point for this Feature: ");
                this.bA.setGpsShot(Integer.parseInt(br.readLine()));
                break;
            } catch (InputMismatchException | NumberFormatException ex) {
                System.out.println(codes.iIInt);
            }
        }
		System.out.print("Enter the Type of Fence.. \n");
		codes.displayCodesAndTypes(codes.fenceTypes);
		System.out.print(": ");
		this.setType(br.readLine());
		System.out.print("Shot location: \n");
		codes.displayCodesAndTypes(codes.fncShotLocations);
		this.setShotLocation(br.readLine());
		while (true) {
            try {
				System.out.print("Enter the height of the fence: ");
				this.setHeight(Double.parseDouble(br.readLine()));
                break;
            } catch (InputMismatchException | NumberFormatException ex) {
                System.out.println(codes.iIDbl);
            }
        }
        while (true) {
            try {
                System.out.print("Enter the strand count: ");
                this.setStrandCount(Integer.parseInt(br.readLine()));
                break;
            } catch (InputMismatchException | NumberFormatException ex) {
                System.out.println(codes.iIInt);
            }
        }
		System.out.print("Notes: ");
		this.setNotes(br.readLine());
				
	}
}
