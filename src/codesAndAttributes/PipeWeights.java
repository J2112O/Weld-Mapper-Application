/*
 * This class captures data for any Pipe Weights 
 */
package codesAndAttributes;
import java.util.Scanner;

public class PipeWeights extends BasicAttributes {
	
	Scanner input = new Scanner(System.in);
	
	// Creating an instance of the BasicAttributes Class
	BasicAttributes bA = new BasicAttributes();
	
	private String type;
	private String position;
	private int count;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPosition() {
		return position; 
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	public void pipeWeightDataCollect() {
		System.out.print("Enter the GPS Shot for this Code: ");
		bA.gpsShot = input.nextInt();
		input.nextLine();
		System.out.print("Enter the Type of Pipe Weight: \n");
		bA.displayCertainTypes(pipeWeights);
		System.out.print(": ");
		this.type = input.nextLine();
		System.out.print("Enter the Position of the Pipe Weight ");
		System.out.print("(Begin,End or Individual): ");
		this.position = input.nextLine();
		System.out.print("Enter the Pipe Weight Count: ");
		this.count = input.nextInt();
		input.nextLine();
		System.out.print("Notes: ");
		bA.notes = input.nextLine();
		input.close();
	}
	
}
