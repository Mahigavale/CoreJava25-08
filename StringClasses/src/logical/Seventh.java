package logical;

public class Seventh {

	 
	// 115 < cc => 99,100,101 => 5 => null
	// zsedca // z,s,e,d,c,a => compare the ascii codes.
	//zs1011009998 => String => 
	public static String change(String str)
	{
		
		/**
		 * Guard clause.
		 */
		
		if(str==null)
		{
			return null;
		}
		if(str.isBlank() || str.isEmpty() )
		{
			return null;
		}
		if(str.length()<5)
		{
			return null;
		}
		
		/**
		 * 
		 * A,B,C,D
		 * A=> placed /: 4-5
		 * b=> 1,2 =>15
		 * c=>1
		 * d=> 
		 */
		
		/**
		 * Test cases=10/11
		 * 5,"         ","A=>a", 
		 * String
		 * 
		 * 2-3 =>
		 */
		String str2=str.toLowerCase().trim();
		
		StringBuffer sb=new StringBuffer();
		
		char[] chars=str2.toCharArray();
		
		for(int i=0;i<chars.length;i++)
		{
			/**
			 * Casting => Single character to integer code.
			 *  integer code <115 => hook 
			 */
			int j=(int)chars[i];
			
			if(j>48 && j<57)
			{
				//to avoid the numbers from 0-9.
				// ascii => 48,57.
				sb.append(chars[i]);
			}
			
			if( j>89&&j<115) {
				sb.append(j+" ");
			}
			else
			{
				sb.append(chars[i]);
			}
			
		}
		return sb.toString();
		/**
		 * 2nd test case.
		 */
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		
//		String str="               abc          ";
//	
//		System.out.println(str.length());
//		System.out.println(str);
//		
//		String str2=str.trim();
//		
//		System.out.println(str2.length());
//        System.out.println(str2);		
		
		
		
//		int i=(int )'c';
//		System.out.println(i);
		
		
		System.out.println(change("abcdefghijklmnopqrstuvwxyz345678"));
	}

}
