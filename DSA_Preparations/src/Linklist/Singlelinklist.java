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
	
	

	

}
