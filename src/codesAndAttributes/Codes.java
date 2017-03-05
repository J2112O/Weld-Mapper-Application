/*
 * Listing out the code choices for data collection. This class also has various
 * types of things for attributes, many are shared by more than one survey code.
 */
package codesAndAttributes;

public class Codes {
	// An Array of Survey Data Code Choices for collecting Survey Data
	protected String[] surveyCodes = {"BEND","BORE WALL","CAD WELD","CENTER-LINE","COMBO BEND","EXISTING-FACILITY",
			"FENCE","LOOSE END","NATURAL GROUND","OVERHEAD-FACILITY","PI","PIPE-TOP",
			"PIPE WEIGHTS","ROCKSHIELD","TOP OF","TRENCHBREAKER","UNDERGROUND UTILITY","VALVE","WELD"};

	// An Array of depth methods
	protected String[] depthMethods = {"locator", "probed", "pot-holed", "other"};
	// An Array of bend types that applies to all bends
	protected String[] bendTypes = {"field", "forged", "hot", "other"};
	// An Array of bend Directions
	protected String[] bendDirections = {"sag", "overbend", "sblt", "sbrt"};

	// An Array of Rock shield positions
	protected String[] rsPositions = {"begin", "middle", "end"};

	// An Array of weld Types
	protected String[] weldTypes = {"mainline", "tie-in", "valve site", "fabrication", "existing", "transition",
	"repair", "factory", "other"};

	// An Array of pipe weight positions (using the three present choices from rock shield postitons too
	protected String[] pwPositions = {"individual","begin", "middle", "end"};

	// An Array of Trench breaker types
	protected String[] tbTypes = {"cement", "foam", "sandbag", "other"};

	// An Array of Pipe Weights
	protected String[] pwTypes = {tbTypes[2], "concrete set-on", "concrete bolt-on", "anchor", "other"};

	// An Array of shot locations for utilities
	protected String[] shotLocations = {"ground not exposed", "on exposed utility", "other"};

	// An Array of Utility types
	protected String[] utilityTypes = {"fiber optic", "water", "electric", "telephone", "tv cable", "unknown", "other"};

	// An Array of shot positions in relation to the existing pipeline for foreign line crossings
	protected String[] shotPositions = {"above", "below", "other"};

    // An Array of tops for top of shots
    protected String[] tops = {"ditch", "natural drain", "creek", "slope", "other"};

    // An Array of centers for center of shots
    protected String[] centers = {tops[0], tops[1], tops[2]};

    // An Array of fence types
    protected String[] fenceTypes = {"barbwire", "chain-link", "chicken wire", "chain-link w/barb", "electric",
    "hot wire", "metal", "pipe", "plastic", "rock", "steel cable", "wood"};

    // An Array of fence shot locations
    protected String[] fncShotLocations = {"corner", "in-line", "post", "meandering"};

    // An Array of valve positions
    protected String[] valvePositions = {"begin", "center", "end", "other"};

    // A string to display warning for whole numbers only accepted.
    protected String iIInt = "**Invalid Input**. Whole Numbers Only.";

    // A string to display warning for decimal numbers only accepted.
    protected String iIDbl = "**Invalid Input**. Decimal Numbers Only.";







    void displayCodesAndTypes(String[] x) {
		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i].toUpperCase());
		}
    }
}
