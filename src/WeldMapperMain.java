
import java.util.Date;
import java.io.*;
import codesAndAttributes.*;

public class WeldMapperMain {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new
				InputStreamReader(System.in));

		Date date = new Date();
		ChoosingCodes cc = new ChoosingCodes();
		
		System.out.print("Enter the location of work ");
		System.out.print("(Tract, Road Crossing or Description of Area): ");
		String workLocation = br.readLine();
		
		// Printing everything to upper-case with CapitalizeAllWords
        System.out.println(workLocation.toUpperCase());
        
        // Getting the flow line direction of the pipeline to help establish direction
        // with the FlowLine class
        FlowLine gettngDirection = new FlowLine();
        gettngDirection.CaptureDirection();
        System.out.println(date);
        
        System.out.println("Do you wish to collect Data? ");
        String proceed = br.readLine();
        //proceed = proceed.toUpperCase();
        while (proceed.equalsIgnoreCase("yes")) {
        cc.dataCollectingChoices();
        System.out.println("Do you wish to collect Data? ");
        proceed = br.readLine();
        } 
        System.out.println("Thanks for using Weld Mapper.");
	}
}
