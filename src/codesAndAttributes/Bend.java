/*
 *	This class is used for all bends.Included are Sags, Overbends and PI's.
 **/
package codesAndAttributes;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;

public class Bend extends BasicAttributes {

    // Calling to capture user input
	BufferedReader br = new BufferedReader(new
				InputStreamReader(System.in));
		
	// Creating a instance of the Basic Attributes Class here.
	BasicAttributes bA = new BasicAttributes();

    // Creating a instance of the Codes Class here.
    private Codes codes = new Codes();

    private void setBendType() {
    }

    private void setBendDirection() {
    }

    private void setDegree(Double degree) {
        Double degree1 = degree;
    }

    // Collecting all data for the Bend.
	public void bendDataCollect() throws IOException {
		while (true) {
            try {
                System.out.print("Enter the GPS Point for this Feature: ");
                this.setGpsShot(Integer.parseInt(br.readLine()));
                break;
            } catch (InputMismatchException | NumberFormatException ex) {
                //System.out.println("Whole numbers only. No words or decimals.");
                System.out.println(codes.iIInt);
            }
        }
		System.out.print("Type of Bend: ");
        codes.displayCodesAndTypes(codes.bendTypes);
		this.setBendType();
		System.out.print("Bend Direction: \n");
        codes.displayCodesAndTypes(codes.bendDirections);
		System.out.print(": ");
		this.setBendDirection();
        while (true) {
            try {
                System.out.format("Degree of the Bend: ");
                this.setDegree(Double.parseDouble(br.readLine()));
                break;
            } catch (InputMismatchException | NumberFormatException ex) {
                System.out.println(codes.iIDbl);
            }
        }
        while (true) {
            try {
                System.out.print("Natural Ground shot for cover: ");
                this.setNgc(Integer.parseInt(br.readLine()));
                break;
            } catch (InputMismatchException | NumberFormatException ex) {
                System.out.println(codes.iIInt);
            }
        }
        while (true) {
            try {
                System.out.print("Cover: ");
                this.setCover(Double.parseDouble(br.readLine()));
                break;
            } catch (InputMismatchException | NumberFormatException ex) {
                System.out.println(codes.iIDbl);
            }
        }
		System.out.print("Notes: ");
		this.setNotes(br.readLine());
	}
}
