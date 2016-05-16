/*
 * This class captures the Bore Wall 
 */
package codesAndAttributes;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BoreWall extends BasicAttributes {
	BufferedReader br = new BufferedReader(new
				InputStreamReader(System.in));
		
	// Creating an instance of the Basic Attributes Class
	BasicAttributes bA = new BasicAttributes();
	
	public void boreWallDataCollect() throws IOException {
		System.out.print("Enter the GPS Shot for this Code: ");
		bA.setGpsShot(Integer.parseInt(br.readLine()));
		System.out.print("Notes: ");
		bA.setNotes(br.readLine());
		
	}
}
