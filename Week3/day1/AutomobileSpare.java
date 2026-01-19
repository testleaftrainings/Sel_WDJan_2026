package week3.day1;

public class AutomobileSpare extends Valeo {
	
	// MRF , APPOLO
	public int wheelCount = 4;
	
	// american accel
	public void steertingSystem() {
		System.out.println("power steering system");
	}

	public void accelaratorSystem() {
		System.out.println("turbo accelarator System");
	}

	public void brakingSystem() {
		System.out.println("ABS Braking System");
	}

	public void headLight() {
		System.out.println("LED head lamp and fog lamp");
	}

	public void soundHorn() {
		System.out.println("power horn");
	}
	// parent class method
	public void modelName() {
		System.out.println("No Title");
	}
	
	public static void main(String[] args) {
		AutomobileSpare ams = new  AutomobileSpare();
		ams.modelName();
	}
}
