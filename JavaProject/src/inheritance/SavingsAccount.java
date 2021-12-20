package inheritance;

public class SavingsAccount extends Account {
public SavingsAccount(long amount,String name) {
	//child calss use super because parent class call
	//should be first statement
	super("Savings",amount);
	
}
}
