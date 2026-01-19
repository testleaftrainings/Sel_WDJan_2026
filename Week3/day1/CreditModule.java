package week3.day1;
// HDFC
public class CreditModule {
	// NetBanking(NEFT,IMPS,RTG),Forex,CDM --> transferring the money to the respective account
	double balance = 10000;
	
	public void accountCreditModule() {
		System.out.println("Available balance in the account : "+ balance);
	}
	//CDM
	public void accountCreditModule(int cdm){
		System.out.println("The amount is credited through the CDM mode of transction : "+cdm);
		balance = balance+cdm;
		accountCreditModule();
	}
	// NetBanking(NEFT,IMPS,RTG)
	public void accountCreditModule(double netBanking) {
		System.out.println("The amount is credited  through the NEFT mode of transction : "+netBanking);
		balance = balance+netBanking;
		accountCreditModule();
	}
	//Forex
	public void accountCreditModule(String nameOfTheCurrency,double transactionCredits,double conversionRate) {
		// logic to convert the currency to INR
		double temp;
		temp=transactionCredits*conversionRate;
		System.out.println("Currency of the donor is : "+ nameOfTheCurrency);
		System.out.println("The amount credited through Forex after conversion to INR :"+temp);
		balance = balance+temp;
		accountCreditModule();
	}
	

	public static void main(String[] args) {
		CreditModule cm = new CreditModule();
		cm.accountCreditModule(20000);
		cm.accountCreditModule(55555.55);
		cm.accountCreditModule("EUR ",65,102.80);
	}

}
