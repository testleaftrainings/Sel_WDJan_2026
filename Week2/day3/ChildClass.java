package week2.day3;

public class ChildClass {
	private void methodBelongsToParentClass() {
		System.out.println("data controlling access to code.");
	}
	public static void main(String[] args) {
		LearnPrivate lp = new LearnPrivate();
		lp.caller();

	}

}
