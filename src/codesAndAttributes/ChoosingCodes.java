/* 
 * Using this class to capture what code the user wants to collect data for 
 */
package codesAndAttributes;
import java.util.Scanner;

public class ChoosingCodes {
	
	// Creating an instance of Scanner
	Scanner scan = new Scanner(System.in);
	// Using this string to capture user input for the code to collect data for
	private String codeChoice;
	// An array of the codes to choose from to collect data for
	private String[] codes = {"BEND(SAG OR OVERBEND)","BORE WALL","CAD WELD","COMBO BEND","EXISTING FACILITY",
			"FENCE","LOOSE END","NATURAL GROUND","OVERHEAD FACILITY","PI(SIDEBEND)","PIPE TOP",
			"PW(PIPE WEIGHTS)","ROCKSHIELD","TRENCHBREAKER","UNDERGROUND FACILITY","VALVE","WELD"};
	// Creating instances of all the codes available to collect data for
	Bend bend = new Bend();
	BoreWall bW = new BoreWall();
	CadWeld cad = new CadWeld();
	ComboBend cmbo = new ComboBend();
	ExistingFacility eF = new ExistingFacility();
	Fence fnc = new Fence();
	LooseEnd le = new LooseEnd();
	NaturalGround ng = new NaturalGround();
	OverheadFacility ohp = new OverheadFacility();
	Pi pi = new Pi();
	PipeTop pTop = new PipeTop();
	PipeWeights pw = new PipeWeights();
	RockShield rShield = new RockShield();
	TrenchBreaker tb = new TrenchBreaker();
	UndergroundFacility uF = new UndergroundFacility();
	Valve vlv = new Valve();
	Weld weld = new Weld();
	
	public void displayCodes() {
    	for(int i = 0; i < codes.length; i++) {
        	System.out.println(codes[i]);
        }
    }
	public void dataCollecting() {
		System.out.print("Enter the Code to collect data for: \n");
		displayCodes();
		System.out.print(": ");
		codeChoice = scan.nextLine();
		codeChoice = codeChoice.toUpperCase();
		System.out.println(codeChoice);
		if (codeChoice.equals("BEND")) {
			bend.bendDataCollect();
		} else if (codeChoice.equals("BORE WALL")) {
			bW.boreWallDataCollect();
		} else if (codeChoice.equals("CAD WELD")) {
			cad.cadWeldDataCollect();
		} else if (codeChoice.equals("COMBO BEND")) {
			cmbo.comboDataCollect();
		} else if (codeChoice.equals("EXISTING FACILITY")) {
			eF.existingFacilityDataCollect();
		} else if (codeChoice.equals("FENCE")) {
			fnc.fenceDataCollect();
		} else if (codeChoice.equals("LOOSE END")) {
			le.looseEndDataCollect();
		} else if (codeChoice.equals("NATURAL GROUND")) {
			ng.naturalGroundDataCollect();
		} else if (codeChoice.equals("OVERHEAD FACILITY")) {
			ohp.overheadFacilityDataCollect();
		} else if (codeChoice.equals("PI")) {
			pi.piDataCollect();
		} else if (codeChoice.equals("PIPE TOP")) {
			pTop.pipeTopDataCollect();
		} else if (codeChoice.equals("PW")) {
			pw.pipeWeightDataCollect();
		} else if (codeChoice.equals("ROCKSHIELD")) {
			rShield.rockShieldDataCollect();
		} else if (codeChoice.equals("TRENCHBREAKER")) {
			tb.trenchBreakerDataCollect();
		} else if (codeChoice.equals("UNDERGROUND FACILITY")) {
			uF.undergroundFacilityDataCollect();
		} else if (codeChoice.equals("VALVE")) {
			vlv.valveDataCollect();
		} else if (codeChoice.equals("WELD")) {
			weld.weldDataCollect();
		} else {
			System.out.println("That choice is not a valid entry, choose again: ");
		}
	}
}
