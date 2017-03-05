/*
 * Captures the Natural Ground Shot 
 */
package surveyCodes;
import java.io.*;

public class NaturalGround extends BasicAttributes {

	BufferedReader br = new BufferedReader(new
			InputStreamReader(System.in));
	Codes codes = new Codes();

	// Creating an instance of the Basic Attributes class
	BasicAttributes bA = new BasicAttributes();
	private int naturalGround;
	
	public int getNaturalGround() {
		return naturalGround;
	}
	private void setNaturalGround(int naturalGround) {
		this.naturalGround = naturalGround;
	}
	
	void naturalGroundDataCollect() throws IOException {
 		System.out.println("Enter the GPS Point for this Feature: ");
		this.setNaturalGround(Integer.parseInt(br.readLine()));
		System.out.print("Notes: ");
		this.setNotes(br.readLine());
	}
}
