package logical;

public class Third {

	public static void main(String[] args) {
		
		 System.out.println(IBM.countdays(10,9));
		 //3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3
		 //0,0,0,0,4,4,4,4,4,4,4,4,4,4,4,4,4
		 
		 
		 //3,3,3,3,3,3,3,3,3,3,3,3,3
		 //0,0,0,0,0,5,5,5,5,5,5,5,5
	}

}

class IBM
{
	
	public static int countdays(int john,
	int peter)
	{
		int counter=0;
		/**
		 * Guard Clause.
		 * Check the negative condition first.
		 * and that too at the start of the question.
		 */
		if(peter <=john)
		{
			return -1;
		}
		int john_q=john*peter;
		int peter_q=0;
		
		while(john_q>=peter_q)
		{
			//john_q=john_q+john
			john_q+=john;
			
			//peter_q=peter_q+peter
			peter_q+=peter;
			System.out.println("john Q:"+john_q);
			System.out.println("peter Q:"+peter_q);
			++counter;
			System.out.println("day:"+counter);
		}
		return counter;
		
	}
}