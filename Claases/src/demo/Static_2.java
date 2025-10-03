package demo;

public class Static_2 {

	public static void main(String[] args) {
	
		
		College sndt=new College();
		
		College dscl=new College();
		
		sndt.id=100;
		sndt.name="ABC";
		sndt.pincode="111111";
		
		dscl.id=200;
		dscl.name="XYZ";
		dscl.pincode="222222";
		
		System.out.println(sndt.pincode);
		System.out.println(dscl.pincode);
		System.out.println(College.pincode);
	}

}

class College
{
	
	int id;
	String name;
	static  String pincode="33333"; //111111 //222222
}