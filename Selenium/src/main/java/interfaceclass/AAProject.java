 package interfaceclass;

public class AAProject implements Interface {

	@Override
	public void borrower() {
		System.out.println("Borrower");
		
	}

	@Override
	public void newloan() {
	System.out.println("NewLoan");
		
	}

	@Override
	public void rescind() {
    System.out.println("rescind");
	}
    
    public void deposit() {
    	 System.out.println("AADeposit");
    	
    }
		
	
	

}


