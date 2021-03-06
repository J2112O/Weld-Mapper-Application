
import java.util.Date;
import java.io.*;
import surveyCodes.*;


public class WeldMapperMain {

	public static void main(String[] args) throws IOException {
	    // Calling the below to capture user in put from the keyboard.
		BufferedReader br = new BufferedReader(new
				InputStreamReader(System.in));

		Date date = new Date();
        // Creating an instance of this class to display all survey codes
		ChoosingCodes cc = new ChoosingCodes();
        // Creating an instance of the WorkAndTaskSetup class
        WorkAndTaskSetup wk = new WorkAndTaskSetup();

        // Calling the collectTaskSetup Method
        wk.collectTaskSetup();

        System.out.println("Do you wish to collect Data? ");
        String proceed = br.readLine();
        while (proceed.equalsIgnoreCase("yes")) {
        cc.dataCollectingChoices();
        System.out.println("Do you wish to collect Data? ");
        proceed = br.readLine();
        } 
        System.out.println("Thanks for using Weld Mapper.");

	}
}
