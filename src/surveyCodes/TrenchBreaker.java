/*
 * This class captures Trench Breakers
 */
package surveyCodes;
import java.io.*;
import java.util.InputMismatchException;

public class TrenchBreaker extends BasicAttributes {

	BufferedReader br = new BufferedReader(new
			InputStreamReader(System.in));
	// Creating an instance of the Basic Attributes Class here
	BasicAttributes bA = new BasicAttributes();

	Codes codes = new Codes();
	private String type;

	public String getType() {
		return type;
	}

	private void setType(String type) {
		this.type = type;
	}
	
	void trenchBreakerDataCollect() throws IOException {
		while (true) {
            try {
                System.out.print("Enter the GPS Point for this Feature: ");
                this.setGpsShot(Integer.parseInt(br.readLine()));
                break;
            } catch (InputMismatchException | NumberFormatException ex) {
                System.out.println(codes.iIInt);
            }
        }
		System.out.println("Enter the Type: \n");
        codes.displayCodesAndTypes(codes.tbTypes);
		System.out.println(": ");
		this.setType(br.readLine());
		System.out.println("Notes: ");
		this.setNotes(br.readLine());

	}
}
