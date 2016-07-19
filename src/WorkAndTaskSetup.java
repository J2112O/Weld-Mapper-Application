/*
* This class captures and sets up all task and work related information for collecting survey
* data for the particular session at hand.
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;

public class WorkAndTaskSetup {

    // Calling to capture user input
    BufferedReader br = new BufferedReader(new
            InputStreamReader(System.in));

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getWorkLocation() {
        return workLocation;
    }

    public void setWorkLocation(String workLocation) {
        this.workLocation = workLocation;
    }

    public String getTownShip() {
        return townShip;
    }

    public void setTownShip(String townShip) {
        this.townShip = townShip;
    }

    public String getTownshipRange() {
        return townshipRange;
    }

    public void setTownshipRange(String townshipRange) {
        this.townshipRange = townshipRange;
    }

    public int getSection() {
        return section;
    }

    public void setSection(int section) {
        this.section = section;
    }

    public String fileName;
    public String bookName;
    public String county;
    public String state;
    public String workLocation;
    public String townShip;
    public String townshipRange;
    public int section;

    public void collectTaskSetup() throws IOException {

        System.out.print("Filename: ");
        this.setFileName(br.readLine());
        System.out.print("Book Name: ");
        this.setBookName(br.readLine());
        System.out.print("County: ");
        this.setCounty(br.readLine());
        System.out.print("State: ");
        this.setState(br.readLine());
        System.out.print("Work Location: ");
        this.setWorkLocation(br.readLine());
        System.out.print("Township: ");
        this.setTownShip(br.readLine());
        System.out.print("Range: ");
        this.setTownshipRange(br.readLine());
        while (true) {
            try {
                System.out.print("Section: ");
                this.setSection(Integer.parseInt(br.readLine()));
                break;
            } catch (InputMismatchException | NumberFormatException ex) {
                System.out.println("Whole Numbers Only. No Words or Decimals. ");
            }
        }
    }
}