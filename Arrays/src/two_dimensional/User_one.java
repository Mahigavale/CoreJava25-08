package two_dimensional;

import java.util.Scanner;

public class User_one {

	public static void main(String[] args) {
	
		
		int [][][] arr=new int[2][][];
		
		arr[0]=new int[2][2];
		arr[1]=new int [3][3];
		
		int counter =1;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				for(int k=0;k<arr[i][j].length;k++)
				{
					arr[i][j][k]=counter;
					counter++;
				}
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				for(int k=0;k<arr[i][j].length;k++)
				{
					System.out.print(arr[i][j][k]+" ");
				}
				System.out.println();
			}
			System.out.println("*****");
		}
	}

}
