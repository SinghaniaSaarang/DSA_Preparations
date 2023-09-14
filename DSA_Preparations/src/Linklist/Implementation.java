package Linklist;

public class Implementation {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Singlelinklist<Integer> a=new Singlelinklist<Integer>();
		
		a.addFirst(4);
		a.addFirst(3);
		a.addFirst(2);
		a.addFirst(1);
		
		a.transversal();
		
		a.addLast(3);
		a.addLast(2);
		
		System.out.println(a.count());
		a.add(1, 7);
		a.palindromic();
		a.transversal();
		
		a.remove(8);
		a.removeFirst();
		a.removeLast();
		a.transversal();
		a.remove(1);
		a.transversal();
		a.remove(3);
		a.remove(8);
		a.transversal();
		
		a.reverseList();
		a.transversal();
		
		a.searchElement(3);
		System.out.println(a.searchElement(1).data);

	}

}
