/*
 * This class captures Trench Breakers
 */
package codesAndAttributes;
import java.util.Scanner;
public class TrenchBreaker extends BasicAttributes {

	Scanner input = new Scanner(System.in);
	// Creating an instance of the Basic Attributes Class here
	BasicAttributes bA = new BasicAttributes();
	
	private String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public void trenchBreakerDataCollect() {
		System.out.println("Enter the GPS Shot for this Code: ");
		bA.setGpsShot(input.nextInt());
		input.nextLine();
		System.out.println("Enter the Type: \n");
		bA.displayCertainTypes(trenchbrkrTypes);
		System.out.println(": ");
		setType(input.nextLine());
		System.out.println("Notes: ");
		bA.setNotes(input.nextLine());
		input.close();
	}
	
}
