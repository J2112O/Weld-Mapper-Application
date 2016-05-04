/*
 *	This class is used for two kinds of Bends. Sags and Overbends both. 
 **/
package codesAndAttributes;
import java.util.Scanner;
//import java.util.Set;

public class Bend {
	
	Scanner input = new Scanner(System.in);
	

	private int gpsShot;
	private String kind;	
	private String type;
	private double degree;
	private double cover;
	private int ngc;
	
	public int getGpsShot() {
		return gpsShot;
	}
	public void setGpsShot(int gpsShot) {
		this.gpsShot = gpsShot;
	}
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
	public double getCover() {
		return cover;
	}
	public void setCover(double cover) {
		this.cover = cover;
	}
	public int getNgc() {
		return ngc;
	}
	public void setNgc(int ngc) {
		this.ngc = ngc;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	
	public void bendDataCollect() {
		
		System.out.print("Enter the GPS Point for this Code: ");
		this.gpsShot = input.nextInt();
		System.out.print("Sag or Overbend? ");
		this.kind = input.nextLine();
		input.nextLine();
		System.out.print("Enter the Type(Field, Factory, or Forged): ");
		this.type = input.nextLine();
		System.out.format("Enter the degree: ");
		this.degree = input.nextDouble();
		input.nextLine();
		System.out.print("Enter the Cover: ");
		this.cover= input.nextDouble();
		input.nextLine();
		System.out.print("Enter the Natural Ground shot for cover: ");
		this.ngc = input.nextInt();
		input.nextLine();
	}
	
}
