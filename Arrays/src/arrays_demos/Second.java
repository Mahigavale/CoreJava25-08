package arrays_demos;

public class Second {

	public static void main(String[] args) {
		
		// array=> 1500[0,1,2,,,,,,1499]
		
		int[] arr=new int[10];
		
		//arr[143]=2390; //=  => to assign the value.
		//System.out.println(arr[143]);
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=100*i;
			//arr[0]=0+1
			//arr[1]=1+1;
			/**
			 * ...
			 * 
			 * 
			 * arr[9]=9+1;
			 */
		}
		
		System.out.println(arr[8]);
		
		int[] arr2=new int[1];
		System.out.println(arr2.length);
	}

}
