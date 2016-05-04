/*
 * Listing out the code choices for data collection 
 */
public class Codes {
	private String[] codes = {"Weld","Bend(Sag or Overbend)","PI(Sidebend)","Bore Wall","Cad",
			"Combo Bend","Existing-Facility","Loose End","Natural Ground",
			"Overhead Facility","Trenchbreaker","Rockshield","Fence","Pipe-Top",
	"Underground Utility"}; 
	
    public void displayCodes() {
    	for(int i = 0; i < codes.length; i++) {
        	System.out.println(codes[i]);
        }
    }
}
