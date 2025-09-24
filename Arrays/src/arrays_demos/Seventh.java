package arrays_demos;

public class Seventh {

	public static void main(String[] args) {
		
		//0 1 2 
		//3 4 5
		
		/**
		 * 2D Array=> 2 dimensional.
		 * datatype [][] variable =new datatype[rows_count][columns_count]
		 */
	//	int[][] arr=new int[3][4];
		
		int []arr= {-232,503,5403,93,-4,-45,234,453,2452,4444};
		
		
		int num=Integer.MIN_VALUE;
		int second=Integer.MIN_VALUE;
		int third=Integer.MIN_VALUE;
		int fourth=Integer.MIN_VALUE;
		int fifth=Integer.MIN_VALUE;
		
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>num)
			{
				 fourth=third;
				 third=second;
				 second=num;
				  num=arr[i];
			}
			if(arr[i]> second && arr[i]<num)
			{
				third=second;
				second=arr[i];
			}
			if(arr[i]>third && arr[i]<second)
			
			{
				fourth =third;
				third=arr[i];
			}
			if(arr[i]>fourth && arr[i]<third)
			{

				fourth=arr[i];
			}
			
			
		}
		
		System.out.println(num);
		System.out.println(second);
		System.out.println(third);
		System.out.println(fourth);
		
	}

}
