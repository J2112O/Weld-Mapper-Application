package codesAndAttributes;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;

public class ExistingFacility extends BasicAttributes{
	
	BufferedReader br = new BufferedReader(new
			InputStreamReader(System.in));
	BasicAttributes bA = new BasicAttributes();

	Codes codes = new Codes();

	private String owner;
	private double size;
	private String crossingProp;
	private String depthMethod;
	private String shotLocation;
	private double depthInDecFeet;
	private double clearanceInDecFeet;
		

	public String getOwner() {
		return owner;
	}
	private void setOwner(String owner) {
		this.owner = owner;
	}
	public double getSize() {
		return size;
	}
	private void setSize(double size) {
		this.size = size;
	}
	public String getCrossingProp() {
		return crossingProp;
	}
	private void setCrossingProp(String crossingProp) {
		this.crossingProp = crossingProp;
	}
	public String getDepthMethod() {
		return depthMethod;
	}
	private void setDepthMethod(String depthMethod) {
		this.depthMethod = depthMethod;
	}
	public double getDepthInDecFeet() {
		return depthInDecFeet;
	}
	private void setDepthInDecFeet(double depthInDecFeet) {
		this.depthInDecFeet = depthInDecFeet;
	}
	public double getClearanceInDecFeet() {
		return clearanceInDecFeet;
	}
	private void setClearanceInDecFeet(double clearanceInDecFeet) {
		this.clearanceInDecFeet = clearanceInDecFeet;
	}
	public String getShotLocation() {
		return shotLocation;
	}
	private void setShotLocation(String shotLocation) {
		this.shotLocation = shotLocation;
	}
	
	void existingFacilityDataCollect() throws IOException {
		while (true) {
            try {
                System.out.print("Enter the GPS Point for this Feature: ");
                this.setGpsShot(Integer.parseInt(br.readLine()));
                break;
            } catch (InputMismatchException | NumberFormatException ex) {
                System.out.println(codes.iIInt);
            }
        }
		System.out.println("Enter the owner of the Existing Facility: ");
		this.setOwner(br.readLine());
        while (true) {
            try {
                System.out.print("Enter the size (in inches) of the Existing Facility: ");
                this.setSize(Integer.parseInt(br.readLine()));
                break;
            } catch (InputMismatchException | NumberFormatException ex) {
                System.out.println(codes.iIInt);
            }
        }
		System.out.print("Crossing proposed route? (Yes or No) ");
		this.setCrossingProp(br.readLine());
		System.out.print("Depth Method: \n");
        codes.displayCodesAndTypes(codes.depthMethods);
		System.out.print(": ");
		this.setDepthMethod(br.readLine());
		System.out.print("Shot location on exposed Existing Facility? (Yes or No) ");
		this.setShotLocation(br.readLine());
        while (true) {
            try {
                System.out.print("Depth in Decimal Feet: ");
                this.setDepthInDecFeet(Double.parseDouble(br.readLine()));
                break;
            } catch (InputMismatchException | NumberFormatException ex) {
                System.out.println(codes.iIDbl);
            }
        }
		while (true) {
            try {
                System.out.print("Clearance in Decimal Feet: ");
                this.setClearanceInDecFeet(Double.parseDouble(br.readLine()));
                break;
            } catch (InputMismatchException | NumberFormatException ex) {
                System.out.println(codes.iIDbl);
            }
        }
		System.out.print("Notes: ");
		this.bA.setNotes(br.readLine());
		}

}
