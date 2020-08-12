package JavaPrograms;

public class bank {
	int balance;
	void balance() {
		System.out.println("Your current balance is: "+balance);
	}
	
	void deposite(int damount) {
		balance=balance+damount;
		System.out.println("You have deposited:"+damount);
		balance();
	}
	
	void withdraw(int wamount) {
		if(wamount<=balance) {
			balance=balance-wamount;
			System.out.println("You have withdrawn: "+wamount+"Rs");
			balance();
		}else
		{
			System.out.println("Insufficient funds");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome to AXIS BANK");
		
		bank b1=new bank();
		b1.balance();
		
		System.out.println("Trasaction details");
		b1.deposite(10000);
		
		System.out.println("Trasaction details");
		b1.withdraw(500);
		
		System.out.println("Thank you");
	}

}
