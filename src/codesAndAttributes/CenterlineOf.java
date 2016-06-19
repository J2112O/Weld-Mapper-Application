/*
 * This class captures data for the centerline feature 
 */
package codesAndAttributes;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;

public class CenterlineOf extends BasicAttributes {
	
	BufferedReader br = new BufferedReader(new
				InputStreamReader(System.in));
		
	// Creating a instance of the Basic Attributes Class here.
	BasicAttributes bA = new BasicAttributes();
	
	private String clPosition;

	public String getClPosition() {
		return clPosition;
	}

	public void setClPosition(String clPosition) {
		this.clPosition = clPosition;
	}
	
	public void centerLineDataCollect() throws NumberFormatException, IOException {
		while (true) {
            try {
                System.out.print("Enter the GPS Point for this Feature: ");
                bA.setGpsShot(Integer.parseInt(br.readLine()));
				break;
            } catch (InputMismatchException | NumberFormatException ex) {
                System.out.println("**ERROR** Whole numbers only. No words or decimals.");
            }
        }
		System.out.print("Enter the Centerline Of feature: \n");
		bA.displayCertainTypes(bA.centers);
		System.out.print(": ");
		setClPosition(br.readLine());
		System.out.print("Notes: ");
		bA.setNotes(br.readLine());
	}
}
