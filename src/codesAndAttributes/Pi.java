/*
 * This class deals with PI's (Side-bends) 
 */
package codesAndAttributes;
import java.io.*;

public class Pi extends BasicAttributes {

	BufferedReader br = new BufferedReader(new
			InputStreamReader(System.in));
	
	// Creating an instance of the BasicAttributes Class
	BasicAttributes bA = new BasicAttributes();
	
	private String direction;
	private String bendType;
	private double degree;
	
	public String getDirection() {
		return direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}
	public double getDegree() {
		return degree;
	}
	public void setDegree(double degree) {
		this.degree = degree;
	}
	public String getBendType() {
		return bendType;
	}
	public void setBendType(String bendType) {
		this.bendType = bendType;
	}
	
	public void piDataCollect() throws NumberFormatException, IOException {
		System.out.print("Enter the GPS Point for this Code: ");
		bA.setGpsShot(Integer.parseInt(br.readLine()));
		System.out.print("Enter the Bend Type: \n");
		bA.displayCertainTypes(bendTypes);
		System.out.print(": ");
		setBendType(br.readLine());
		System.out.print("Enter the Direction, SBLT or SBRT: ");
		setDirection(br.readLine());
		System.out.print("Enter the Degree: ");
		setDegree(Double.parseDouble(br.readLine()));
		System.out.print("Enter the Natural Ground for Cover Shot: ");
		bA.setNgc(Integer.parseInt(br.readLine()));
		System.out.print("Enter the Cover: ");
		bA.setCover(Double.parseDouble(br.readLine()));
		System.out.print("Notes: ");
		bA.setNotes(br.readLine());
	}

}
