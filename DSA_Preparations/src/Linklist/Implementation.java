package Linklist;

public class Implementation {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Singlelinklist<Integer> a=new Singlelinklist<Integer>();
		
		a.addFirst(5);
		a.addFirst(4);
		a.addFirst(3);
		a.addFirst(2);
		a.addFirst(1);
		
		a.transversal();
		
		a.addLast(5);
		a.addLast(4);
		
		System.out.println(a.count());
		a.add(6, 8);
		
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

	}

}
