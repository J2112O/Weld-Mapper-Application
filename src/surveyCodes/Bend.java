/*
 *	This class is used for all bends.Included are Sags, Overbends and PI's.
 **/
package surveyCodes;

public class Bend extends BasicAttributes {

    private String bendType;
    private String bendKind;
    private String bendDirection;
    private Double degree;

    public String getBendKind() {
        return bendKind;
    }

    public void setBendKind(String bendKind) {
        this.bendKind = bendKind;
    }

    public String getBendType() {
        return bendType;
    }

    public void setBendType(String bendType) {
        this.bendType = bendType;
    }

    public String getBendDirection() {
        return bendDirection;
    }

    public void setBendDirection(String bendDirection) {
        this.bendDirection = bendDirection;
    }

    public Double getDegree() {
        return degree;
    }

    public void setDegree(Double degree) {
        this.degree = degree;
    }
}
