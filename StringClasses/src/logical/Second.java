package logical;

public class Second {

	public static void main(String[] args) {

		Demo.change("Pune IS grEaT");
		//PUnE iS greAT
	}

}

class Demo {
	public static void change(String str3) {
		/**
		 *  Innovaccer =>  3+ years , into SDET.
		 */
		String str = str3;
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < str.length(); i++) {
			String str2 = null;
			if (str.charAt(i) == 'E' || str.charAt(i) == 'O' || str.charAt(i) == 'U' || str.charAt(i) == 'A'
					|| str.charAt(i) == 'I') {
				StringBuffer sb3 = new StringBuffer();

				str2 = sb3.append(str.charAt(i)).toString().toLowerCase();
				sb.append(str2);
			}
			else if (str.charAt(i) == 'e' || str.charAt(i) == 'o' || str.charAt(i) == 'u' || str.charAt(i) == 'a'
					|| str.charAt(i) == 'i') {
				StringBuffer sb3 = new StringBuffer();

				str2 = sb3.append(str.charAt(i)).toString().toUpperCase();
				sb.append(str2);
			} 
			
			else {
				sb.append(str.charAt(i));
			}
		}
		System.out.println(sb.toString());
	}
}
