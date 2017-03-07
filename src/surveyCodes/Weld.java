/*
 *	This package captures all the information for each weld 
 */
package surveyCodes;

public class Weld extends BasicAttributes {


    private int id;
	private String weldType;
	private String weldId;
	private String upstreamJoint;
	private String downstreamJoint;
	private String heatAhead;
	private double lengthAhead;
	private String wallChange;
	private String pipeLocation;
	private double weldWallThickness;
	private String welderInitials;

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }
	public String getWeldType() {
		return weldType;
	}
	private void setWeldType(String weldType) {
		this.weldType = weldType;
	}
	public String getWeldId() {
		return weldId;
	}
	private void setWeldId(String weldId) {
		this.weldId = weldId;
	}
	public String getUpstreamJoint() {
		return upstreamJoint;
	}
	private void setUpstreamJoint(String upstreamJoint) {
		this.upstreamJoint = upstreamJoint;
	}
	public String getDownstreamJoint() {
		return downstreamJoint;
	}
	private void setDownstreamJoint(String downstreamJoint) {
		this.downstreamJoint = downstreamJoint;
	}
	public String getHeatAhead() {
		return heatAhead;
	}
	private void setHeatAhead(String heatAhead) {
		this.heatAhead = heatAhead;
	}
	private double getLengthAhead() {
		return lengthAhead;
	}
	private void setLengthAhead(double lengthAhead) {
		this.lengthAhead = lengthAhead;
	}
	private String getWallChange() {
		return wallChange;
	}
	private String setWallChange(String wallChange) {
		this.wallChange = wallChange;
        return wallChange;
	}
	public String getPipeLocation() {
		return pipeLocation;
	}
	private void setPipeLocation(String pipeLocation) {
		this.pipeLocation = pipeLocation;
	}
	public String getWelderInitials() {
		return welderInitials;
	}
	private void setWelderInitials(String welderInitials) {
		this.welderInitials = welderInitials;
	}
    public double getWeldWallThickness() {
        return weldWallThickness;
    }
    public void setWeldWallThickness(double weldWallThickness) {
        this.weldWallThickness = weldWallThickness;
    }

}
