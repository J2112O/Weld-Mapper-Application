/*
 * This class deals with PI's (Side-bends) 
 */
package codesAndAttributes;
import java.util.Scanner;

public class Pi extends BasicAttributes {

	Scanner input = new Scanner(System.in);
	
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
	
	public void piDataCollect() {
		System.out.print("Enter the GPS Shot for this Code: ");
		bA.gpsShot = input.nextInt();
		input.nextLine();
		System.out.print("Enter the Bend Type: \n");
		bA.displayCertainTypes(bendTypes);
		System.out.print(": ");
		this.bendType = input.nextLine();
		System.out.print("Enter the Direction, SBLT or SBRT: ");
		this.direction = input.nextLine();
		System.out.print("Enter the Degree: ");
		this.degree = input.nextDouble();
		input.nextLine();
		System.out.print("Enter the Natural Ground for Cover Shot: ");
		bA.ngc = input.nextInt();
		input.nextLine();
		System.out.print("Enter the Cover: ");
		bA.cover = input.nextDouble();
		input.nextLine();
		System.out.print("Notes: ");
		bA.notes = input.nextLine();
		input.close();
	}

}
