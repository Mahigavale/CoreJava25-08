package two_dimensional;

public class Jagged {

	public static void main(String[] args) {
		
		
		
	int [][] arr=new int[8][];
	
	arr[0]=new int[4];
	arr[1]=new int[1];
	arr[2]=new int[2];
	arr[3]=new int[10];
	arr[4]=new int[6];
	arr[5]=new int[1];
	arr[6]=new int [7];
	arr[7]=new int[2];
		
	
	int counter=1;
	int sum=0;
	for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<arr[i].length;j++)
		{
			arr[i][j]=counter;
			sum+=counter;
			//sum =sum +counter;
			counter++;
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
		
	
	
	System.out.println("Total sum is:"+sum);
	}

}
