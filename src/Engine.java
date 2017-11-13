
abstract class Engine {

	private int Engno;
	private String RTOno;
	public Engine(int engno, String rTOno) {
		super();
		Engno = engno;
		RTOno = rTOno;
	}
	public int getEngno() {
		return Engno;
	}
	public void setEngno(int engno) {
		Engno = engno;
	}
	public String getRTOno() {
		return RTOno;
	}
	public void setRTOno(String rTOno) {
		RTOno = rTOno;
	}

	}
