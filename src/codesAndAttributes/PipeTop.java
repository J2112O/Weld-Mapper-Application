/*
 * This class essentially captures a top of pipe shot  
 */
package codesAndAttributes;
import java.io.*;
import java.util.InputMismatchException;

public class PipeTop extends BasicAttributes {

	BufferedReader br = new BufferedReader(new
			InputStreamReader(System.in));
	//Creating an instance of the Basic Attributes Class here
	BasicAttributes bA = new BasicAttributes();
	
	public void pipeTopDataCollect() throws NumberFormatException, IOException {
		while (true) {
            try {
                System.out.print("Enter the GPS Point for this Feature: ");
                bA.setGpsShot(Integer.parseInt(br.readLine()));
                break;
            } catch (InputMismatchException | NumberFormatException ex) {
                System.out.println("**ERROR** Whole numbers only. No words or decimals.");
            }
        }
		System.out.println("Notes: ");
		bA.setNotes(br.readLine());
	}
}
