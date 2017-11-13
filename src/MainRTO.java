
public class MainRTO {

	public static void main(String[] args) {
		Bike b=new Bike(456978,"Mh02 BM1782","Bajaj",false);
		//Engine e=new Engine(1235,897);
		System.out.println("Your bike company is " +b.getCompName()+" with engine no. " +b.getEngno());
		System.out.println("Which is a "+b.myMethod());
		//b.isGear();
		System.out.println("Your RTO no. is " +b.getRTOno());
		System.out.println("New code added");
		

	}

}


// I want return value