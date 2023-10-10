package Queue;

public class Implementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] queueelements=new Integer[5];
		
//		QueueArrayCircular<Integer> que=new QueueArrayCircular<Integer>(queueelements);
		LinkedListQueue<Integer> que=new LinkedListQueue<Integer>();
		
		System.out.println(que.isEmpty());
//		System.out.println(que.isFull());
		que.add(1);
		que.add(2);
		que.add(3);
		que.add(4);
		que.add(5);
//		System.out.println(que.isFull());
		que.add(6);
		que.remove();
		que.remove();
		que.remove();
		que.remove();
		que.remove();
		que.remove();
		que.add(7);
		System.out.println(que.isEmpty());
		que.add(1);
		que.add(2);
		que.add(3);
		que.add(4);
		que.remove();
		System.out.println(que.isEmpty());
		que.add(5);
		que.remove();

	}

}
