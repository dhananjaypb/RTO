
public class Car extends Engine {
	
	private String Compname;
	private boolean AC;
	public Car(int engno, String rTOno, String compname, boolean aC) {
		super(engno, rTOno);
		Compname = compname;
		AC = aC;
	}
	public String getCompname() {
		return Compname;
	}
	public void setCompname(String compname) {
		Compname = compname;
	}
	public boolean isAC() {
		return AC;
	}
	public void setAC(boolean aC) {
		AC = aC;
	}
	

}
