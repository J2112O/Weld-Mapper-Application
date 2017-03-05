/*
 * Captures the loose end. 
 */
package surveyCodes;
import java.io.*;
import java.util.InputMismatchException;

public class LooseEnd extends BasicAttributes {

	BufferedReader br = new BufferedReader(new
			InputStreamReader(System.in));
	// Creating an instance of the Basic Attributes Class
	BasicAttributes bA = new BasicAttributes();

	Codes codes = new Codes();

	private String position;
	
	public String getPosition() {
		return position;
	}
	private void setPosition(String position) {
		this.position = position;
	}
	void looseEndDataCollect() throws IOException {
		while (true) {
            try {
                System.out.print("Enter the GPS Point for this Feature: ");
                this.bA.setGpsShot(Integer.parseInt(br.readLine()));
                break;
            } catch (InputMismatchException | NumberFormatException ex) {
                System.out.println(codes.iIInt);
            }
        }
		System.out.println("On skids (Yes or No): ");
		this.setPosition(br.readLine());
		System.out.println("Notes: ");
		this.bA.setNotes(br.readLine());
	}
}
