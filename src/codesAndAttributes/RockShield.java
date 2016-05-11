/*
 * This Class captures Rock Shield data 
 */
package codesAndAttributes;
import java.util.Scanner;
public class RockShield extends BasicAttributes {

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
	
	public void rockShieldDataCollect() {
		System.out.println("Enter the GPS Shot for this Code: ");
		bA.gpsShot = input.nextInt();
		input.nextLine();
		System.out.println("Position (Begin or End): ");
		this.position = input.nextLine();
		System.out.println("Notes: ");
		bA.notes = input.nextLine();
		input.close();
	}
}
