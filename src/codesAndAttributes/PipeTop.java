/*
 * This class essentially captures a top of pipe shot  
 */
package codesAndAttributes;
import java.io.*;
public class PipeTop extends BasicAttributes {

	BufferedReader br = new BufferedReader(new
			InputStreamReader(System.in));
	//Creating an instance of the Basic Attributes Class here
	BasicAttributes bA = new BasicAttributes();
	
	public void pipeTopDataCollect() throws NumberFormatException, IOException {
		System.out.println("Enter the GPS Point for this Code: ");
		bA.setGpsShot(Integer.parseInt(br.readLine()));
		System.out.println("Notes: ");
		bA.setNotes(br.readLine());
	}
}
