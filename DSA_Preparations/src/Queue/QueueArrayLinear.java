package Queue;

public class QueueArrayLinear<t> {

	int size,front,rear;
	t queueelements[];
	
	public QueueArrayLinear(t queueelements[]) {
		this.size=queueelements.length;
		this.queueelements=queueelements;
		this.rear=-1;
		this.front=-1;
	}
	
	public void add(t element) {
		if(!isFull()) {
			queueelements[++rear]=element;
		}else {
			System.out.println("No space");
		}
	}
	
	public void remove() {
		if(!isEmpty()) {
			System.out.println(queueelements[++front]);
		}else {
			System.out.println("Empty linearly");
		}
	}
	
	public boolean isEmpty() {
		
		if(rear==front)
			return true;
		else
			return false;
	}
	
	public boolean isFull() {
		
		if(rear==size-1)
			return true;
		
		return false;
	}
	
	
}
