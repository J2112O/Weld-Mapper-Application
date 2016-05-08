/*
 *	This class is used for two kinds of Bends. Sags and Overbends both. 
 **/
package codesAndAttributes;
import java.util.Scanner;

public class Bend extends BasicAttributes {
	
	Scanner input = new Scanner(System.in);
	
	// Creating a instance of the Basic Attributes Class here.
	BasicAttributes bA = new BasicAttributes();
	
	private String type;
	private String kind;	
	private double degree;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getDegree() {
		return degree;
	}
	public void setDegree(double degree) {
		this.degree = degree;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	
	public void bendDataCollect() {
		
		System.out.print("Enter the GPS Point for this Code: ");
		bA.gpsShot = input.nextInt();
		input.nextLine();
		System.out.print("Sag or Overbend? ");
		this.kind = input.nextLine();
		System.out.print("Enter the Type: \n");
		bA.displayCertainTypes(bA.bendTypes);
		System.out.print(": ");
		this.type = input.nextLine();
		System.out.format("Enter the degree: ");
		this.degree = input.nextDouble();
		input.nextLine();
		System.out.print("Enter the Cover: ");
		bA.cover= input.nextDouble();
		input.nextLine();
		System.out.print("Enter the Natural Ground shot for cover: ");
		bA.ngc = input.nextInt();
		input.nextLine();
		System.out.print("Notes: ");
		bA.notes = input.nextLine();
		
		input.close();
	}
	
}
