/*
 * This class captures data for any Pipe Weights 
 */
package codesAndAttributes;
import java.io.*;

public class PipeWeights extends BasicAttributes {
	
	BufferedReader br = new BufferedReader(new
			InputStreamReader(System.in)); 
	
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
	
	public void pipeWeightDataCollect() throws NumberFormatException, IOException {
		System.out.print("Enter the GPS Shot for this Code: ");
		bA.setGpsShot(Integer.parseInt(br.readLine()));
		System.out.print("Enter the Type of Pipe Weight: \n");
		bA.displayCertainTypes(pipeWeights);
		System.out.print(": ");
		setType(br.readLine());
		System.out.print("Enter the Position of the Pipe Weight ");
		System.out.print("(Begin,End or Individual): ");
		setPosition(br.readLine());
		System.out.print("Enter the Pipe Weight Count: ");
		setCount(Integer.parseInt(br.readLine()));
		System.out.print("Notes: ");
		bA.setNotes(br.readLine());

	}
}
