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
	
	// An Array of the fence types
	private String[] fenceTypes = {"BARBWIRE","CHAINLINK","CHAINLINK W/BARB","CHICKEN WIRE",
			"ELECTRIC","HOT WIRE","METAL","PIPE","PLASTIC","ROCK","STEEL CABLE","WOOD"};
	
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
	public void fenceDataCollect() throws NumberFormatException, IOException {
		while (true) {
            try {
                System.out.print("Enter the GPS Point for this Feature: ");
                bA.setGpsShot(Integer.parseInt(br.readLine()));
                break;
            } catch (InputMismatchException | NumberFormatException ex) {
                System.out.println("**ERROR** Whole numbers only. No words or decimals.");
            }
        }
		System.out.print("Enter the Type of Fence.. \n");
		displayFenceTypes(fenceTypes);
		System.out.print(": ");
		setType(br.readLine());
		System.out.print("Shot location (Corner, Post, In Line, In Line(Meandering)): ");
		setShotLocation(br.readLine());
		while (true) {
            try {
				System.out.print("Enter the height of the fence: ");
				setHeight(Double.parseDouble(br.readLine()));
                break;
            } catch (InputMismatchException | NumberFormatException ex) {
                System.out.println("**ERROR** Decimal numbers only. No words or whole numbers.");
            }
        }
        while (true) {
            try {
                System.out.print("Enter the strand count: ");
                setStrandCount(Integer.parseInt(br.readLine()));
                break;
            } catch (InputMismatchException | NumberFormatException ex) {
                System.out.println("**ERROR** Whole numbers only. No words or decimals.");
            }
        }
		System.out.print("Notes: ");
		bA.setNotes(br.readLine());
				
	}
}
