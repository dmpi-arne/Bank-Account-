package inheritence;

public  class CheckingAccount extends BankAccount {

	
	
	

	public CheckingAccount() {
		super();
	}


	private double serviceCharge;
	
	
	

	


	public CheckingAccount(String accountName, String accountNo, double balance, double serviceCharge) {
		super(accountName, accountNo, balance);
		this.serviceCharge = serviceCharge;
	}

	public double getServiceCharge() {
		return serviceCharge;
	}

	public void setServiceCharge(double serviceCharge) {
		this.serviceCharge = serviceCharge;
	}


	@Override
	public String withdraw(double amount) {
				setBalance(getBalance() - amount);
		
		return  amount+"withdrawn from your account."; 
	}


	


	
	

	
}
