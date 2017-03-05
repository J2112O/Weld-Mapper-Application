/*
 * This class captures the Combination bend. 
 */
package codesAndAttributes;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import com.mongodb.client.MongoCollection;
import org.bson.Document;

public class ComboBend extends BasicAttributes {
	
	BufferedReader br = new BufferedReader(new
			InputStreamReader(System.in));
	
	// Making a new instance of the BasicAttributes class
	BasicAttributes bA = new BasicAttributes();

	// Creating a instance of the Codes Class here.
	private Codes codes = new Codes();


    private String bendType;
    private String direction1;
    private Double degree1;
    private String direction2;
    private Double degree2;

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

	void comboDataCollect(MongoCollection<Document> x) throws IOException {
		while (true) {
            try {
                System.out.print("Enter the GPS Point for this Feature: ");
                this.setGpsShot(Integer.parseInt(br.readLine()));
                break;
            } catch (InputMismatchException | NumberFormatException ex) {
                System.out.println(codes.iIInt);
            }
        }
		System.out.print("Type of Bend: \n");
        codes.displayCodesAndTypes(codes.bendTypes);
		System.out.print(": ");
		setBendType(br.readLine());
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
                System.out.print("Natural Ground for Cover Shot: ");
                this.setExistGradeShot(Integer.parseInt(br.readLine()));
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
		System.out.println("Notes: ");
		this.setNotes(br.readLine());

        Document document = new Document()
                .append("GPS Point", gpsShot)
                .append("Bend Type", bendType)
                .append("Direction 1", direction1)
                .append("Degree 1", degree1)
                .append("Direction 2", direction2)
                .append("Degree 2", degree2)
                .append("NGC", existGradeShot)
                .append("Cover", cover)
                .append("Notes", notes);
	}
}
