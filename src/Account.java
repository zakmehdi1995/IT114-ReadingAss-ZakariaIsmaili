import java.util.Date;
public class Account {
	
		private int id;
		private double balance; 
		private double annualInterestRate; 
		private Date dateCreated; 
	
	Account () {
	    id = 0;
	    balance = 0.0;
	    annualInterestRate = 0.0;
	}
	
	Account(int newId, double newBalance) {
	    id = newId;
	    balance = newBalance;
	}
	Account(int newId, double newBalance, double newAnnualInterestRate) {
	    id = newId;
	    balance = newBalance;
	    annualInterestRate = newAnnualInterestRate;
	}
	
	public int getId() {
	    return id;
	}
	public double getBalance() {
	    return balance;
	}
	public double getAnnualInterestRate() {
	    return annualInterestRate;
	}
	public void setId(int newId) {
	    id = newId;
	}
	public void setBalance(double newBalance) {
	    balance = newBalance;
	}
	public void setAnnualInterestRate(double newAnnualInterestRate) {
	    annualInterestRate = newAnnualInterestRate;
	}
	
	public void setDateCreated(Date newDateCreated) {
	    dateCreated = newDateCreated;
	}
	
	double getMonthlyInterestRate() {
	    return annualInterestRate/12;
	}
	
	double withdraw(double amount) {
	    return balance -= amount;
	}   
	
	double deposit(double amount) {
	    return balance += amount;   
	}
	
public static void main(String[] args) {

	Account account1 = new Account(1122, 20000, .045);
	account1.withdraw(2500);
	account1.deposit(3000);
	java.util.Date dateCreated = new java.util.Date();
	System.out.println("Date Created:" + dateCreated);
	System.out.println("Account ID:" + account1.id);
	System.out.println("Balance:" + account1.getBalance());
	System.out.println("Interest Rate:" + account1.getAnnualInterestRate());
	System.out.println("Balance after withdraw of 2500:" +       account1.getAnnualInterestRate());
	System.out.println("Balance after deposit of 3000:" + account1.getAnnualInterestRate());
	System.out.println("Monthly Interest:" + account1.id);
	
	System.out.println("Process completed.");
	}

}
