package week3.day2;

public class StateBankOfIndia extends SbiHQ {

	public void customerAccount() {
		System.out.println("Account type :Saving");
	}
	@Override
	public void kyc() { // rbi
		System.out.println("KYC IS madatory to create an account");
	}
	@Override
	void humanResourceManagement() { // sbiHQ
		System.out.println("Through Competitive Exams the staff is recruited");
	}
	public static void main(String[] args) {
		StateBankOfIndia sbi = new StateBankOfIndia();
		sbi.customerAccount();
		sbi.kyc();
		sbi.sbiHeadOffice();
		sbi.cashReserveRatio();
		sbi.repoRate();
		sbi.paymentsCorporationOfIndia();
		sbi.recordPayment();
	}
	}


