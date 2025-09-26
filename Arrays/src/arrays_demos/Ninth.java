package arrays_demos;

public class Ninth {

	public static void main(String[] args) {
		int [] arr= {12,0,0,45,0};// {0,0,0,12,45}
		
		int[] arr2=new int[arr.length];
		
		  int counter=0;
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]==0)
				{
				 arr[i]=0;
				 
				}
				else
				{
					counter++;
				}
			}
			
			for(int i:arr)
			{
				System.out.println(i);
			}
	}

}
