package interfaceclass;

public interface Interface {
	
public void borrower();
public void newloan();
public void rescind();

default void deposit() {
	System.out.println("DepositInterface");
	}

static void buyback() {
	
	System.out.println("Buyback");
}

}
