package Queue;

public class QueueArrayCircular<t> {
	
	int size,front,rear;
	t queueelements[];
	
	
	public QueueArrayCircular(t queueelements[]) {
		this.size=queueelements.length;
		this.queueelements=queueelements;
		this.rear=-1;
		this.front=-1;
	}
	
	
	public boolean isEmpty() {
		if(front==-1)
			return true;
		
		return false;
	}
	
	public boolean isFull() {
		
		if((rear+1)%size==front)
			return true;
		
		return false;
	}
	
	public void add(t element) {
		
		if(rear==-1) {
			rear=front=0;
			queueelements[rear]=element;
		}else {
			if(!isFull())
				queueelements[++rear%size]=element;
			else
				System.out.println("OverFlow-No Space");
		}
	}

	public void remove() {
		
		if(isEmpty())
			System.out.println("No-Elements");
		else {
			System.out.println(queueelements[front]);
			if(front==rear)
				front=rear=-1;
			else
				front=(front+1)%size;
		}
			
	}
	
	
	
	
	

}
