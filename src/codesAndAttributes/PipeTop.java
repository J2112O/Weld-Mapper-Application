/*
 * This class essentially captures a top of pipe shot  
 */
package codesAndAttributes;
import java.util.Scanner;
public class PipeTop extends BasicAttributes {

	Scanner input = new Scanner(System.in);
	//Creating an instance of the Basic Attributes Class here
	BasicAttributes bA = new BasicAttributes();
	
	public void pipeTopDataCollect() {
		System.out.println("Enter the GPS Shot for the Code: ");
		bA.gpsShot = input.nextInt();
		input.nextLine();
		System.out.println("Notes: ");
		bA.notes = input.nextLine();
		input.close();
	}
}
