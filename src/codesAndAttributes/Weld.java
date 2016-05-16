/*
 *	This package captures all the information for each weld 
 */
package codesAndAttributes;
import java.io.*;

public class Weld extends BasicAttributes {
	
	BufferedReader br = new BufferedReader(new
			InputStreamReader(System.in));
	// Creating a new instance of the class Basic Attributes below.
	BasicAttributes bA = new BasicAttributes();

	private String weldType;
	private String weldId;
	private String pipeBack;
	private String pipeAhead;
	private String heatAhead;
	private double lengthAhead;
	private String wallChange;
	private String pipeLocation;
	private String welderInitials;

	public String getWeldType() {
		return weldType;
	}
	public void setWeldType(String weldType) {
		this.weldType = weldType;
	}
	public String getWeldId() {
		return weldId;
	}
	public void setWeldId(String weldId) {
		this.weldId = weldId;
	}
	public String getPipeBack() {
		return pipeBack;
	}
	public void setPipeBack(String pipeBack) {
		this.pipeBack = pipeBack;
	}
	public String getPipeAhead() {
		return pipeAhead;
	}
	public void setPipeAhead(String pipeAhead) {
		this.pipeAhead = pipeAhead;
	}
	public String getHeatAhead() {
		return heatAhead;
	}
	public void setHeatAhead(String heatAhead) {
		this.heatAhead = heatAhead;
	}
	public double getLengthAhead() {
		return lengthAhead;
	}
	public void setLengthAhead(double lengthAhead) {
		this.lengthAhead = lengthAhead;
	}
	public String getWallChange() {
		return wallChange;
	}
	public void setWallChange(String wallChange) {
		this.wallChange = wallChange;
	}
	public String getPipeLocation() {
		return pipeLocation;
	}
	public void setPipeLocation(String pipeLocation) {
		this.pipeLocation = pipeLocation;
	}
	public String getWelderInitials() {
		return welderInitials;
	}
	public void setWelderInitials(String welderInitials) {
		this.welderInitials = welderInitials;
	}
	public void weldDataCollect() throws IOException {
		System.out.print("Enter the GPS Point for this Code: ");
		bA.setGpsShot(Integer.parseInt(br.readLine()));
		System.out.println("Enter the Weld Type.. ");
		displayCertainTypes(bA.weldTypes);
		System.out.print(": ");
		setWeldType(br.readLine());
		System.out.print("Enter the Weld ID (X-Ray Number): ");
		setWeldId(br.readLine());
		System.out.print("Enter the Pipe (Name or ID) back: ");
		setPipeBack(br.readLine());
		System.out.print("Enter the Pipe (Name or ID) ahead: ");
		setPipeAhead(br.readLine());
		System.out.print("Enter the Heat ahead: ");
		setHeatAhead(br.readLine());
		System.out.print("Enter the Length ahead: ");
		setLengthAhead(Double.parseDouble(br.readLine()));
		System.out.print("Enter the Natural Ground shot for cover: ");
		bA.setNgc(Integer.parseInt(br.readLine()));
		System.out.print("Enter the Cover: ");
		bA.setCover(Double.parseDouble(br.readLine()));
		System.out.print("Wall change? (Yes or No) ");
		setWallChange(br.readLine());
		System.out.print("Pipe in ditch (Yes or No): ");
		setPipeLocation(br.readLine());
		System.out.println("Welder initialis: ");
		setWelderInitials(br.readLine());
		System.out.print("Notes: ");
		bA.setNotes(br.readLine());

	}
}
