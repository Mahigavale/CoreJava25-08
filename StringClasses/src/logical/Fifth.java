package logical;

public class Fifth {

	public static void main(String[] args) {
		
		/**
		 * cannot invoke the method on null String .(isEmpty(), Length())
		 * you can absolutely + the null values.
		 * you can append the null values in the case of stringBuffer and StringBuilder.
		 * NullPointerException:=>
		 * 
		 */
		String str=null;
		String str2="null";
		StringBuffer sb=new StringBuffer("null");
		System.out.println(str+str2);
		System.out.println(str2+str);
		
		System.out.println(str2.concat(str));
		System.out.println(str.concat(str2));
		System.out.println(sb.append(str));
	}

}
