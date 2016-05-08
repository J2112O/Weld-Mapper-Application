package codesAndAttributes;

public class BasicAttributes {
	
	// An array of the Bend Types
	protected String[] bendTypes = {"Field","Forged","Hot"};
	// An array of the types of welds
	protected String[] weldTypes = {"Mainline","Tie-In","Valve Site","Fabrication",
				"Transition","Existing","Repair"};
	
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
