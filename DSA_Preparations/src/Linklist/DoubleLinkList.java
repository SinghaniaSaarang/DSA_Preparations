package Linklist;
import java.util.Scanner;
public class DoubleLinkList<t> {

	Scanner input=new Scanner(System.in);
	
	Dnode<t> head;
	
	public DoubleLinkList() {
		// TODO Auto-generated constructor stub
		this.head=null;
	}
	
	public void addFirst(t element) {
		
		Dnode<t> firstnode=new Dnode<t>(element);
		
		if(head==null)
			head=firstnode;
		else {
		firstnode.rightlink=head;
		head.leftlink=firstnode;
		head=firstnode;
		}
		
	}
	
	public void addLast(t element) {
		
		Dnode<t> lastnode=new Dnode<t>(element);
		
		if(head==null)
			head=lastnode;
		else {
			Dnode<t> temporary=head;
			
			while(temporary.rightlink!=null) {
				temporary=temporary.rightlink;
			}
			temporary.rightlink=lastnode;
			lastnode.leftlink=temporary;
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
			Dnode<t> indexnode=new Dnode<t>(element);
			
			Dnode<t> temporary=head;
			while(currentindex!=index-1) {
				currentindex++;
				temporary=temporary.rightlink;
			}
			
			indexnode.rightlink=temporary.rightlink;
			temporary.rightlink.leftlink=indexnode;
			temporary.rightlink=indexnode;
			indexnode.leftlink=temporary;
			
		}
	}
	
	public int count() {
		int totalnodes=0;
		
		Dnode<t> temporary=head;
		
		while(temporary!=null) {
			totalnodes++;
			temporary=temporary.rightlink;
		}
		return totalnodes;
	}
	
	public void transversal() {
		
		if(head!=null) {
			Dnode<t> temporary=head;
			
			while(temporary!=null) {
				System.out.print(temporary.data+" ");
				temporary=temporary.rightlink;
			}
			
			System.out.println();
		}else
			System.out.println("Emptylist");
	}
	
	public void removeFirst() {
		if(head!=null) {
			head=head.rightlink;
			head.leftlink=null;
		}
		else
			System.out.println("Emptylist");
	}
	
	public void removeLast() {
		if(head==null)
			System.out.println("Emptylist");
		else if(head.rightlink==null) {
			head=null;
			System.out.println("Now list is empty");
		}else {
			Dnode<t> temporary=head;
			
			while(temporary.rightlink.rightlink!=null) {
				temporary=temporary.rightlink;
			}
			temporary.rightlink=null;
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
				
				Dnode<t> temporary=head;
				while(currentindex!=index-1) {
					currentindex++;
					temporary=temporary.rightlink;
				}
				temporary.rightlink=temporary.rightlink.rightlink;
				temporary.rightlink.leftlink=temporary;
			}
		}
	}
	
	
//	public void reverseList() {As here both sides links are there thefore it can be printed from either of sides
//		
//		if(head==null)
//			System.out.println("Emptylist");
//		else if(head.next==null)
//			return;
//		else {
//			Node prevNode=head;
//			Node currNode=head.next;
//			while(currNode.next!=null) {
//				Node nextNode=currNode.next;
//				currNode.next=prevNode;
//				prevNode=currNode;
//				currNode=nextNode;
//			}
//			currNode.next=prevNode;
//			head.next=null;
//			head=currNode;
//		}
//	}
//	
//	
//	public Node<t> searchElement(int index) {
//	    if (head == null || index < 1 || index > count()) {
//	        return null; 
//	    }
//
//	    int currentindex = 1;
//	    Node<t> temporary = head;
//	    while (currentindex != index) {
//	        currentindex++;
//	        temporary = temporary.next;
//	    }
//
//	    return temporary;
//	}


	

}
