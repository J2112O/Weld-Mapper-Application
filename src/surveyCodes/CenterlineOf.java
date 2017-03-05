/*
 * This class captures data for the centerline feature 
 */
package surveyCodes;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import com.mongodb.client.MongoCollection;
import org.bson.Document;

public class CenterlineOf extends BasicAttributes {
	
	BufferedReader br = new BufferedReader(new
				InputStreamReader(System.in));
		
	// Creating a instance of the Basic Attributes Class here.
	BasicAttributes bA = new BasicAttributes();

	// Creating an instance of the Codes class
    Codes codes = new Codes();

    private String clPosition;
    private void setClPosition(String s) {
    }
	
	void centerLineDataCollect(MongoCollection<Document> x) throws NumberFormatException, IOException {
		while (true) {
            try {
                System.out.print("Enter the GPS Point for this Feature: ");
                this.setGpsShot(Integer.parseInt(br.readLine()));
				break;
            } catch (InputMismatchException | NumberFormatException ex) {
                System.out.println(codes.iIInt);
            }
        }
		System.out.print("Enter the Centerline Of feature: \n");
        codes.displayCodesAndTypes(codes.centers);
		System.out.print(": ");
		this.setClPosition(br.readLine().toUpperCase());
		System.out.print("Notes: ");
		this.setNotes(br.readLine().toUpperCase());

		Document document = new Document()
				.append("GPS Point", gpsShot)
				.append("Centerline of Feature", clPosition)
				.append("Notes", notes);

		x.insertOne(document);
	}
}
