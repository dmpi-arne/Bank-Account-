package inheritence;

public class StartPoint {

	public static void main(String[] args) {
		SavingsAccount sa = new SavingsAccount("Joya Das", "sa-252525", 75000.0, 8.0);
		
		
		
		CheckingAccount ca= new CheckingAccount("Mitu", "ca-323232", 50000.0, 50000.0);
		
		
		System.out.println("Before deposite");
		System.out.println(sa.getClass().getName()+":"+sa.getBalance());
		System.out.println(ca.getClass().getName()+":"+ca.getBalance());
		
		sa.deposite(40000.0);
		ca.deposite(15000.0);
		
		System.out.println("After deposite");
		System.out.println(sa.getClass().getName()+":"+sa.getBalance());
		System.out.println(ca.getClass().getName()+":"+ca.getBalance());
		
		
		System.out.println(sa.withdraw(50000.0));
		System.out.println(sa.withdraw(100000.0));
		
		
		System.out.println(ca.withdraw(300000.0));
		
		
		System.out.println("call withdrawn using Polymorphism");
		BankAccount b1 = sa;
		BankAccount b2 = ca;
		
		System.out.println(b2.withdraw(700.0));
		
		
		
		
		System.out.println(b1.getClass().getName()+" : "+b1.getAccountName()+"  "+b1.getAccountNo()+" "+b1.withdraw(500.0));
		System.out.println(b2.getClass().getName()+" : "+b2.withdraw(700.0));
		  
		
		System.out.println("polymorphism using Array");
		
			
		
		
		BankAccount []b3 = new BankAccount[2];
		b3[0]= sa;
		b3[1] = ca;
		
		for(BankAccount b : b3) {
			System.out.println(b.getClass().getName()+" : "+b.withdraw(600.0));
		}
		
		System.out.println("static example");
	System.out.println(BankAccount.bankName);
		

	
  
}
}
