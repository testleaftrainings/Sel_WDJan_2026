package week3.day2;

public interface RBI {
	// void identifierName();
	void cashReserveRatio();
	void repoRate();
	void kyc();
	default void paymentsCorporationOfIndia() {
		System.out.println("all the online transaction is been regulated by npci on behalf of RBI");
	}
	default void recordPayment() {
		System.out.println("Record the transaction which involves payment more than 10 lakhs");
	}
}
