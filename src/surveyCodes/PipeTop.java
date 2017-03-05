/*
 * This class essentially captures a top of pipe shot  
 */
package surveyCodes;
import java.io.*;
import java.util.InputMismatchException;

public class PipeTop extends BasicAttributes {

	BufferedReader br = new BufferedReader(new
			InputStreamReader(System.in));
	//Creating an instance of the Basic Attributes Class here
	BasicAttributes bA = new BasicAttributes();

	Codes codes = new Codes();
	void pipeTopDataCollect() throws NumberFormatException, IOException {
		while (true) {
            try {
                System.out.print("Enter the GPS Point for this Feature: ");
                this.setGpsShot(Integer.parseInt(br.readLine()));
                break;
            } catch (InputMismatchException | NumberFormatException ex) {
                System.out.println(codes.iIInt);
            }
        }
		System.out.println("Notes: ");
		this.setNotes(br.readLine());
	}
}
