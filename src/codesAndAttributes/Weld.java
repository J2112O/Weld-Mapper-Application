/*
 *	This package captures all the information for each weld 
 */
package codesAndAttributes;
import java.io.*;
import java.util.InputMismatchException;

public class Weld extends BasicAttributes {
	
	BufferedReader br = new BufferedReader(new
			InputStreamReader(System.in));
	// Creating a new instance of the class Basic Attributes below.
	BasicAttributes bA = new BasicAttributes();

	Codes codes = new Codes();

	private String weldType;
	private String weldId;
	private String pipeBack;
	private String pipeAhead;
	private String heatAhead;
	private double lengthAhead;
	private String wallChange;
	private String pipeLocation;
	private String welderInitials;
	// These variables are for the pipe tally/cuts method
	private String parentPipe;
	private String pipeJoint;
	private int pipeHeat;
	private double pipeLength;
	private double cutLength;
	private String pipeMaker;
	private String coatingType;
	private String coatingThickness;
	private double wallThickness;
	
	private String response;
	
	public String getWeldType() {
		return weldType;
	}
	private void setWeldType(String weldType) {
		this.weldType = weldType;
	}
	public String getWeldId() {
		return weldId;
	}
	private void setWeldId(String weldId) {
		this.weldId = weldId;
	}
	public String getPipeBack() {
		return pipeBack;
	}
	private void setPipeBack(String pipeBack) {
		this.pipeBack = pipeBack;
	}
	public String getPipeAhead() {
		return pipeAhead;
	}
	private void setPipeAhead(String pipeAhead) {
		this.pipeAhead = pipeAhead;
	}
	public String getHeatAhead() {
		return heatAhead;
	}
	private void setHeatAhead(String heatAhead) {
		this.heatAhead = heatAhead;
	}
	private double getLengthAhead() {
		return lengthAhead;
	}
	private void setLengthAhead(double lengthAhead) {
		this.lengthAhead = lengthAhead;
	}
	private String getWallChange() {
		return wallChange;
	}
	private void setWallChange(String wallChange) {
		this.wallChange = wallChange;
	}
	public String getPipeLocation() {
		return pipeLocation;
	}
	private void setPipeLocation(String pipeLocation) {
		this.pipeLocation = pipeLocation;
	}
	public String getWelderInitials() {
		return welderInitials;
	}
	private void setWelderInitials(String welderInitials) {
		this.welderInitials = welderInitials;
	}

	void weldDataCollect() throws IOException {
		while (true) {
			try {
				System.out.print("Enter the GPS Point for this Feature: ");
				this.setGpsShot(Integer.parseInt(br.readLine()));
				break;
			} catch (InputMismatchException | NumberFormatException ex) {
				System.out.println(codes.iIInt);
			}
		}
		System.out.println("Enter the Weld Type.. ");
        codes.displayCodesAndTypes(codes.weldTypes);
		System.out.print(": ");
		this.setWeldType(br.readLine());
		System.out.print("Enter the Weld ID (X-Ray Number): ");
		this.setWeldId(br.readLine());
		System.out.print("Enter the Pipe (Name or ID) back: ");
		this.setPipeBack(br.readLine());
		System.out.print("Enter the Pipe (Name or ID) ahead: ");
		this.setPipeAhead(br.readLine());
		System.out.print("Enter the Heat ahead: ");
		this.setHeatAhead(br.readLine());
		while (true) {
            try {
                System.out.print("Enter the Length ahead: ");
                this.setLengthAhead(Double.parseDouble(br.readLine()));
                break;
            } catch (InputMismatchException | NumberFormatException ex) {
                System.out.println(codes.iIDbl);
            }
        }
        while (true) {
			try {
                System.out.print("Enter the Natural Ground shot for cover: ");
                this.setNgc(Integer.parseInt(br.readLine()));
				break;
			} catch (InputMismatchException | NumberFormatException ex) {
				System.out.println(codes.iIInt);
			}
		}
        while (true) {
			try {
                System.out.print("Enter the Cover: ");
                this.setCover(Double.parseDouble(br.readLine()));
				break;
			} catch (InputMismatchException | NumberFormatException ex) {
				System.out.println(codes.iIDbl);
			}
		}
		System.out.print("Wall change? (Yes or No) ");
		this.setWallChange(br.readLine());
		System.out.print("Pipe in ditch (Yes or No): ");
		this.setPipeLocation(br.readLine());
		System.out.println("Welder initials: ");
		this.setWelderInitials(br.readLine());
		System.out.print("Notes: ");
		this.setNotes(br.readLine());
		System.out.print("Do you have any pipe to Tally for this Weld? ");
		response = br.readLine();
		if(response.equalsIgnoreCase("yes")) {
			tallyDataCollect();
		} else {
			System.out.println("Pipe Tally Not Needed.");
			//return;
		}

	}
	public String getParentPipe() {
		return parentPipe;
	}
	public void setParentPipe(String parentPipe) {
		this.parentPipe = parentPipe;
	}
	public String getPipeJoint() {
		return pipeJoint;
	}
	public void setPipeJoint(String pipeJoint) {
		this.pipeJoint = pipeJoint;
	}
	public int getPipeHeat() {
		return pipeHeat;
	}
	public void setPipeHeat(int pipeHeat) {
		this.pipeHeat = pipeHeat;
	}
	public double getPipeLength() {
		return pipeLength;
	}
	public void setPipeLength(double pipeLength) {
		this.pipeLength = pipeLength;
	}
	public double getCutLength() {
		return cutLength;
	}
	public void setCutLength(double cutLength) {
		this.cutLength = cutLength;
	}
	public String getPipeMaker() {
		return pipeMaker;
	}
	public void setPipeMaker(String pipeMaker) {
		this.pipeMaker = pipeMaker;
	}
	public String getCoatingType() {
		return coatingType;
	}
	public void setCoatingType(String coatingType) {
		this.coatingType = coatingType;
	}
	public String getCoatingThickness() {
		return coatingThickness;
	}
	public void setCoatingThickness(String coatingThickness) {
		this.coatingThickness = coatingThickness;
	}
	public double getWallThickness() {
		return wallThickness;
	}
	public void setWallThickness(double wallThickness) {
		this.wallThickness = wallThickness;
	}
	public String getResponse() {
		return response;
	}
	public void setResponse(String response) {
		this.response = response;
	}
	
	public void tallyDataCollect() throws IOException {
		System.out.print("Enter the Parent Pipe name or ID: ");
		setParentPipe(br.readLine());
		System.out.print("Enter the Parent Pipe Joint Number: ");
		setPipeJoint(br.readLine());
		System.out.print("Enter the Parent Pipe's Heat Number: ");
		setPipeHeat(Integer.parseInt(br.readLine()));
		System.out.print("Enter the Parent Pipe's Original Length: ");
		setPipeLength(Double.parseDouble(br.readLine()));
		System.out.print("Enter the Length of the cut made to the Parent Pipe: ");
		setCutLength(Double.parseDouble(br.readLine()));
		System.out.print("Enter the Parent Pipe's Manufacturer: ");
		setPipeMaker(br.readLine());
		System.out.print("Enter the Parent Pipe's Coating Type: ");
		setCoatingType(br.readLine());
		System.out.print("Enter the Parent Pipe's Coating Thickness: ");
		setCoatingThickness(br.readLine());
		System.out.print("Enter the Parent Pipe's Wall Thickness: ");
		setWallThickness(Double.parseDouble(br.readLine()));
	}
	
	
}
