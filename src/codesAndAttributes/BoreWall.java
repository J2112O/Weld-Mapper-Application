/*
 * This class captures the Bore Wall 
 */
package codesAndAttributes;
import java.util.Scanner;

public class BoreWall extends BasicAttributes {

	Scanner input = new Scanner(System.in);
	
	// Creating an instance of the Basic Attributes Class
	BasicAttributes bA = new BasicAttributes();
	
	public void boreWallDataCollect() {
		System.out.print("Enter the GPS Shot for this Code: ");
		bA.gpsShot = input.nextInt();
		input.nextLine();
		System.out.print("Notes: ");
		bA.notes = input.nextLine();
		input.close();
	}
}
