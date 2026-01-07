package week1.day3;

public class LearnMethodAndObject {
	String browserName="chrome";
	// if i need to create a method with the name :void addition()
	public int addition(int a,int b) {
		return a+b;
	}
	
	
	public void subraction() {
		int a =7, b=3;
		int c;
		c=a-b;
		System.out.println(c);
	}
	

	public static void main(String[] args) {
		// syntax
		// ClassName objectName ; // declaration of object
		// objectName = new ClassName(); // initialization of object
		LearnMethodAndObject obj;
		obj = new LearnMethodAndObject();
		System.out.println(obj.browserName);
		int solution = obj.addition(534, 673);// keep the cursor at the end of the line
		// press --> ctrl key + 2 key
		System.out.println(solution);
		obj.subraction(); // no arugment method does not has the return type 
		
		
	}

}
