package Stack;

public class LinkedListStack<t> {

	Node<t> head;
	int size;
	
	public LinkedListStack() {
		
		this.head=null;
		this.size=0;
	}
	
	public void push(t element) {
		
		Node<t> newnode=new Node<t>(element);
		
		if(head==null)
			head=newnode;
		else {
			newnode.next=head;
			head=newnode;
		}
		
	}
	
	public void pop() {
		
		if(head==null)
			System.out.println("Empty Stack!");
		else {
			System.out.println(head.data);
			head=head.next;
		}
		
	}
	
	public void peek() {
		if(head==null)
			System.out.println("Empty Stack!");
		else 
			System.out.println(head.data);
		
	}
	
	public boolean isEmpty() {
		
		if(head==null)
			return true;
		
		return false;
	}
}
