/*
 * Captures the loose end. 
 */
package codesAndAttributes;
import java.util.Scanner;

public class LooseEnd extends BasicAttributes {

	Scanner input = new Scanner(System.in);
	// Creating an instance of the Basic Attributes Class
	BasicAttributes bA = new BasicAttributes();
	
	private String position;
	
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public void looseEndDataCollect() {
		System.out.println("Enter the GPS Shot for this Code: ");
		bA.setGpsShot(input.nextInt());
		input.nextLine();
		System.out.println("On skids (Yes or No): ");
		setPosition(input.nextLine());
		System.out.println("Notes: ");
		bA.setNotes(input.nextLine());
		input.close();
	}
}
