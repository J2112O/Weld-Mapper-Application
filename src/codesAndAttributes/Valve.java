/*
 * This class captures a small amount of Valve data. 
 */
package codesAndAttributes;
import java.util.Scanner;

public class Valve extends BasicAttributes {
	
	Scanner input = new Scanner(System.in);
	String[] valvePositions = {"Begin","Center","End","Other(See Notes)"};
	
	// Creating an instance of BasicAttributes class
	BasicAttributes bA = new BasicAttributes();
	
	private String position;
	private String valveId;
	
	public void displayValvePositions(String[] x) {
		for(int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}
	}	
		
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getValveId() {
		return valveId;
	}
	public void setValveId(String valveId) {
		this.valveId = valveId;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public int getGpsShot() {
		return gpsShot;
	}

	public void setGpsShot(int gpsShot) {
		this.gpsShot = gpsShot;
	}
	
	public void valveDataCollect() {
		System.out.print("Enter the GPS Point for this Code: ");
		bA.setGpsShot(input.nextInt());
		input.nextLine();
		System.out.print("Enter the position of this locate: ");
		displayValvePositions(valvePositions);
		setPosition(input.nextLine());
		System.out.print("Enter the Valve ID: ");
		setValveId(input.nextLine());
		System.out.println("Notes: ");
		bA.setNotes(input.nextLine());
		input.close();
				
	}
}
