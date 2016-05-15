/*
 * This class captures the Combination bend. 
 */
package codesAndAttributes;
import java.util.Scanner;

public class ComboBend extends BasicAttributes {
	
	Scanner input = new Scanner(System.in);
	
	// Making a new instance of the BasicAttributes class
	BasicAttributes bA = new BasicAttributes();

	String[] bendDirections = {"SBLT","SBRT","Overbend","Sag"};
	
	private String bendType;
	private String direction1;
	private double degree1;
	private String direction2;
	private double degree2;
	
	public void displayBendDirections(String[] x) {
		for(int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		} 
	} 
	public String getBendType() {
		return bendType;
	}
	public void setBendType(String bendType) {
		this.bendType = bendType;
	}
	public String getDirection1() {
		return direction1;
	}
	public void setDirection1(String direction1) {
		this.direction1 = direction1;
	}
	public double getDegree1() {
		return degree1;
	}
	public void setDegree1(double degree1) {
		this.degree1 = degree1;
	}
	public String getDirection2() {
		return direction2;
	}
	public void setDirection2(String direction2) {
		this.direction2 = direction2;
	}
	public double getDegree2() {
		return degree2;
	}
	public void setDegree2(double degree2) {
		this.degree2 = degree2;
	}

	public void comboDataCollect() {
		System.out.print("Enter the GPS Point for this Code: ");
		bA.setGpsShot(input.nextInt());
		input.nextLine();
		System.out.print("Enter the Bend Type: \n");
		bA.displayCertainTypes(bA.bendTypes);
		System.out.print(": ");
		setBendType(input.nextLine());
		System.out.print("Direction 1: \n");
		displayBendDirections(bendDirections);
		System.out.println(": ");
		setDirection1(input.nextLine());
		System.out.print("Degree 1: ");
		setDegree1(input.nextDouble());
		input.nextLine();
		System.out.print("Direction 2: \n");
		displayBendDirections(bendDirections);
		System.out.print(": ");
		setDirection2(input.nextLine());
		System.out.print("Degree 2: ");
		setDegree2(input.nextDouble());
		input.nextLine();
		System.out.print("Enter the Natural Ground for Cover Shot: ");
		bA.setNgc(input.nextInt());
		input.nextLine();
		System.out.print("Enter the Cover: ");
		bA.setCover(input.nextDouble());
		input.nextLine();
		System.out.println("Notes: ");
		bA.setNotes(input.nextLine());
		//input.nextLine();
		input.close();
	}
}
