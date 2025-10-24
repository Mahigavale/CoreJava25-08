package logical;

public class Fourth {

	public static void main(String[] args) {


		//Null Pointer Exceptions.
		String str=null;
		//String str1="Demo";
		
		//String str2=new String("null");
		
		
		StringBuffer str2=new StringBuffer("adam");
		
		//null
		System.out.println(str2+str);
		//System.out.println(str2.concat(str));
		
		System.out.println(str2.append(str));
//		System.out.println("adam"+str);
//		System.out.println(str+"adam");
		//System.out.println(str.concat(str2));
		//Exception
		 try {
		//System.out.println(str1.concat(str));
		 }
		 catch(Exception ex)
		 {
			 System.out.println(ex.getMessage());
		 }
		//
		//System.out.println(str2.concat(str));
         //
		
		//System.out.println(sb.append(str));
		 
		// System.out.println(str+sb); //you can add the null value.
		 //cannot use methods on null object.
		 
		 
		 System.out.println("**************");
		
	}

}
