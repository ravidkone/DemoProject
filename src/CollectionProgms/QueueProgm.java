package CollectionProgms;

import java.util.PriorityQueue;

public class QueueProgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PriorityQueue q=new PriorityQueue<>();
		q.add(10);
		q.add(5);
		q.add(16);
		q.add(2);
		System.out.println(q.size());
		System.out.println(q);
		System.out.println(q.poll());
		System.out.println(q);
		System.out.println(q.poll());
		System.out.println(q);
		System.out.println(q.poll());
		System.out.println(q);
		System.out.println(q.poll());
		System.out.println(q);
		System.out.println(q.poll());
		q.add(10);
		q.add(5);
		q.add(16);
		q.add(2);
		q.add(2);
		//q.add(null);
		q.add(80);
		System.out.println(q);
		System.out.println(q.peek());
		System.out.println(q);
		System.out.println(q.peek());
		System.out.println(q);
		System.out.println(q.peek());
		int s=q.size();
		System.out.println("Size: "+s);
		System.out.println(q);
		for (int i = 0; i <s; i++) {
			System.out.println(q.poll());
			
		}
	}

}
