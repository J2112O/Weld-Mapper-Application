package codesAndAttributes;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ExistingFacility extends BasicAttributes{
	
	BufferedReader br = new BufferedReader(new
			InputStreamReader(System.in));
	BasicAttributes bA = new BasicAttributes();
	
	private String owner;
	private double size;
	private String crossingProp;
	private String depthMethod;
	private String shotLocation;
	private double depthInDecFeet;
	private double clearanceInDecFeet;
		
	// An array of the Depth Methods
	private String[] depthMethodTypes = {"LOCATOR","PROBE","POTHOLED","OTHER(SEE NOTES)"};
	
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public double getSize() {
		return size;
	}
	public void setSize(double size) {
		this.size = size;
	}
	public String getCrossingProp() {
		return crossingProp;
	}
	public void setCrossingProp(String crossingProp) {
		this.crossingProp = crossingProp;
	}
	public String getDepthMethod() {
		return depthMethod;
	}
	public void setDepthMethod(String depthMethod) {
		this.depthMethod = depthMethod;
	}
	public double getDepthInDecFeet() {
		return depthInDecFeet;
	}
	public void setDepthInDecFeet(double depthInDecFeet) {
		this.depthInDecFeet = depthInDecFeet;
	}
	public double getClearanceInDecFeet() {
		return clearanceInDecFeet;
	}
	public void setClearanceInDecFeet(double clearanceInDecFeet) {
		this.clearanceInDecFeet = clearanceInDecFeet;
	}
	public String getShotLocation() {
		return shotLocation;
	}
	public void setShotLocation(String shotLocation) {
		this.shotLocation = shotLocation;
	}
	
	public void existingFacilityDataCollect() throws IOException {
		System.out.print("Enter the GPS Point for this Feature: ");
		bA.setGpsShot(Integer.parseInt(br.readLine()));
		System.out.println("Enter the owner of the Existing Facility: ");
		setOwner(br.readLine());
		System.out.print("Enter the size (in inches) of the Existing Facility: ");
		setSize(Integer.parseInt(br.readLine()));
		System.out.print("Crossing proposed route? (Yes or No) ");
		setCrossingProp(br.readLine());
		System.out.print("Enter the Depth Method: \n");
		displayDepthMethods(depthMethodTypes);
		System.out.print(": ");
		setDepthMethod(br.readLine());
		System.out.print("Shot location on exposed Existing Facility? (Yes or No) ");
		setShotLocation(br.readLine());
		System.out.print("Depth in Decimal Feet: ");
		setDepthInDecFeet(Double.parseDouble(br.readLine()));
		System.out.print("Clearance in Decimal Feet: ");
		setClearanceInDecFeet(Double.parseDouble(br.readLine()));
		System.out.print("Notes: ");
		bA.setNotes(br.readLine());
	
		}
	public void displayDepthMethods(String[] x) {
		for(int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}
	}
	
}
