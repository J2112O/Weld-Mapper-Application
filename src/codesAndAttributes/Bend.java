/*
 *	This class is used for two kinds of Bends. Sags and Over bends both. 
 **/
package codesAndAttributes;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;

public class Bend extends BasicAttributes {
	
	BufferedReader br = new BufferedReader(new
				InputStreamReader(System.in));
		
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
	
	public void bendDataCollect() throws IOException {
		while (true) {
            try {
                System.out.print("Enter the GPS Point for this Feature: ");
                bA.setGpsShot(Integer.parseInt(br.readLine()));
                break;
            } catch (InputMismatchException | NumberFormatException ex) {
                System.out.println("**ERROR** Whole numbers only. No words or decimals.");
            }
        }
		System.out.print("Sag or Overbend? ");
		setKind(br.readLine());
		System.out.print("Enter the Type: \n");
		bA.displayCertainTypes(bA.bendTypes);
		System.out.print(": ");
		setType(br.readLine());
        while (true) {
            try {
                System.out.format("Enter the degree of the Bend: ");
                setDegree(Double.parseDouble(br.readLine()));
                break;
            } catch (InputMismatchException | NumberFormatException ex) {
                System.out.println("**ERROR** Decimal numbers only. No words or whole numbers.");
            }
        }
        while (true) {
            try {
                System.out.print("Enter the Natural Ground shot for cover: ");
                bA.setNgc(Integer.parseInt(br.readLine()));
                break;
            } catch (InputMismatchException | NumberFormatException ex) {
                System.out.println("**ERROR** Whole numbers only. No words or decimals.");
            }
        }
        while (true) {
            try {
                System.out.print("Enter the Cover: ");
                bA.setCover(Double.parseDouble(br.readLine()));
                break;
            } catch (InputMismatchException | NumberFormatException ex) {
                System.out.println("**ERROR** Decimal numbers only. No words or whole numbers.");
            }
        }
		System.out.print("Notes: ");
		bA.notes = br.readLine();
	}
}
