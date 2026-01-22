package custom;

public class Consumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList list=new LinkedList();
		
		list.Add(23);
		list.Add(32);
		list.Add(123);
		list.Display();

	}

}

class LinkedList
{
	private Node head;
	
	public LinkedList()
	{
		
	}
	
	public void Add(int data)
	{
		if(head==null)
		{
			Node n=new Node(data);
			head=n;
		}
		else
		{
			Node node=new Node(data);
			 Node temp=head;
			 head.data=node.data;
			 head.next=node.next;
			
		}
	}
	public void Display()
	{
		while(head.next !=null)
		{
			Node node=head;
			System.out.println(node.data);
			head.next=node.next.next;
		}
	}
}
