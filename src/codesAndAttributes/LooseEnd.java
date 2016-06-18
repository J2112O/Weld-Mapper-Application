/*
 * Captures the loose end. 
 */
package codesAndAttributes;
import java.io.*;

public class LooseEnd extends BasicAttributes {

	BufferedReader br = new BufferedReader(new
			InputStreamReader(System.in));
	// Creating an instance of the Basic Attributes Class
	BasicAttributes bA = new BasicAttributes();
	
	private String position;
	
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public void looseEndDataCollect() throws IOException {
		System.out.println("Enter the GPS Point for this Feature: ");
		bA.setGpsShot(Integer.parseInt(br.readLine()));
		System.out.println("On skids (Yes or No): ");
		setPosition(br.readLine());
		System.out.println("Notes: ");
		bA.setNotes(br.readLine());
	
	}
}
