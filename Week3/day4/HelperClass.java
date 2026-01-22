package week3.day4;

public final class HelperClass extends LearnStaticKeyword {
	final String version = "144.0.7559.60"; // final field HelperClass.version cannot be assigned

	static public void defaultBroswer() {
		String browser = "edge";
		System.out.println(browser);
	}

	public void displayVersion() {
		System.out.println(version);
	}

	public static void main(String[] args) {

		HelperClass helper = new HelperClass();
		helper.displayVersion();

	}
}
