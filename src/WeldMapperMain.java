
import java.util.Date;
import java.io.*;
import codesAndAttributes.*;

public class WeldMapperMain {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new
				InputStreamReader(System.in));

		Date date = new Date();
		ChoosingCodes cc = new ChoosingCodes();


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
