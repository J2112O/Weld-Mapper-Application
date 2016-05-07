/*
 * Listing out the code choices for data collection 
 */
public class Codes {
	private String[] codes = {"Bend(Sag or Overbend)","Bore Wall","Cad","Combo Bend","Existing-Facility",
			"Fence","Loose End","Natural Ground","Overhead Facility","PI(Sidebend)","Pipe-Top",
			"Rockshield","Trenchbreaker","Underground Utility","Valve","Weld"}; 
	
    public void displayCodes() {
    	for(int i = 0; i < codes.length; i++) {
        	System.out.println(codes[i]);
        }
    }
}
