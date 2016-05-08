/*
 * This class captures a small amount of Valve data. 
 */
package codesAndAttributes;
import java.util.Scanner;

public class Valve {
	
	Scanner input = new Scanner(System.in);
	String[] valvePositions = {"Begin","Center","End","Other(See Notes)"};
	
	private int gpsShot;
	private String position;
	private String valveId;
	private String notes;

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
		this.gpsShot = input.nextInt();
		input.nextLine();
		System.out.print("Enter the position of this locate: ");
		displayValvePositions(valvePositions);
		this.position = input.nextLine();
		System.out.print("Enter the Valve ID: ");
		this.valveId = input.nextLine();
		System.out.println("Enter any notes: ");
		this.notes = input.nextLine();
		input.close();
				
	}
}
