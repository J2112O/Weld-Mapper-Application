/*
 *	This package captures all the information for each weld 
 */
package codesAndAttributes;
import java.awt.datatransfer.StringSelection;
import java.io.*;
import java.util.InputMismatchException;
import java.util.StringTokenizer;

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
	private double weldWallThickness;
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
	private String setWallChange(String wallChange) {
		this.wallChange = wallChange;
        return wallChange;
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
		System.out.println("Type of Weld being Collected: ");
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
		// Using the below to capture the wall thickness, if there is a change.
        String result = this.setWallChange(br.readLine());
        if (result.equalsIgnoreCase("yes")) {
            while (true) {
                try {
                    System.out.print("Enter the Wall Thickness Change: ");
                    this.weldWallThickness(Double.parseDouble(br.readLine()));
                    break;
                } catch (InputMismatchException | NumberFormatException ex) {
                    System.out.println(codes.iIDbl);
                }
            }
        }
		System.out.print("Pipe in ditch (Yes or No): ");
		this.setPipeLocation(br.readLine());
		System.out.println("Welder initials: ");
		this.setWelderInitials(br.readLine());
		System.out.print("Notes: ");
		this.setNotes(br.readLine());
		System.out.print("Do you have any pipe to Tally cuts on for this Weld? ");
		response = br.readLine();
		if(response.equalsIgnoreCase("yes")) {
			tallyDataCollect();
		} else {
			System.out.println("Pipe Tally Not Needed.");
			//return;
		}

	}

    private void weldWallThickness(double v) {
    }

    public String getParentPipe() {
		return parentPipe;
	}
	private void setParentPipe(String parentPipe) {
		this.parentPipe = parentPipe;
	}
	public String getPipeJoint() {
		return pipeJoint;
	}
	private void setPipeJoint(String pipeJoint) {
		this.pipeJoint = pipeJoint;
	}
	public int getPipeHeat() {
		return pipeHeat;
	}
	private void setPipeHeat(int pipeHeat) {
		this.pipeHeat = pipeHeat;
	}
	public double getPipeLength() {
		return pipeLength;
	}
	private void setPipeLength(double pipeLength) {
		this.pipeLength = pipeLength;
	}
	public double getCutLength() {
		return cutLength;
	}
	private void setCutLength(double cutLength) {
		this.cutLength = cutLength;
	}
	public String getPipeMaker() {
		return pipeMaker;
	}
	private void setPipeMaker(String pipeMaker) {
		this.pipeMaker = pipeMaker;
	}
	public String getCoatingType() {
		return coatingType;
	}
	private void setCoatingType(String coatingType) {
		this.coatingType = coatingType;
	}
	public String getCoatingThickness() {
		return coatingThickness;
	}
	private void setCoatingThickness(String coatingThickness) {
		this.coatingThickness = coatingThickness;
	}
	public double getWallThickness() {
		return wallThickness;
	}
	private void setWallThickness(double wallThickness) {
		this.wallThickness = wallThickness;
	}
	private String pipePupName;
	public String getResponse() {
		return response;
	}
	public void setResponse(String response) {
		this.response = response;
	}
	
	private void tallyDataCollect() throws IOException {
		System.out.print("Parent Pipe Name or ID: ");
		setParentPipe(br.readLine());
		System.out.print("Parent Pipe Joint Number: ");
		setPipeJoint(br.readLine());
		System.out.print("Parent Pipe's Heat Number: ");
		setPipeHeat(Integer.parseInt(br.readLine()));
		System.out.print("Parent Pipe's Original Length: ");
		setPipeLength(Double.parseDouble(br.readLine()));
		System.out.print("Length of cut made to the Parent Pipe: ");
		setCutLength(Double.parseDouble(br.readLine()));
		System.out.print("Parent Pipe's Manufacturer: ");
		setPipeMaker(br.readLine());
		System.out.print("Parent Pipe's Coating Type: ");
		setCoatingType(br.readLine());
		System.out.print("Parent Pipe's Coating Thickness: ");
		setCoatingThickness(br.readLine());
		System.out.print("Parent Pipe's Wall Thickness: ");
		setWallThickness(Double.parseDouble(br.readLine()));
        System.out.print("New Pup Pipe ID: ");
        setPipePupName(br.readLine());
	}


    public double getWeldWallThickness() {
        return weldWallThickness;
    }

    public void setWeldWallThickness(double weldWallThickness) {
        this.weldWallThickness = weldWallThickness;
    }

    public String getPipePupName() {
        return pipePupName;
    }

    public void setPipePupName(String pipePupName) {
        this.pipePupName = pipePupName;
    }
}
