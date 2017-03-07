/*
* This class contains many shared basic attributes that the majority of
* Survey Codes have.
*/
package surveyCodes;

@SuppressWarnings("WeakerAccess")
public class BasicAttributes {

	private int id;
    private int wholeStationNum;
    private double offsetStationNum;
    private int gpsShot;
    private double cover;
    private int existGradeShot;
    private String notes;

    public int getWholeStationNum() {
        return wholeStationNum;
    }

    public void setWholeStationNum(int wholeStationNum) {
        this.wholeStationNum = wholeStationNum;
    }

    public double getOffsetStationNum() {
        return offsetStationNum;
    }

    public void setOffsetStationNum(double offsetStationNum) {
        this.offsetStationNum = offsetStationNum;
    }
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	public int getExistGradeShot() {
		return existGradeShot;
	}
	public void setExistGradeShot(int existGradeShot) {
		this.existGradeShot = existGradeShot;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
}
