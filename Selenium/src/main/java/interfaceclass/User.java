package interfaceclass;

public class User {

	public static void main(String[] args) {
		AAProject aa=new AAProject();
		aa.borrower();
		aa.newloan();
		aa.rescind();
		aa.deposit();
		
		
		QCProject qc=new QCProject();
		
		qc.borrower();
		qc.newloan();
		qc.rescind();
		qc.deposit();
	}
	
	

}
