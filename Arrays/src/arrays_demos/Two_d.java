package arrays_demos;

public class Two_d {

	public static void main(String[] args) {
		
		int[][] arr=new int[3][3];
		/**
		 * arr.length=> no. of rows.=> 3=>0,1,2
		 */
		
		arr[0][0]=1; //[][][]
		arr[0][1]=2; // arr[0].length=> 
		arr[0][2]=3;
	
		arr[1][0]=4;
		arr[1][1]=5;
		arr[1][2]=6;
		
		arr[2][0]=7;
		arr[2][1]=8;
		arr[2][2]=9;
		  
		
		//Iterate over all the rows.
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
			System.out.print(arr[i][j]+" ");
			//0,0 //1,0 //2,0
			//0,1 //1,1 //2,1
			//0,2 //1,2 //2,2
			}
			System.out.println();
		}
	
		
		
		
	}

}
