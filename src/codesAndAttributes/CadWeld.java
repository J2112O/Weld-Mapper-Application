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

	Codes codes = new Codes();

    private void setWireCount(int wireCount) {
        int wireCount1 = wireCount;
	}
	
	void cadWeldDataCollect() throws IOException {
		while (true) {
            try {
                System.out.print("Enter the GPS Point for this Feature: ");
                this.setGpsShot(Integer.parseInt(br.readLine()));
                break;
            } catch (InputMismatchException | NumberFormatException ex) {
                System.out.println(codes.iIInt);
            }
        }
		while (true) {
            try {
				System.out.print("Enter the Wire Count for the Cad Weld: ");
				this.setWireCount(Integer.parseInt(br.readLine()));
				break;
            } catch (InputMismatchException | NumberFormatException ex) {
                System.out.println(codes.iIInt);
            }
        }
		System.out.print("Notes: ");
		this.setNotes(br.readLine());
	}
}
