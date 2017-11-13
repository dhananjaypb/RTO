
public class Bus extends Engine{
	
	private String Compname;
	private boolean volvo;
	public Bus(int engno, String rTOno, String compname, boolean volvo) {
		super(engno, rTOno);
		Compname = compname;
		this.volvo = volvo;
	}
	public String getCompname() {
		return Compname;
	}
	public void setCompname(String compname) {
		Compname = compname;
	}
	public boolean isVolvo() {
		return volvo;
	}
	public void setVolvo(boolean volvo) {
		this.volvo = volvo;
	}
	

}
