/*
 * This class captures the top of feature 
 */
package codesAndAttributes;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;

public class TopOf extends BasicAttributes{

	BufferedReader br = new BufferedReader(new
			InputStreamReader(System.in));
		
	// Creating a instance of the Basic Attributes Class here.
	BasicAttributes bA = new BasicAttributes();

	Codes codes = new Codes();

	private String topPosition;
	public String getTopPosition() {
		return topPosition;
	}
	private void setTopPosition(String topPosition) {
		this.topPosition = topPosition;
	}
	
	void topOfDataCollect() throws IOException {
		while (true) {
            try {
                System.out.print("Enter the GPS Point for this Feature: ");
                this.setGpsShot(Integer.parseInt(br.readLine()));
                break;
            } catch (InputMismatchException | NumberFormatException ex) {
                System.out.println(codes.iIInt);
            }
        }
		System.out.print("Enter the Top Of feature: \n");
        codes.displayCodesAndTypes(codes.tops);
		System.out.print(": ");
		this.setTopPosition(br.readLine());
		System.out.print("Notes: ");
		this.setNotes(br.readLine());
	}
}
