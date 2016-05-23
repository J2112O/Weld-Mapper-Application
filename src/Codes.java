/*
 * Listing out the code choices for data collection 
 */
public class Codes {
	private String[] codes = {"BEND(SAG OR OVERBEND)","BORE WALL","CAD WELD","CENTERLINE OF","COMBO BEND","EXISTING-FACILITY",
			"FENCE","LOOSE END","NATURAL GROUND","OVERHEAD FACILITY","PI(SIDEBEND)","PIPE-TOP",
			"PW(PIPE WEIGHTS)","ROCKSHIELD","TOP OF","TRENCHBREAKER","UNDERGROUND UTILITY","VALVE","WELD"}; 
	
    public void displayCodes() {
    	for(int i = 0; i < codes.length; i++) {
        	System.out.println(codes[i]);
        }
    }
}
