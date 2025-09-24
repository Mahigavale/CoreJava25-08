package arrays_demos;

public class Two_d_two {

	public static void main(String[] args) {
		//9 8 7
		//6 5 4
		//3 2 1
		
		int[][] arr=new int[3][3];
		
		
		int counter=9;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				arr[i][j]=counter;
				counter--;
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
