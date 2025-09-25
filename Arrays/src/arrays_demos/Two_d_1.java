package arrays_demos;

public class Two_d_1 {

	public static void main(String[] args) {
		// 1 2 3
		//4 5 6
		// 7 8 9

		int no=0;
		
		int [][] arr=new int[10][10];
		
		int counter=1;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				if(counter==1)
				{
					arr[i][j]=0;
				}
				counter++;
				if(counter>1)
				{
					boolean flag=true;
					for(int k=2;k<counter;k++)
					{
						if(counter%k==0)
						{
							flag=false;
						}
					}
					if(!flag)
					{
						arr[i][j]=0;
					}
					else
					{
						arr[i][j]=counter;
						no++;
					}
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
		System.out.println("Total prime nums:"+no);
	}

}
