package inheritence;

public  class SavingsAccount extends BankAccount {
	
	private double interestRate;
	
	
	public SavingsAccount() {
		super();
	}



	public SavingsAccount (String accountName, String accountNo, double balance,double interestRate) {
		super(accountName,accountNo,balance);
		this.interestRate= interestRate;
	}

	

	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	
	@Override
	public String withdraw(double amount) {
		if(getBalance()-amount>0) {
			setBalance(getBalance()- amount);
			return amount+" withdrawn from your account";
		}else {
			return "Insufficient Balance!!";
		}
	
		
	}
}
	
	
	
	
	

