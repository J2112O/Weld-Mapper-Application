
import java.util.Date;
import java.util.Scanner;
import codesAndAttributes.*;

public class WeldMapperMain {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Date date = new Date();
		Bend bend = new Bend();
		
		System.out.print("Enter the location of work ");
		System.out.print("(Tract, Road Crossing or Description of Area): ");
		String workLocation = input.nextLine();
		
		// Printing everything to upper-case with CapitalizeAllWords
        System.out.println(workLocation.toUpperCase());
        
        // Getting the flow line direction of the pipeline to help establish direction
        // with the FlowLine class
        FlowLine gettngDirection = new FlowLine();
        gettngDirection.CaptureDirection();
        System.out.println(date);
        // Listing out the Code choices for data collection with the Codes class
        Codes codeChoices = new Codes();
        codeChoices.displayCodes();
        System.out.print("Enter the Code to collect data for: ");
        String codeChoice = input.nextLine();
        System.out.println(codeChoice);
        bend.bendDataCollect();
        input.close();
	}
}
