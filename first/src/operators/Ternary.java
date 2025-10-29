package operators;

public class Ternary {

	public static void main(String[] args) {
		
		int age=17;
		/**
		 * Ternary operator is used in the place of
		 * If else statements.
		 */
//		if(age>15)
//		{
//			System.out.println("welcome");
//		}
//		else {
//		System.out.println("not welcome...");
//		}
		
		int result= (age>35)? 100:101;
		
		System.out.println(result);
		
		/**
		 *              (if)?true:false 
		 */
		String result1=(100%2==0)?"even":"odd";
		
		
		int marks=89;
		
//		if(marks >=85)
//		{
//			"A"
//		}
//		else if (marks >=70 &&)
//		{
//			"B"
//		}
//		else
//		{
//			"C"
//		}
		
		/**
		 * Nested Ternary operators are a big no in the corporate.
		 * they reduce the readability of code and make it complex.
		 */
		
		//if()
		String grade=(marks>=85) ? "A+":
		/**else if() **/ (marks >=70 && marks <85) ? "B++":
		/**else if()**/  (marks >=60 && marks <70) ? "B +":
		/** else **/	  "c";

		
		System.out.println(grade);
		
		
		System.out.println((0.1>5)? "hii": "bye");
	}

}
