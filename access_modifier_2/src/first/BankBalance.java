package first;

public class BankBalance {
	
	
	
	public BankBalance()
	{
		
		System.out.println("Hello");
	}

	private long balance=980980090;
	
	    String name_holder="JOhn peter";
	    
	    void  showname()
	    {
	    	System.out.println(this.name_holder);
	    }
	public void setbalance(long balance)
	{
		this.balance=balance;
	}
	private void displaybalance()
	{
		System.out.println(balance);
	}
	
	public long getbalance()
	{
		return this.balance;
	}
	
	
	
	protected String nominee="Father";
	
	protected void displaynominee()
	{
		System.out.println(this.nominee);
	}
	
}

