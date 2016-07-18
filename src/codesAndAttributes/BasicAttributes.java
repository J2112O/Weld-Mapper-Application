/*
* This class contains many shared basic attributes that the majority of
* Survey Codes have.
*/
package codesAndAttributes;

@SuppressWarnings("WeakerAccess")
public class BasicAttributes {

    protected int gpsShot;
	protected double cover;
	protected int ngc;
	protected String notes;
	
	protected int getGpsShot() {
		return gpsShot;
	}
	protected void setGpsShot(int gpsShot) {
		this.gpsShot = gpsShot;
	}
	protected double getCover() {
		return cover;
	}
	protected void setCover(double cover) {
		this.cover = cover;
	}
	protected int getNgc() {
		return ngc;
	}
	protected void setNgc(int ngc) {
		this.ngc = ngc;
	}
	protected String getNotes() {
		return notes;
	}
	protected void setNotes(String notes) {
		this.notes = notes;
	}
	
	}
