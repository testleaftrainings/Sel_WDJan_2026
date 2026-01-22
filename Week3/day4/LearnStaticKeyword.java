package week3.day4;

/*
 * execution order :
 *  1) static block
 *  2) static method
 *  3) non static block
 *  4) non static variable using object of the class
 */

public class LearnStaticKeyword {
	int b;
	static int a;
	static String browser;

	static public void defaultBroswer() {
		System.out.println("static method");
		System.out.println(browser);
		System.out.println(a);
	}
	final public void browserMode() { //Cannot override the final method in child class
		System.out.println("Inprivate");
	}
	
	static{
		System.out.println("static block");
		a=2;
		browser="edge";
	}
	
	// instance block
	{ 
		System.out.println("Non - static blocks");
		b =22;
	}

	public static void main(String[] args) {
		defaultBroswer();
		LearnStaticKeyword lsk = new LearnStaticKeyword();
		System.out.println(lsk.b);
	}
	
}
