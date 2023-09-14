package Linklist;
import java.util.Scanner;
public class Singlelinklist<t> {

	Scanner input=new Scanner(System.in);
	
	Node<t> head;
	
	public Singlelinklist() {
		// TODO Auto-generated constructor stub
		this.head=null;
	}
	
	public void addFirst(t element) {
		
		Node<t> firstnode=new Node<t>(element);
		
		if(head==null)
			head=firstnode;
		else {
		firstnode.next=head;
		head=firstnode;
		}
		
	}
	
	public void addLast(t element) {
		
		Node<t> lastnode=new Node<t>(element);
		
		if(head==null)
			head=lastnode;
		else {
			Node<t> temporary=head;
			
			while(temporary.next!=null) {
				temporary=temporary.next;
			}
			temporary.next=lastnode;
		}
		
	}
	
	public void add(t element, int index) throws Exception {
		
		try {
			
			if(head==null && index!=1) {
				throw new Exception("Emptylist, press 1 to add at first");
			}else if(index>count()+1){
				throw new Exception("index not found!");
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
		
		while(temporary!=null) {
			totalnodes++;
			temporary=temporary.next;
		}
		return totalnodes;
	}
	
	public void transversal() {
		
		if(head!=null) {
			Node<t> temporary=head;
			
			while(temporary!=null) {
				System.out.print(temporary.data+" ");
				temporary=temporary.next;
			}
			
			System.out.println();
		}else
			System.out.println("Emptylist");
	}
	
	public void removeFirst() {
		if(head!=null)
			head=head.next;
		else
			System.out.println("Emptylist");
	}
	
	public void removeLast() {
		if(head==null)
			System.out.println("Emptylist");
		else if(head.next==null) {
			head=null;
			System.out.println("Now list is empty");
		}else {
			Node<t> temporary=head;
			
			while(temporary.next.next!=null) {
				temporary=temporary.next;
			}
			temporary.next=null;
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
		else if(head.next==null)
			return;
		else {
			Node prevNode=head;
			Node currNode=head.next;
			while(currNode.next!=null) {
				Node nextNode=currNode.next;
				currNode.next=prevNode;
				prevNode=currNode;
				currNode=nextNode;
			}
			currNode.next=prevNode;
			head.next=null;
			head=currNode;
		}
	}
	
//	public Node<t> searchElement(int index) throws Exception {
//		
//		if(head==null)
//			return head;
//		
//		try {
//			if (index>count() || index<1)
//				throw new Exception("Index not found");
//		}catch(Exception e) {
//			System.out.println(e);
//			System.out.print("Re-enter index");
//			index=input.nextInt();
//			
//			if(index>count()||index<1) {
//				throw new Exception("Index not found");
//			}
//		}
//		
//		int currentindex=0;
//		Node<t> temporary=head;
//		while(currentindex!=index-1) {
//			temporary=temporary.next;
//		}
//		
//		return temporary;
//	}
	
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

	
//	public void palindromic() throws Exception {
//		int count=count();
//		for(int i=0;i<count/2;i++){
//			if(searchElement(i+1).data!=searchElement(count-i).data) {
//				System.out.println("Not a palindromic list");
//				return;
//			}	
//		}
//		System.out.println("palindromic list");
//		
//	}
	
	public void palindromic() throws Exception {
		
		int middlecount=count()%2==0?count()+1:count()+2;
		Node<t> start=head;
		Node<t> middle=searchElement(middlecount);
		
		while(middle!=null) {
			if(start.data!=middle.data) {
				System.out.println("Not a palindromic list");
				return;
			}
			start=start.next;
			middle=middle.next;
		}
		System.out.println("palindromic list");
		
	}

	

}
