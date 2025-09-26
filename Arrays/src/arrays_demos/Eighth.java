package arrays_demos;

public class Eighth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//0 1 3   6 7 8 =>35 35 35
		//2 3 4   8 8 8 =>72 74 76
		//5 6 7   9 9 9=>141 146 151
		
		
		int [][]arr= {{1,2},{3,4}};
		int [][] arr2= {{5,6},{7,8}};
		
//		/int [][]result= new int[2][2];
		/**
		 *  1 2  5 6   =>19 22 =>(0,0)*(0,0)+(0,1)*(1,0) (0,0)*(0,1)+(0,1)*(1,1)
		 *  3 4  7 8   =>43 50 =>(1,0)*(0,0)+(1,1)*(0,1) (1,0)*(0,1)+(1,1)*(1,1)
		 */
		
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{  int result=0;
				for(int k=0;k<2;k++)
				{
				 result =arr[i][j]*arr2[i][k];
				}
				System.out.println(result);
			}
		}
		
	}

}
