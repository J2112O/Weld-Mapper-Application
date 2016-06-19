/*
 * This class captures Trench Breakers
 */
package codesAndAttributes;
import java.io.*;
import java.util.InputMismatchException;

public class TrenchBreaker extends BasicAttributes {

	BufferedReader br = new BufferedReader(new
			InputStreamReader(System.in));
	// Creating an instance of the Basic Attributes Class here
	BasicAttributes bA = new BasicAttributes();
	
	private String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public void trenchBreakerDataCollect() throws IOException {
		while (true) {
            try {
                System.out.print("Enter the GPS Point for this Feature: ");
                bA.setGpsShot(Integer.parseInt(br.readLine()));
                break;
            } catch (InputMismatchException | NumberFormatException ex) {
                System.out.println("**ERROR** Whole numbers only. No words or decimals.");
            }
        }
		System.out.println("Enter the Type: \n");
		bA.displayCertainTypes(trenchbrkrTypes);
		System.out.println(": ");
		setType(br.readLine());
		System.out.println("Notes: ");
		bA.setNotes(br.readLine());

	}
}
