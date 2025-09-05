package operators;

public class Increment {

	public static void main(String[] args) {
		
		
		
	 double sum=108.78;
	 
	 
	 
	   ++sum;    //109.78
	   sum++;   //109.78=>110.7
	   ++sum;   //111.78
	   
	   System.out.println(sum+(++sum)+(sum++)+(++sum)+(++sum));
	                    //111.78+112.78+112.78+114.78+115.78
	   System.out.println(111.78+112.78+112.78+114.78+115.78);
	   System.out.println(sum);
	}

}
