package stringworking;

public class Third {

	public static void main(String[] args) {
		
		String str="     .";
		//String literal
		
		System.out.println(str.isBlank());
         // Ignore the white spaces. if only white spaces then it is true.
		System.out.println(str.isEmpty());
		// spaces => isEmpty() => 
		
		
		System.out.println(str.length());
	}
	

}
