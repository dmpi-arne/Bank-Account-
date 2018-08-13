package inheritence;

public abstract class BankAccount {
	private String accountName;
	private String accountNo;
	private double balance;
	public static final String bankName="DMPI";
	
	
	

	public BankAccount() {
		super();
	}


	public BankAccount(String accountName, String accountNo, double balance) {
		
		this.accountName = accountName;
		this.accountNo = accountNo;
		this.balance = balance;
	}


	public String getAccountName() {
		return accountName;
	}


	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}


	public String getAccountNo() {
		return accountNo;
	}


	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	


	public String deposite(double amount) {
		
		balance += amount;
		
		return  amount+"deposited to your account.";
	}
	
	
	
	
	/*public String withdraw(double amount) {
		
		
		if(balance-amount>0) {
			
			balance -= amount;
			return amount+"  Withdrawn from your account.";
			
		}else {
			return "  Insufficient balance.";
		} 
		
		
		
	} */
     /*public String withdraw(double amount) {
		if(amount<=0) {
			throw new IllegalArgumentException("Invalid Amount");
		}
		balance -= amount;
		
		return  amount+"withdrawn from your account."; 
	} */
	public abstract String withdraw(double amount) ;
     
	
}
