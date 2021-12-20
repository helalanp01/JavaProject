package inheritance;

public class Account {
	//field
private String name;
private long amount;
//create constructor
//two argument
public Account(String name,long amount)
{
	this.name=name;
	this.amount=amount;
}
//method
public void deposit(long amount) {
	this.amount=+amount;
}
public String getName() {
	return name;
}
public long getAmount() {
	return amount;
}
public void setAmount() {
	this.amount=amount;
}
}
