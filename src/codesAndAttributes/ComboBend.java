/*
 * This class captures the Combination bend. 
 */
package codesAndAttributes;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ComboBend extends BasicAttributes {
	
	BufferedReader br = new BufferedReader(new
			InputStreamReader(System.in));
	
	// Making a new instance of the BasicAttributes class
	BasicAttributes bA = new BasicAttributes();

	String[] bendDirections = {"SBLT","SBRT","OVERBEND","SAG"};
	
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

	public void comboDataCollect() throws IOException {
		System.out.print("Enter the GPS Point for this Feature: ");
		bA.setGpsShot(Integer.parseInt(br.readLine()));
		System.out.print("Enter the Bend Type: \n");
		bA.displayCertainTypes(bA.bendTypes);
		System.out.print(": ");
		setBendType(br.readLine());
		System.out.print("Direction 1: \n");
		displayBendDirections(bendDirections);
		System.out.println(": ");
		setDirection1(br.readLine());
		System.out.print("Degree 1: ");
		setDegree1(Double.parseDouble(br.readLine()));
		System.out.print("Direction 2: \n");
		displayBendDirections(bendDirections);
		System.out.print(": ");
		setDirection2(br.readLine());
		System.out.print("Degree 2: ");
		setDegree2(Double.parseDouble(br.readLine()));
		System.out.print("Enter the Natural Ground for Cover Shot: ");
		bA.setNgc(Integer.parseInt(br.readLine()));
		System.out.print("Enter the Cover: ");
		bA.setCover(Double.parseDouble(br.readLine()));
		System.out.println("Notes: ");
		bA.setNotes(br.readLine());
	
	}
}
