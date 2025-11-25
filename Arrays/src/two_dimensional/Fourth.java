package two_dimensional;

public class Fourth {

	public static void main(String[] args) {


		String str="1741725";
		
		int i=Integer.parseInt(str);
		int sum=0;
		while(i>0) {
		int num=i%10;
		int sum2=1;
		for(int j=1;j<=str.length();j++)
		{
			sum2=sum2*num; 
		}
		sum=sum+sum2;
      i=i/10;
		}
		
		
		System.out.println(str);
		System.out.println(sum);
	}

}
