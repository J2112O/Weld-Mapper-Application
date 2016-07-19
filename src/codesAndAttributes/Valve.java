/*
 * This class captures a small amount of Valve data. 
 */
package codesAndAttributes;
import java.io.*;
import java.util.InputMismatchException;

public class Valve extends BasicAttributes {
	
	BufferedReader br = new BufferedReader(new
			InputStreamReader(System.in));
	String[] valvePositions = {"Begin","Center","End","Other(See Notes)"};
	
	// Creating an instance of BasicAttributes class
	BasicAttributes bA = new BasicAttributes();

    Codes codes = new Codes();

	private String position;
	private String valveId;
	

	public String getPosition() {
		return position;
	}
	private void setPosition(String position) {
		this.position = position;
	}
	public String getValveId() {
		return valveId;
	}
	private void setValveId(String valveId) {
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

	/*public void setGpsShot(int gpsShot) {
		this.gpsShot = gpsShot;
	}*/
	
	void valveDataCollect() throws IOException {
		while (true) {
            try {
                System.out.print("Enter the GPS Point for this Feature: ");
                this.setGpsShot(Integer.parseInt(br.readLine()));
                break;
            } catch (InputMismatchException | NumberFormatException ex) {
                System.out.println(codes.iIInt);
            }
        }
		System.out.print("Enter the Position of this Locate: ");
        codes.displayCodesAndTypes(codes.valvePositions);
		this.setPosition(br.readLine());
		System.out.print("Enter the Valve ID: ");
		this.setValveId(br.readLine());
		System.out.println("Notes: ");
		this.setNotes(br.readLine());
	}
}
