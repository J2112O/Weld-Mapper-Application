/*
 * This class gets the flow-line of the work to be used in help
 * establishing direction for "ahead and back" information. 
 */
import java.util.Scanner;
public class FlowLine {
    Scanner input = new Scanner(System.in);
        
    public void CaptureDirection(){
        System.out.print("Enter the flowline, in a from direction to direction ");
        System.out.print("manner (ie \"North to South\"): ");
        String direction = input.nextLine();
        System.out.println(direction.toUpperCase());

    }
 }
