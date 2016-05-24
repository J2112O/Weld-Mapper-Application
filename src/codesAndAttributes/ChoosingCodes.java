/* 
 * Using this class to capture what code the user wants to collect data for 
 */
package codesAndAttributes;
import java.io.IOException;
import java.io.*;

public class ChoosingCodes {
	
	// Creating an instance of Buffer Reader
	BufferedReader br = new BufferedReader(new
			InputStreamReader(System.in));
	// Using this string to capture user input for the code to collect data for
	private String codeChoice;
	// An array of the codes to choose from to collect data for
	private String[] codes = {"BEND(SAG OR OVERBEND)","BORE WALL","CAD WELD","CENTERLINE OF..","COMBO BEND","EXISTING FACILITY",
			"FENCE","LOOSE END","NATURAL GROUND","OVERHEAD FACILITY","PI(SIDEBEND)","PIPE TOP",
			"PW(PIPE WEIGHTS)","ROCKSHIELD","TOP OF..","TRENCHBREAKER","UNDERGROUND FACILITY","VALVE","WELD"};
	// Creating instances of all the codes available to collect data for
	Bend bend = new Bend();
	BoreWall bW = new BoreWall();
	CadWeld cad = new CadWeld();
	CenterlineOf cl = new CenterlineOf();
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
	TopOf top = new TopOf();
	UndergroundFacility uF = new UndergroundFacility();
	Valve vlv = new Valve();
	Weld weld = new Weld();
	
	public void displayCodes() {
    	for(int i = 0; i < codes.length; i++) {
        	System.out.println(codes[i]);
        }
    }
	
	public void dataCollectingChoices() throws IOException {
			// Getting the code choice from the user here..
			System.out.print("Enter the Code to collect data for: \n");
			displayCodes();
			System.out.print(": ");
			codeChoice = br.readLine();
			// Calling instances of the requested available codes
			if (codeChoice.equalsIgnoreCase("bend")) {
				bend.bendDataCollect();
			} else if (codeChoice.equalsIgnoreCase("bore wall")) {
				bW.boreWallDataCollect();
			} else if (codeChoice.equalsIgnoreCase("cad weld")) {
				cad.cadWeldDataCollect();
			} else if (codeChoice.equalsIgnoreCase("combo bend")) {
				cmbo.comboDataCollect();
			} else if (codeChoice.equalsIgnoreCase("existing facility")) {
				eF.existingFacilityDataCollect();
			} else if (codeChoice.equalsIgnoreCase("fence")) {
				fnc.fenceDataCollect();
			} else if (codeChoice.equalsIgnoreCase("loose end")) {
				le.looseEndDataCollect();
			} else if (codeChoice.equalsIgnoreCase("natural ground")) {
				ng.naturalGroundDataCollect();
			} else if (codeChoice.equalsIgnoreCase("overhead facility")) {
				ohp.overheadFacilityDataCollect();
			} else if (codeChoice.equalsIgnoreCase("pi")) {
				pi.piDataCollect();
			} else if (codeChoice.equalsIgnoreCase("pipe top")) {
				pTop.pipeTopDataCollect();
			} else if (codeChoice.equalsIgnoreCase("pw")) {
				pw.pipeWeightDataCollect();
			} else if (codeChoice.equalsIgnoreCase("rockshield")) {
				rShield.rockShieldDataCollect();
			} else if (codeChoice.equalsIgnoreCase("trenchbreaker")) {
				tb.trenchBreakerDataCollect();
			} else if (codeChoice.equalsIgnoreCase("underground facility")) {
				uF.undergroundFacilityDataCollect();
			} else if (codeChoice.equalsIgnoreCase("valve")) {
				vlv.valveDataCollect();
			} else if (codeChoice.equalsIgnoreCase("weld")) {
				weld.weldDataCollect();
			} else {
				System.out.println("That choice is not a valid entry, choose again: ");
				dataCollectingChoices();
			}
		}
	}	
