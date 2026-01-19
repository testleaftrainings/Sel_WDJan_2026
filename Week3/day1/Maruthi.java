package week3.day1;

public class Maruthi extends AutomobileSpare {
// 4 Wheels
//	1 Steering 
//	1 acc
//	1 brake
//	1 clutch
//	1 Engine
	// child class method
	public void modelName() {
		super.modelName();
		System.out.println("Baleno");
	}

	public static void main(String[] args) {
		Maruthi car = new Maruthi();
		car.modelName(); // parent class method is overridden to child class method
		System.out.println(car.wheelCount);
		car.brakingSystem();
		car.reverserCam();
		car.accelaratorSystem();
		car.soundHorn();

	}

}
