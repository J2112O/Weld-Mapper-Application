/*
 * This class captures the Combination bend. 
 */
package codesAndAttributes;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;

public class ComboBend extends BasicAttributes {
	
	BufferedReader br = new BufferedReader(new
			InputStreamReader(System.in));
	
	// Making a new instance of the BasicAttributes class
	BasicAttributes bA = new BasicAttributes();

	// Creating a instance of the Codes Class here.
	private Codes codes = new Codes();


    private void setBendType() {
    }

    private void setDirection1() {
    }

    private void setDegree1() {
    }

    private void setDirection2() {
    }

    private void setDegree2() {
    }

	void comboDataCollect() throws IOException {
		while (true) {
            try {
                System.out.print("Enter the GPS Point for this Feature: ");
                this.setGpsShot(Integer.parseInt(br.readLine()));
                break;
            } catch (InputMismatchException | NumberFormatException ex) {
                System.out.println(codes.iIInt);
            }
        }
		System.out.print("Enter the Bend Type: \n");
        codes.displayCodesAndTypes(codes.bendTypes);
		System.out.print(": ");
		setBendType();
		System.out.print("Direction 1: \n");
        codes.displayCodesAndTypes(codes.bendDirections);
		System.out.println(": ");
		this.setDirection1();
		while (true) {
            try {
				System.out.print("Degree 1: ");
				this.setDegree1();
                break;
            } catch (InputMismatchException | NumberFormatException ex) {
                System.out.println(codes.iIDbl);
            }
        }
		System.out.print("Direction 2: \n");
        codes.displayCodesAndTypes(codes.bendDirections);
		System.out.print(": ");
		this.setDirection2();
		while (true) {
            try {
				System.out.print("Degree 2: ");
				this.setDegree2();
                break;
            } catch (InputMismatchException | NumberFormatException ex) {
                System.out.println(codes.iIDbl);
            }
        }
		while (true) {
            try {
                System.out.print("Enter the Natural Ground for Cover Shot: ");
                this.setNgc(Integer.parseInt(br.readLine()));
                break;
            } catch (InputMismatchException | NumberFormatException ex) {
                System.out.println(codes.iIInt);
            }
        }
        while (true) {
            try {
                System.out.print("Enter the Cover: ");
                this.setCover(Double.parseDouble(br.readLine()));
                break;
            } catch (InputMismatchException | NumberFormatException ex) {
                System.out.println(codes.iIDbl);
            }
        }
		System.out.println("Notes: ");
		this.setNotes(br.readLine());
	
	}
}
