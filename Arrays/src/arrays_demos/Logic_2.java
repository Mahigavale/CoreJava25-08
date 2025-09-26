package arrays_demos;

public class Logic_2 {

	public static void main(String[] args) {
		
		
		int[][] arr=new int[5][5];
		
		/**
		 * Upper Triangular,
		 * Lower Traingular matrix
		 */
		
		int counter=1;
		
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				if(j==i) {
				arr[i][j]=1;
				}
				else
				{
					arr[i][j]=0;
					//counter++;
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
