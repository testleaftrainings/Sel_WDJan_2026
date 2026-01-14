package week2.day3;

public class LearnPrivate {
	private String browser="google";

	private void methodBelongsToParentClass() {
		System.out.println("data controlling access to code.");
	}
	public void caller() {
		methodBelongsToParentClass();
	}
	
	public String getBrowser() {
		return browser;
	}
	public void setBrowser(String browser) {
		this.browser = browser;
	}
	
	

	public static void main(String[] args) {
		LearnPrivate lp = new LearnPrivate();
		lp.methodBelongsToParentClass();
	}
	

}
