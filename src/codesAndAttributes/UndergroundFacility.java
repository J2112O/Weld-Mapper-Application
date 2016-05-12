/*
 * This class captures all Underground Facility data 
 */
package codesAndAttributes;
import java.util.Scanner;
public class UndergroundFacility extends BasicAttributes {

	Scanner input = new Scanner(System.in);
	//Creating an instance of the Basic Attributes Class
	BasicAttributes bA = new BasicAttributes();
		
	private String shotLocation;
	private String utilityType;
	private double depthFromGround;
	private double clearanceFromPipe;
	private String pipelinePosition;
	public String getShotLocation() {
		return shotLocation;
	}
	public void setShotLocation(String shotLocation) {
		this.shotLocation = shotLocation;
	}
	public String getUtilityType() {
		return utilityType;
	}
	public void setUtilityType(String utilityType) {
		this.utilityType = utilityType;
	}
	public double getDepthFromGround() {
		return depthFromGround;
	}
	public void setDepthFromGround(double depthFromGround) {
		this.depthFromGround = depthFromGround;
	}
	public double getClearanceFromPipe() {
		return clearanceFromPipe;
	}
	public void setClearanceFromPipe(double clearanceFromPipe) {
		this.clearanceFromPipe = clearanceFromPipe;
	}
	public String getPipelinePosition() {
		return pipelinePosition;
	}
	public void setPipelinePosition(String pipelinePosition) {
		this.pipelinePosition = pipelinePosition;
	}
	
	public void undergroundFacilityDataCollect() {
		System.out.println("Enter the GPS Shot for this Code: ");
		bA.setGpsShot(input.nextInt());
		input.nextLine();
		System.out.println("Enter the Shot Location: \n");
		bA.displayCertainTypes(locations);
		System.out.print(": ");
		setShotLocation(input.nextLine());
		System.out.println("Enter the Underground Facility Type: \n");
		bA.displayCertainTypes(utiliyType);
		System.out.print(": ");
		setUtilityType(input.nextLine());
	}
}