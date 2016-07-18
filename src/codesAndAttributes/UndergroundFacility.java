/*
 * This class captures all Underground Facility data 
 */
package codesAndAttributes;
import java.io.*;
import java.util.InputMismatchException;

public class UndergroundFacility extends BasicAttributes {

	BufferedReader br = new BufferedReader(new
			InputStreamReader(System.in));
	//Creating an instance of the Basic Attributes Class
	BasicAttributes bA = new BasicAttributes();

	Codes codes = new Codes();

	private String shotLocation;
	private String utilityType;
	private double depthFromGround;
	private double clearanceFromPipe;
	private String pipelinePosition;
	
	public String getShotLocation() {
		return shotLocation;
	}
	private void setShotLocation(String shotLocation) {
		this.shotLocation = shotLocation;
	}
	public String getUtilityType() {
		return utilityType;
	}
	private void setUtilityType(String utilityType) {
		this.utilityType = utilityType;
	}
	public double getDepthFromGround() {
		return depthFromGround;
	}
	private void setDepthFromGround(double depthFromGround) {
		this.depthFromGround = depthFromGround;
	}
	public double getClearanceFromPipe() {
		return clearanceFromPipe;
	}
	private void setClearanceFromPipe(double clearanceFromPipe) {
		this.clearanceFromPipe = clearanceFromPipe;
	}
	public String getPipelinePosition() {
		return pipelinePosition;
	}
	private void setPipelinePosition(String pipelinePosition) {
		this.pipelinePosition = pipelinePosition;
	}
	
	void undergroundFacilityDataCollect() throws IOException {
		while (true) {
            try {
                System.out.print("Enter the GPS Point for this Feature: ");
                this.setGpsShot(Integer.parseInt(br.readLine()));
                break;
            } catch (InputMismatchException | NumberFormatException ex) {
                System.out.println(codes.iIInt);
            }
        }
		System.out.println("Enter the Shot Location: \n");
        codes.displayCodesAndTypes(codes.shotLocations);
		System.out.print(": ");
		this.setShotLocation(br.readLine());
		System.out.println("Enter the Underground Facility Type: \n");
        codes.displayCodesAndTypes(codes.utilityTypes);
		System.out.print(": ");
		this.setUtilityType(br.readLine());
		while (true) {
            try {
				System.out.println("Depth from Ground: ");
				this.setDepthFromGround(Double.parseDouble(br.readLine()));
                break;
            } catch (InputMismatchException | NumberFormatException ex) {
                System.out.println(codes.iIDbl);
            }
        }
		while (true) {
            try {
                System.out.println("Clearance from Pipeline: ");
                this.setClearanceFromPipe(Double.parseDouble(br.readLine()));
                break;
            } catch (InputMismatchException | NumberFormatException ex) {
                System.out.println(codes.iIDbl);
            }
        }
		System.out.println("As-built Pipeline: ");
        codes.displayCodesAndTypes(codes.shotPositions);
        System.out.print(": ");
        this.setPipelinePosition(br.readLine());
		System.out.println("Notes: ");
		this.setNotes(br.readLine());
	}
}
