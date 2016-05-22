/*
 * This Class captures Rock Shield data 
 */
package codesAndAttributes;
import java.io.*;
public class RockShield extends BasicAttributes {

	BufferedReader br = new BufferedReader(new
			InputStreamReader(System.in));
	// Creating an instance of the Basic Attributes Class
	BasicAttributes bA = new BasicAttributes();
	
	private String position;

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}
	
	public void rockShieldDataCollect() throws IOException {
		System.out.println("Enter the GPS Point for this Code: ");
		bA.setGpsShot(Integer.parseInt(br.readLine()));
		System.out.println("Position (Begin or End): ");
		setPosition(br.readLine());
		System.out.println("Notes: ");
		bA.setNotes(br.readLine());

	}
}
