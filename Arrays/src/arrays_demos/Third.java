package arrays_demos;

public class Third {

	public static void main(String[] args) {
		
		
		/**
		 *  1500=>[0......1499]=>[0][1][2]....[1499]
		 *  => a=element%7==0
		 */
		
		int counter=0;
		int[]people=new int[1500];
		
		for(int i=0;i<1500;i++)
		{
			if(i==0)
			{
				continue;
			}
			else if(i%50==0)
			{
				System.out.print(" "+i);
			}
			people[i]=i;
		}
		
		
		
		//int[] educated=new int[counter];
		
		
		
		
		
		
		System.out.println();
	System.out.println(people[1499]);
	//	System.out.println("COunter:"+counter);
	}

}
