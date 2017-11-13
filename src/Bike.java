
public class Bike extends Engine {
	
	private String CompName;
	private boolean gear;
	public Bike(int engno, String rTOno, String compName, boolean gear) {
		super(engno, rTOno);
		CompName = compName;
		this.gear = gear;
	}
	
	public String getCompName() {
		return CompName;
	}
	public void setCompName(String compName) {
		CompName = compName;
	}
	public boolean isGear() {
		
		return  gear;
	}
	public String myMethod()
	{
		if(gear==true)
		{
			return "with gear";
		}
		else
		{
			return " without gear" ;
		}
		
	}
	public void setGear(boolean gear) {
		this.gear = gear;
	}
	
}
