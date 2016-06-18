/*
 * This class captures a small amount of Valve data. 
 */
package codesAndAttributes;
import java.io.*;

public class Valve extends BasicAttributes {
	
	BufferedReader br = new BufferedReader(new
			InputStreamReader(System.in));
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
	
	public void valveDataCollect() throws IOException {
		System.out.print("Enter the GPS Point for this Feature: ");
		bA.setGpsShot(Integer.parseInt(br.readLine()));
		System.out.print("Enter the position of this locate: ");
		displayValvePositions(valvePositions);
		setPosition(br.readLine());
		System.out.print("Enter the Valve ID: ");
		setValveId(br.readLine());
		System.out.println("Notes: ");
		bA.setNotes(br.readLine());
		
	}
}
