package Queue;

public class LinkedListQueue<t> {
	
	Node<t> head;
	int size;

	public LinkedListQueue() {
		// TODO Auto-generated constructor stub
		this.head=null;
		this.size=0;
	}
	
	public void add(t element) {
		Node<t> newElement=new Node(element); 
		
		if(head==null) {
			head=newElement;
		}else {
			newElement.next=head;
			head=newElement;
		}
		size++;
	}
	
	public void remove() {
		if(head==null)
			System.out.println("Empty List");
		else if(head.next==null) {
			System.out.println(head.data);
			head=null;
		}
		else {
			Node<t> temporary=head;
			while(temporary.next.next!=null) {
				temporary=temporary.next;
			}
			System.out.println(temporary.next.data);
			temporary.next=null;
		}
		size--;
	}
	
	public boolean isEmpty() {
		if(head==null)
			return true;
		
		return false;
	}

}
