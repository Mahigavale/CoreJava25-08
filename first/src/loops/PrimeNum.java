package loops;

public class PrimeNum {

	public static void main(String[] args) {
		
		int num=13;
		 boolean flag=true;
		for(int i=2;i<13;i++)
		{
			if(num%i==0)//2,3,4,5,6,7,8,9,10,11,12 never true
			{
				//2=>12 => reverse
				flag=false;
			}
			
		}
	
	if(flag==false)
	{
		System.out.println("not prime");
	}
	else
	{
		System.out.println("prime");
	}
	}

}
