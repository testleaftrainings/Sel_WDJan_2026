package week3.day1;

public class Toyota extends AutomobileSpare {
	// child class method
	public void modelName() {
		System.out.println("Glanza");
	}

	public static void main(String[] args) {
		Toyota car = new Toyota();
		car.modelName(); // parent class method is overridden to child class method
		car.reverserCam();
		car.brakingSystem();
		car.accelaratorSystem();
		car.steertingSystem();
		System.out.println(car.wheelCount);

	}

}
