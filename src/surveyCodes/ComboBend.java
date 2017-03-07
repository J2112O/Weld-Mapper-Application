/*
 * This class captures the Combination bend. 
 */
package surveyCodes;

public class ComboBend extends Bend {


    private int id;
    private String direction2;
    private Double degree2;

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }
    public String getDirection2() {
        return direction2;
    }

    public void setDirection2(String direction2) {
        this.direction2 = direction2;
    }

    public Double getDegree2() {
        return degree2;
    }

    public void setDegree2(Double degree2) {
        this.degree2 = degree2;
    }
}
