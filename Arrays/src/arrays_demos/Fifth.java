package arrays_demos;

public class Fifth {

	public static void main(String[] args) {
	
		int[]arr={-11,-23,-56,-78,-2,-13232,-13233,0};
		
		int num=Integer.MIN_VALUE;// //-63743030
		int lowest=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			/**
			 * arr[0]=>17
			 * arr[1]=>11
			 * arr[2]=>78
			 * arr[3]=>87
			 * arr[4]=>84
			 * 17>0
			 * 11>17
			 * 78>17
			 * 87>78
			 * 84>87
			 */
			if(arr[i]>num)
			{
				num=arr[i];
				System.out.println(num);
				/**
				 *  num=17;
				 *  num=78;
				 *  num=87;
				 */
				
			}
		}
		System.out.println("Highest:"+num);
		
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<lowest )
			{
				lowest=arr[i];
			}
		}
		System.out.println("Lowest:"+lowest);
	}

}
