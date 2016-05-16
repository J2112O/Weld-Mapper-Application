/*
 * Captures the Natural Ground Shot 
 */
package codesAndAttributes;
import java.io.*;

public class NaturalGround extends BasicAttributes {

	BufferedReader br = new BufferedReader(new
			InputStreamReader(System.in));
	// Creating an instance of the Basic Attributes class
	BasicAttributes bA = new BasicAttributes();
	private int naturalGround;
	
	public int getNaturalGround() {
		return naturalGround;
	}
	public void setNaturalGround(int naturalGround) {
		this.naturalGround = naturalGround;
	}
	
	public void naturalGroundDataCollect() throws IOException {
		System.out.println("Enter the GPS Point for the Shot: ");
		setNaturalGround(Integer.parseInt(br.readLine()));
		System.out.print("Notes: ");
		bA.setNotes(br.readLine());
		
	}
}
