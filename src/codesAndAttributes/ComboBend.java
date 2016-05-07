/*
 * This class captures the Combination bend. 
 */
package codesAndAttributes;
import java.util.Scanner;

public class ComboBend {
	
	Scanner input = new Scanner(System.in);
	
	String[] bendTypes = {"Field","Forged","Hot"};
	String[] bendDirections = {"SBLT","SBRT","Overbend","Sag"};
	
	private int gpsShot;
	private String bendType;
	private String direction1;
	private double degree1;
	private String direction2;
	private double degree2;
	private double cover;
	private String notes;
	
	public void displayBendTypes(String[] x) {
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
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public int getGpsShot() {
		return gpsShot;
	}
	public void setGpsShot(int gpsShot) {
		this.gpsShot = gpsShot;
	}
	public double getCover() {
		return cover;
	}
	public void setCover(double cover) {
		this.cover = cover;
	}
	public void comboDataCollect() {
		System.out.print("Enter the GPS Point for this Code: ");
		this.gpsShot = input.nextInt();
		input.nextLine();
		System.out.print("Enter the Bend Type: \n");
		displayBendTypes(bendTypes);
		System.out.print(": ");
		this.bendType = input.nextLine();
		System.out.print("Direction 1: \n");
		displayBendTypes(bendDirections);
		System.out.println(": ");
		this.direction1 = input.nextLine();
		System.out.print("Degree 1: ");
		this.degree1 = input.nextDouble();
		input.nextLine();
		System.out.print("Direction 2: \n");
		displayBendTypes(bendDirections);
		System.out.print(": ");
		this.direction2 = input.nextLine();
		System.out.print("Degree 2: ");
		this.degree2 = input.nextDouble();
		input.nextLine();
		System.out.print("Enter the Cover: ");
		this.cover = input.nextDouble();
		input.nextLine();
		System.out.println("Notes: ");
		input.nextLine();
		input.close();
	}
}
