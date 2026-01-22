package mobigic;

public class Practise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList list=new LinkedList();
		
		list.add(234);
		list.add(123);
		
	list.display();
	}

}
class LinkedList
{
	int num;
	LinkedList node;
	LinkedList head;
	
	static int counter=0;
	public LinkedList()
	{
		 counter++;
		 System.out.println(counter);
	}
	
	public void add(int num2)
	{
		LinkedList list=new LinkedList();
		list.num=num2;
		this.num=list.num;
		this.node=list;
	}
	
	public void display()
	{
              System.out.println(this.num);
              System.out.println(this.node);
	}
	
	public String toString()
	{
		String s="NODE:"+counter;
		return s;
	}
}
