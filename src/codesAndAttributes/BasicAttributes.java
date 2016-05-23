package codesAndAttributes;

public class BasicAttributes {
	
	// An array of the Bend Types
	protected String[] bendTypes = {"FIELD","FORGED","HOT","OTHER(SEE NOTES)"};
	// An array of the types of welds
	protected String[] weldTypes = {"MAINLINE","TIE-IN","VALVE SITE","FABRICATION",
				"TRANSITION","EXISTING","REPAIR","OTHER(SEE NOTES)"};
	// An array of Pipe Weight types
	protected String[] pipeWeights = {"SANDBAG","CONCRETE SET-ON","CONCRETE BOLT-ON","ANCHOR","OTHER(SEE NOTES)"};
	// An array of Trench Breaker types
	protected String[] trenchbrkrTypes = {"FOAM","CEMENT","SAND BAGS","OTHER(SEE NOTES)"};
	// An array of Underground Facility Locations
	protected String[] locations = {"GROUND NOT EXPOSED","ON EXPOSED FACILITY","OTHER(SEE NOTES)"};
	// An array of Underground Facility types
	protected String[] utiliyType = {"FIBER OPTIC","WATER","ELECTRIC","TELEPHONE","TV CABLE","UNKNOWN","OTHER(SEE NOTES)"};
	// An array of shot positions in relation to Underground Facilities
	protected String[] positions = {"ABOVE","BELOW","OTHER(SEE NOTES)"};
	// An array of tops
	protected String[] tops = {"DITCH","NATURAL DRAIN","CREEK","SLOPE","OTHER(SEE NOTES)"};
	// An array of centerlines for certain features
	protected String[] centers = {"DITCH","NATURAL DRAIN","CREEK","OTHER(SEE NOTES)"};
	
	protected int gpsShot;
	protected double cover;
	protected int ngc;
	protected String notes;
	
	public int getGpsShot() {
		return gpsShot;
	}
	public void setGpsShot(int gpsShot) {
		this.gpsShot = gpsShot;
	}
	public double getCover() {
		return cover;
	}
	public void setCover(double cover) {
		this.cover = cover;
	}
	public int getNgc() {
		return ngc;
	}
	public void setNgc(int ngc) {
		this.ngc = ngc;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	
	public void displayCertainTypes(String[] x) {
		for(int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}
	}
}
