package Stack;

public class Implemantation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Integer[] stackelements=new Integer[5];
//		ArrayStack<Integer> a=new ArrayStack<Integer>(5,stackelements);
		
		LinkedListStack<Integer> a=new LinkedListStack<Integer>();
		
		
		System.out.println(a.isEmpty());
//		System.out.println(a.isFull());
		a.push(2);
		a.push(3);
		a.pop();
		a.push(3);
		a.push(4);
		a.push(5);
		a.push(6);
		a.push(6);
		a.pop();
		a.pop();
		a.pop();
		a.pop();
		a.pop();
		a.pop();
		a.peek();
		a.push(6);
		a.peek();
		
	}

}
