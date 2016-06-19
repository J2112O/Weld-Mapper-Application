/*
 * This class captures Cad Weld Data 
 */
package codesAndAttributes;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;

public class CadWeld extends BasicAttributes {
	
	BufferedReader br = new BufferedReader(new
			InputStreamReader(System.in));
	// Creating an instance of the Basic Attributes Class
	BasicAttributes bA = new BasicAttributes();
	
	private int wireCount;

	public int getWireCount() {
		return wireCount;
	}
	public void setWireCount(int wireCount) {
		this.wireCount = wireCount;
	}
	
	public void cadWeldDataCollect() throws IOException {
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
				System.out.print("Enter the Wire Count for the Cad Weld: ");
				setWireCount(Integer.parseInt(br.readLine()));
				break;
            } catch (InputMismatchException | NumberFormatException ex) {
                System.out.println("**ERROR** Whole numbers only. No words or decimals.");
            }
        }
		System.out.print("Notes: ");
		bA.setNotes(br.readLine());
	}
}
