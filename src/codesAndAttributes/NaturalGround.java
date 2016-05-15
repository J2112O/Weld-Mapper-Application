/*
 * Captures the Natural Ground Shot 
 */
package codesAndAttributes;
import java.util.Scanner;

public class NaturalGround extends BasicAttributes {

	Scanner input = new Scanner(System.in);
	// Creating an instance of the Basic Attributes class
	BasicAttributes bA = new BasicAttributes();
	private int naturalGround;
	
	public int getNaturalGround() {
		return naturalGround;
	}
	public void setNaturalGround(int naturalGround) {
		this.naturalGround = naturalGround;
	}
	
	public void naturalGroundDataCollect() {
		System.out.println("Enter the GPS Point for the Shot: ");
		setNaturalGround(input.nextInt());
		input.nextLine();
		System.out.print("Notes: ");
		bA.setGpsShot(input.nextInt());
		input.nextLine();
		input.close();
	}
}
