package week3.day2;

public abstract class SbiHQ  implements RBI{
	public void sbiHeadOffice() {
		System.out.println("Head office is located in Mumbai");
	}
	abstract void humanResourceManagement();

	@Override
	public void cashReserveRatio() {
		System.out.println("SBI has to store 3.5% of their net worth as cash");
	}
	@Override
	public void repoRate() {
		System.out.println("SBI has to Submit the cast to RBI , 6% Out of their Net worth");
		
	}
}
