package maccess;

import java.util.LinkedList;
import java.util.Queue;

public class LearnLinkedListQueue {

	public static void main(String[] args) {
	   
		Queue<Integer> queue = new LinkedList<>();
		
		queue.offer(12);
		queue.offer(24);
		queue.offer(34);
		queue.offer(44);
		System.out.println(queue);
		
		queue.poll();
		System.out.println(queue);
		
		System.out.println(queue.peek());

	}

}
