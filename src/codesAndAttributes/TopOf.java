/*
 * This class captures the top of feature 
 */
package codesAndAttributes;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;

public class TopOf {

	BufferedReader br = new BufferedReader(new
			InputStreamReader(System.in));
		
	// Creating a instance of the Basic Attributes Class here.
	BasicAttributes bA = new BasicAttributes();

	private String topPosition;

	public String getTopPosition() {
		return topPosition;
	}

	public void setTopPosition(String topPosition) {
		this.topPosition = topPosition;
	}
	
	public void topOfDataCollect() throws IOException {
		while (true) {
            try {
                System.out.print("Enter the GPS Point for this Feature: ");
                bA.setGpsShot(Integer.parseInt(br.readLine()));
                break;
            } catch (InputMismatchException | NumberFormatException ex) {
                System.out.println("**ERROR** Whole numbers only. No words or decimals.");
            }
        }
		System.out.print("Enter the Top Of feature: \n");
		bA.displayCertainTypes(bA.tops);
		System.out.print(": ");
		setTopPosition(br.readLine());
		System.out.print("Notes: ");
		bA.setNotes(br.readLine());
	}
}
