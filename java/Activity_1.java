package Activities;

public class Activity_1 {

	public static void main(String[] args) {
		 
		Car carname =new Car();
		carname.make=2014;
		carname.color="Black";
		carname.transmission="Manual";
		
		//call methods
		carname.displayCharacteristics();
		carname.accelerate();
		carname.brake();

	}

}
