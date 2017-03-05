/*
 * This class captures the Bore Wall 
 */
package codesAndAttributes;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import com.mongodb.client.MongoCollection;
import org.bson.Document;

import javax.print.Doc;

public class BoreWall extends BasicAttributes {
	BufferedReader br = new BufferedReader(new
				InputStreamReader(System.in));
		
	// Creating an instance of the Basic Attributes Class
	BasicAttributes bA = new BasicAttributes();
	
	public void boreWallDataCollect(MongoCollection<Document> x) throws IOException {
 		System.out.print("Enter the GPS Point for this Feature: ");
		this.setGpsShot(Integer.parseInt(br.readLine()));
		System.out.print("Notes: ");
		this.setNotes(br.readLine().toUpperCase());

		Document document = new Document()
                .append("GPS Point", gpsShot)
                .append("Notes", notes);

        x.insertOne(document);
	}
}
