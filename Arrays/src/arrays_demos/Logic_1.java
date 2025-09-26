package arrays_demos;

public class Logic_1 {

	public static void main(String[] args) {
		
		//        1
	   //       2 3
	  //	 4 5  6

		//1 0 0
		//2 3 0
		//4 5 6
		
		
		int[][] arr=new int [5][5];
		
		
		int counter=1;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				
				int k=0;
				
			while(k <arr[i].length-(i+1))
				{
				   arr[i][k]=0;
				   k++;
				  
				}
			if(j>=k) {
				arr[i][j]=counter;
				counter++;
			}
			}
		}
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
