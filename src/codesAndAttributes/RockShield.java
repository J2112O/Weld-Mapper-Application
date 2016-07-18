/*
 * This Class captures Rock Shield data 
 */
package codesAndAttributes;
import java.io.*;
import java.util.InputMismatchException;

public class RockShield extends BasicAttributes {

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
	
	void rockShieldDataCollect() throws IOException {
		while (true) {
            try {
                System.out.print("Enter the GPS Point for this Feature: ");
                this.setGpsShot(Integer.parseInt(br.readLine()));
                break;
            } catch (InputMismatchException | NumberFormatException ex) {
                System.out.println(codes.iIInt);
            }
        }
		System.out.println("Position: \n");
        codes.displayCodesAndTypes(codes.rsPositions);
        System.out.println(": ");
		this.setPosition(br.readLine());
		System.out.println("Notes: ");
		this.setNotes(br.readLine());
	}
}
