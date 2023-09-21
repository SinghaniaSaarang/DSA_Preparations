package Linklist;
import java.util.Scanner;
public class CircularLinkList<t> {

	Scanner input=new Scanner(System.in);
	
	Node<t> head,tail;
	
	public CircularLinkList() {
		this.head=null;
		this.tail=null;
	}
	
	public void addFirst(t element) {
		
		Node<t> firstnode=new Node<t>(element);
		
		if(head==null) {
			head=tail=firstnode;
			tail.next=head;
		}
		else {
		firstnode.next=head;
		head=firstnode;
		tail.next=head;
		}
		
	}
	
	public void addLast(t element) {
		
		Node<t> lastnode=new Node<t>(element);
		
		if(head==null) {
			head=tail=lastnode;
			tail.next=head;
		}
		else {
			tail.next=lastnode;
			tail=lastnode;
			tail.next=head;
		}
		
	}
	
	public void add(t element, int index) throws Exception {
		
		try {
			
			if(head==null && index!=1) {
				throw new Exception("Emptylist, press 1 to add at first");
			}else if(index>count()+1){
				throw new Exception("index not found!Greater than size");
			}else if(index<1) {
				throw new Exception("index not found! negative or zero");
			}
			
		}catch(Exception e) {
			System.out.println(e);
			System.out.print("Re-enter index: ");
			index=input.nextInt();
			
			if((head==null && index!=1)||(head!=null && index>count()+1))
				throw new Exception("index not found!");
		}
		
		if(index==count()+1)
			addLast(element);
		else if(index==1)
			addFirst(element);
		else {
			int currentindex=1;
			Node<t> indexnode=new Node<t>(element);
			
			Node<t> temporary=head;
			while(currentindex!=index-1) {
				currentindex++;
				temporary=temporary.next;
			}
			
			indexnode.next=temporary.next;
			temporary.next=indexnode;
			
		}
	}
	
	public int count() {
		int totalnodes=0;
		
		Node<t> temporary=head;
		
		if(head!=null) {
			do {
				totalnodes++;
				temporary=temporary.next;
			}while(temporary!=head);
		}
		return totalnodes;
	}
	
	public void transversal() {
		
		if(head!=null) {
			Node<t> temporary=head;
			
			do{
				System.out.print(temporary.data+" ");
				temporary=temporary.next;
			}while(temporary!=head); 
			
			System.out.println();
		}else
			System.out.println("Emptylist");
	}
	
	public void removeFirst() {
		if(head!=null) {
			head=head.next;
			tail.next=head;
		}
		else
			System.out.println("Emptylist");
	}
	
	public void removeLast() {
		if(head==null)
			System.out.println("Emptylist");
		else if(head.next==null) {
			head=tail=null;
			System.out.println("Now list is empty");
		}else {
			Node<t> temporary=head;
			
			while(temporary.next!=tail) {
				temporary=temporary.next;
			}
			tail=temporary;
			tail.next=head;
			
		}
	}
	
	public void remove(int index) throws Exception {
		
		if(head==null)
			System.out.println("Empty list");
		else {
			try {
				
	            if(index>count()|| index<1)
					throw new Exception("index not found!");
				
			}catch(Exception e) {
				System.out.println(e);
				System.out.print("Re-enter index: ");
				index=input.nextInt();
				
				if(index>count() || index<1)
					throw new Exception("index not found!");
			}
			
			if(index==count())
				removeLast();
			else if(index==1)
				removeFirst();
			else {
				int currentindex=1;
				
				Node<t> temporary=head;
				while(currentindex!=index-1) {
					currentindex++;
					temporary=temporary.next;
				}
				temporary.next=temporary.next.next;
			}
		}
	}
	
	
	public void reverseList() {
		
		if(head==null)
			System.out.println("Emptylist");
		else if(head.next==head)
			return;
		else {
			Node<t> prevNode=head;
			Node<t> currNode=head.next;
			while(currNode.next!=head) {
				Node<t> nextNode=currNode.next;
				currNode.next=prevNode;
				prevNode=currNode;
				currNode=nextNode;
			}
			currNode.next=prevNode;
			head.next=tail;
			tail=head;
			head=currNode;
		}
	}
	
	
	public Node<t> searchElement(int index) {
	    if (head == null || index < 1 || index > count()) {
	        return null; 
	    }

	    int currentindex = 1;
	    Node<t> temporary = head;
	    while (currentindex != index) {
	        currentindex++;
	        temporary = temporary.next;
	    }

	    return temporary;
	}

	

	

}
