package first;

public class Demo {

	public static void main(String[] args) {
		
		/**
		 * Private =>****
		 * Default=> ***
		 * Protected => **
		 * public => *
		 */

		Bank2 b2=new Bank2();
		
		b2.showname();
		
		
		
		
		BankBalance bl=new BankBalance();
		
		System.out.println(bl.nominee);
		bl.displaynominee();
		
		
		
//		BankAccount bank=new BankAccount();
//		
//		bank.balance=0;
//		System.out.println(bank.getbalance());
	}

}


class Bank2 extends BankBalance
{
	public void showre()
 
   {
    	this.showname();
    	this.displaynominee();
    }
	
	
	public Bank2()
	{
		System.out.println("hii");
	}
}
