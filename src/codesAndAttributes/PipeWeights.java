/*
 * This class captures data for any Pipe Weights 
 */
package codesAndAttributes;
import java.io.*;
import java.util.InputMismatchException;

public class PipeWeights extends BasicAttributes {
	
	BufferedReader br = new BufferedReader(new
			InputStreamReader(System.in)); 
	
	// Creating an instance of the Codes Class
    Codes codes = new Codes();
    // Creating an instance of the Basic Attributes class
    BasicAttributes bA = new BasicAttributes();

	private String type;
	private String position;
	private int count;
	
	public String getType() {
		return type;
	}
	private void setType(String type) {
		this.type = type;
	}
	public String getPosition() {
		return position; 
	}
	private void setPosition(String position) {
		this.position = position;
	}
	public int getCount() {
		return count;
	}
	private void setCount(int count) {
		this.count = count;
	}
	
	void pipeWeightDataCollect() throws NumberFormatException, IOException {
		while (true) {
            try {
				System.out.print("Enter the GPS Point for this Feature: ");
				this.setGpsShot(Integer.parseInt(br.readLine()));
                break;
            } catch (InputMismatchException | NumberFormatException ex) {
                System.out.println(codes.iIInt);
            }
        }
		System.out.print("Enter the Type of Pipe Weight: \n");
        codes.displayCodesAndTypes(codes.pwTypes);
		System.out.print(": ");
		this.setType(br.readLine());
		System.out.print("Enter the Position of the Pipe Weight: \n");
        codes.displayCodesAndTypes(codes.pwPositions);
        System.out.print(": ");
		this.setPosition(br.readLine());
        while (true) {
            try {
                System.out.print("Enter the Pipe Weight Count: ");
                this.setCount(Integer.parseInt(br.readLine()));
                break;
            } catch (InputMismatchException | NumberFormatException ex) {
                System.out.println(codes.iIInt);
            }
        }
		System.out.print("Notes: ");
		this.setNotes(br.readLine());

	}
}
