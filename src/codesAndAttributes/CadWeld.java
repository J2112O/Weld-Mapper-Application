/*
 * This class captures Cad Weld Data 
 */
package codesAndAttributes;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CadWeld extends BasicAttributes {
	
	BufferedReader br = new BufferedReader(new
			InputStreamReader(System.in));
	// Creating an instance of the Basic Attributes Class
	BasicAttributes bA = new BasicAttributes();
	
	private int wireCount;

	public int getWireCount() {
		return wireCount;
	}
	public void setWireCount(int wireCount) {
		this.wireCount = wireCount;
	}
	
	public void cadWeldDataCollect() throws IOException {
		System.out.print("Enter the GPS Shot for this Code: ");
		bA.setGpsShot(Integer.parseInt(br.readLine()));
		System.out.print("Enter the Wire Count for the Cad Weld: ");
		setWireCount(Integer.parseInt(br.readLine()));
		System.out.print("Notes: ");
		bA.setNotes(br.readLine());
	}
}
