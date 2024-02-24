package interfaceclass;

public class QCProject implements Interface {

	@Override
	public void borrower() {
		// TODO Auto-generated method stub
		System.out.println("BorrowerQc");
	}

	@Override
	public void newloan() {
		System.out.println("NewLoanQc");
		
	}

	@Override
	public void rescind() {
		System.out.println("REscindQc");
	
	}

	
	

}
