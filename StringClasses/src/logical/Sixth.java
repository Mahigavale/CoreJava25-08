package logical;

public class Sixth {

	public static void main(String[] args) {
		
		// "1345", "4534235", "34454433"
		
		
		
		String str="92727.896";
		
		
		Demo_3.checkarm(str);
		
		
		
		

	}
}

class Demo_3
{
	public static void checkarm(String str)
	{

		 double d=Double.parseDouble(str);
		    int i=(int)d;
		
		    System.out.println("I:"+i);
		   int temp=i;
		 // System.out.println(i);
		  
		  int temp2=i;
		  
		  int counter=0;
		  while(temp2>0)
		  {
			   temp2=temp2/10;
			   counter++;
		  }
		 // System.out.println(counter);

		int sum=0;
		  while(i>0) {
		    int num= i%10; //1634=> 4,3, 6 , 1
		    int sum_1=1;
		    for(int j=1;j<=counter;j++)
		    {
		    	sum_1=sum_1*num; //4,4,4,4  ,3,3,3,3   6,6,6,6   1,1,1,1
		    }
		    sum= sum+sum_1; //0+256+81+1296+1 =>1297+81+256 =>1634
		    i=i/10; //163 //16 // 1 //0
		  }
		  System.out.println("sum:"+sum);
		
		
		  System.out.println(sum==temp);
	}
}