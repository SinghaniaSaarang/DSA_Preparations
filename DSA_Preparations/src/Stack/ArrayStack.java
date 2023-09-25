package Stack;

public class ArrayStack<t> {

	int top;
	final int stacksize;
	t stackelements[];
	
	public ArrayStack(int stacksize,t stackelements[]) {
		// TODO Auto-generated constructor stub
		this.stacksize=stacksize;
		top=-1;
		this.stackelements=stackelements;
	}//this is the only option to create generic array.
	
	public void push(t element) {
		if(!isFull())
			stackelements[++top]=element;
		else
			System.out.println("Stack overflow");
	}
	
	public void pop() {
		if(!isEmpty())
			System.out.println(stackelements[top--]);
		else
			System.out.println("Stack empty");
	}
	
	public void peek() {
		if(!isEmpty())
			System.out.println(stackelements[top]);
		else
			System.out.println("Stack empty");
	}
	
	public boolean isEmpty() {
		if(top==-1)
			return true;
		
		return false;
	}
	
	public boolean isFull() {
		if(top==stacksize-1)
			return true;
		
		return false;
	}
	
	
	
	

}
