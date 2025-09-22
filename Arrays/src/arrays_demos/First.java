package arrays_demos;

public class First {

	public static void main(String[] args) {
		
		//10,20,30,40,50
		// [10,20,30,40,50]=> line by line
		
//		int num1=10;
//		int num2=20;
//		int num3=30;
//		/**
//		 * 
//		 * 
//		 */
//		int num10=10;
		
		/**
		 * int => 4 bytes.
		 * [][][][][] => 20 bytes
		 */
		int [] nums=new int[5];
		
		nums[0]=10;
		nums[4]=60;
		nums[3]=50;
		nums[2]=40;
		nums[1]=20;
		/**
		 * length => Array.length
		 */
		
		System.out.println("**************");
		System.out.println(nums[4]);
		char[]chars=new char[10];
		
		System.out.println(nums[2]*100);
		

	}

}
