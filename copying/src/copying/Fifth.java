package copying;

public class Fifth {

	public static void main(String[] args) throws CloneNotSupportedException {

		College cl=new College();
		cl.collegename="SGGS";
		
		Friend friend=new Friend();
		friend.name="JUlie";
		friend.city="TunTunPur";
		
		friend.coll=cl;
		Person p=new Person();
		
		p.email="hero@Hollywood";
		p.name="Tom Cruise";
		p.fr=friend;
		
		
//		System.out.println(p.email);
//		System.out.println(p.name);
//		System.out.println(p.fr.name);
		
	Person p2=(Person)p.clone();
	
	 System.out.println("****************");
//	 System.out.println(p2.email==p.email);
//	 System.out.println(p2.name==p.name);
//	 System.out.println(p2.fr==p.fr);
//	 System.out.println(p==p2);
//	 
	// System.out.println(p.fr.name);
	 System.out.println(p.fr.coll.collegename);
	 p2.fr.name="Johny";
	 p2.fr.coll.collegename="COEP";
	 System.out.println(p2.fr.coll.collegename);
	 System.out.println(p.fr.coll.collegename);
		
	}
}
class Person implements Cloneable
{
	String name;
	String email;
	Friend fr;

	public Object clone() throws CloneNotSupportedException
	{
		System.out.println("Cloning person");
		Person p=(Person) super.clone();
		p.fr=  (Friend) this.fr.clone();
		
		return p;
	}
}


class Friend implements Cloneable
{
	String name;
	String city;
	
	College coll;
	
	public Object clone() throws CloneNotSupportedException
	{
		System.out.println("Cloning Friend...");
	      Friend f= (Friend)super.clone();
	      f.coll=(College) this.coll.clone();
	      return f;
	}
}


class College  implements Cloneable
{
	String collegename;
	
	public Object clone() throws CloneNotSupportedException
	{
		System.out.println("Cloning the College....");
		return super.clone();
	}
}