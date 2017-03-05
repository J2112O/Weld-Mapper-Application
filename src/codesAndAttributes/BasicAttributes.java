/*
* This class contains many shared basic attributes that the majority of
* Survey Codes have.
*/
package codesAndAttributes;

@SuppressWarnings("WeakerAccess")
public class BasicAttributes {

    private int gpsShot;
	private double cover;
	private int existGradeShot;
	private String notes;
	
	private int getGpsShot() {
		return gpsShot;
	}
	private void setGpsShot(int gpsShot) {
		this.gpsShot = gpsShot;
	}
	private double getCover() {
		return cover;
	}
	private void setCover(double cover) {
		this.cover = cover;
	}
	private int getExistGradeShot() {
		return existGradeShot;
	}
	private void setExistGradeShot(int existGradeShot) {
		this.existGradeShot = existGradeShot;
	}
	private String getNotes() {
		return notes;
	}
	private void setNotes(String notes) {
		this.notes = notes;
	}
}
