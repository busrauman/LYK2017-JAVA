package tr.org.kamp.linux.atm;

public class User {
	
	private String accountNumber ;
	private String password;
	private double amount;
	

	public User(String accountNumber , String password) {
		this.accountNumber = accountNumber;
		this.password = password;
	}
	
	public User(String accountNumber , String password , double amount) {
		this.accountNumber = accountNumber;
		this.password = password;
		this.amount = amount;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	

	
	
	
}
