package codesAndAttributes;

public class BasicAttributes {
	
	// An array of the Bend Types
	protected String[] bendTypes = {"Field","Forged","Hot","Other(See Notes)"};
	// An array of the types of welds
	protected String[] weldTypes = {"Mainline","Tie-In","Valve Site","Fabrication",
				"Transition","Existing","Repair","Other(See Notes)"};
	// An array of Pipe Weight types
	protected String[] pipeWeights = {"Sandbag","Concrete Set-On","Concrete Bolt-On","Anchor","Other(See Notes)"};
	// An array of Trench Breaker types
	protected String[] trenchbrkrTypes = {"Foam","Cement","Sand Bags","Other(See Notes)"};
	// An array of Underground Facility Locations
	protected String[] locations = {"Ground Not Exposed","On Exposed Facility","Other(See Notes)"};
	// An array of Underground Facility types
	protected String[] utiliyType = {"Fiber Optic","Water","Electric","Telephone","TV Cable","Unknown","Other(See Notes)"};
	// An array of shot positions in relation to Underground Facilities
	protected String[] positions = {"Above","Below","Other(See Notes)"};
	// An array of tops
	protected String[] tops = {"Ditch","Natural Drain","Creek","Slope","Other(See Notes)"};
	// An array of centerlines for certain features
	protected String[] centers = {"Ditch","Natural Drain","Creek","Other(See Notes)"};
	
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
