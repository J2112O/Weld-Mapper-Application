package codesAndAttributes;
import java.util.Scanner;

public class Weld {
	
	Scanner input = new Scanner(System.in);
	
	private int gpsShot;
	private String weldType;
	private String weldId;
	private String pipeBack;
	private String pipeAhead;
	private String heatAhead;
	private double lengthAhead;
	private int ngc;
	private double cover;
	private String misc;
	
	public int getGpsShot() {
		return gpsShot;
	}
	public void setGpsShot(int gpsShot) {
		this.gpsShot = gpsShot;
	}
	public String getWeldType() {
		return weldType;
	}
	public void setWeldType(String weldType) {
		this.weldType = weldType;
	}
	public String getWeldId() {
		return weldId;
	}
	public void setWeldId(String weldId) {
		this.weldId = weldId;
	}
	public String getPipeBack() {
		return pipeBack;
	}
	public void setPipeBack(String pipeBack) {
		this.pipeBack = pipeBack;
	}
	public String getPipeAhead() {
		return pipeAhead;
	}
	public void setPipeAhead(String pipeAhead) {
		this.pipeAhead = pipeAhead;
	}
	public String getHeatAhead() {
		return heatAhead;
	}
	public void setHeatAhead(String heatAhead) {
		this.heatAhead = heatAhead;
	}
	public double getLengthAhead() {
		return lengthAhead;
	}
	public void setLengthAhead(double lengthAhead) {
		this.lengthAhead = lengthAhead;
	}
	public int getNgc() {
		return ngc;
	}
	public void setNgc(int ngc) {
		this.ngc = ngc;
	}
	public double getCover() {
		return cover;
	}
	public void setCover(double cover) {
		this.cover = cover;
	}
	public String getMisc() {
		return misc;
	}
	public void setMisc(String misc) {
		this.misc = misc;
	}
	public void weldDataCollect() {
		System.out.print("Enter the GPS Point for this Code: ");
		this.gpsShot = input.nextInt();
		input.nextLine();		
		System.out.print("Enter the Weld Type (Mainline,Tie-in,Fabrication,Factory): ");
		this.weldType = input.nextLine();
		System.out.print("Enter the Weld ID (X-Ray Number): ");
		this.weldId = input.nextLine();
		System.out.print("Enter the Pipe(Name or ID) back: ");
		this.pipeBack = input.nextLine();
		System.out.print("Enter the Pipe(Name or ID) ahead: ");
		this.pipeAhead = input.nextLine();
		System.out.print("Enter the Heat ahead: ");
		this.heatAhead = input.nextLine();
		System.out.print("Enter the Length ahead: ");
		this.lengthAhead = input.nextDouble();
		input.nextLine();
		System.out.print("Enter the Natural Ground shot for cover: ");
		this.ngc = input.nextInt();
		input.nextLine();
		System.out.print("Enter the Cover: ");
		this.cover= input.nextDouble();
		input.nextLine();
		System.out.print("Enter any Notes(None if no notes): ");
		this.misc= input.nextLine();
		input.close();
	}
	
}
