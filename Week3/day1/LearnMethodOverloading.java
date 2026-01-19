package week3.day1;

public class LearnMethodOverloading {
	
	public void addNumber(int a , int b) {
		System.out.println("Two int type variable is added");
		System.out.println(a+b);
	}
	public void addNumber(double a ,double b) {
		System.out.println("Two double type variable is added");
		System.out.println(a+b);
	}
	
	public void addNumber(long a ,long b) {
		System.out.println("Two long type variable is added");
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		LearnMethodOverloading lml = new LearnMethodOverloading();
		lml.addNumber(798l, 923l);
		

	}

}
