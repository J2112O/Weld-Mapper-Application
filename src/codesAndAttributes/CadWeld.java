/*
 * This class captures Cad Weld Data 
 */

package codesAndAttributes;
import java.util.Scanner;

public class CadWeld extends BasicAttributes {

	Scanner input = new Scanner(System.in);
	
	// Creating an instance of the Basic Attributes Class
	BasicAttributes bA = new BasicAttributes();
	
	private int wireCount;

	public int getWireCount() {
		return wireCount;
	}
	public void setWireCount(int wireCount) {
		this.wireCount = wireCount;
	}
	
	public void cadWeldDataCollect() {
		System.out.print("Enter the GPS Shot for this Code: ");
		bA.setGpsShot(input.nextInt());
		input.nextLine();
		System.out.print("Enter the Wire Count for the Cad Weld: ");
		setWireCount(input.nextInt());
		input.nextLine();
		System.out.print("Notes: ");
		bA.setNotes(input.nextLine());
		input.close();
	}
}
