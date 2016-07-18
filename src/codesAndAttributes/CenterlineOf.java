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

	// Creating an instance of the Codes class
    Codes codes = new Codes();

    private void setClPosition() {
    }
	
	void centerLineDataCollect() throws NumberFormatException, IOException {
		while (true) {
            try {
                System.out.print("Enter the GPS Point for this Feature: ");
                this.setGpsShot(Integer.parseInt(br.readLine()));
				break;
            } catch (InputMismatchException | NumberFormatException ex) {
                System.out.println(codes.iIInt);
            }
        }
		System.out.print("Enter the Centerline Of feature: \n");
        codes.displayCodesAndTypes(codes.centers);
		System.out.print(": ");
		this.setClPosition();
		System.out.print("Notes: ");
		this.setNotes(br.readLine());
	}
}
