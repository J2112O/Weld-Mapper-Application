/*
 * Listing out the code choices for data collection 
 */
public class Codes {
	// An Array of Survey Data Code Choices for collecting Survey Data
	private String[] surveyCodes = {"BEND","BORE WALL","CAD WELD","CENTER-LINE","COMBO BEND","EXISTING-FACILITY",
			"FENCE","LOOSE END","NATURAL GROUND","OVERHEAD-FACILITY","PI(SIDEBEND)","PIPE-TOP",
			"PIPE WEIGHTS","ROCKSHIELD","TOP OF","TRENCHBREAKER","UNDERGROUND UTILITY","VALVE","WELD"};

	// An Array of depth methods
	private String[] depthMethods = {"locator", "probed", "pot-holed", "other"};
	// An Array of bend types that applies to all bends
	private String[] bendTypes = {"field", "forged", "hot", "other"};
	// An Array of bend Directions
	private String[] bendDirections = {"sag", "overbend", "sblt", "sbrt"};
	// An Array of Rock shield positions
	private String[] rsPositions = {"begin", "middle", "end"};
	// An Array of weld Types
	private String[] weldTypes = {"mainline", "tie-in", "valve site", "fabrication", "existing", "transition",
	"repair", "factory", "other"};
	// An Array of pipe weight positions (using the three present choices from rock shield postitons too
	private String[] pwPositions = {"individual" + rsPositions};
	// An Array of Trench breaker types
	private String[] tbTypes = {"cement", "foam", "sandbag", "other"};
	// An Array of Pipe Weights
	private String[] pwTypes = {tbTypes[2], "concrete set-on", "concrete bolt-on", "anchor", "other"};
	// An Array of shot locations for utilities
	private String[] shotLocations = {"ground not exposed", "on exposed utility", "other"};
	// An Array of Utility types
	private String[] utilityTypes = {"fiber optic", "water", "electric", "telephone", "tv cable", "unknown", "other"};
	// An Array of shot positions in relation to the existing pipeline for foreign line crossings
	private String[] shotPositions = {"above", "below", "other"};








    public void displayCodes(String[] x) {
    	for(int i = 0; i < x.length; i++) {
        	System.out.println(x[i].toUpperCase());
        }
    }
}
