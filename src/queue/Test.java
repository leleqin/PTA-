package queue;

public class Test {

	public static void main(String[] args) {
		MyQueue queue = new MyQueue();
		//入队
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		queue.add(5);
		//出队
		System.out.println(queue.poll());
		queue.add(7);
		System.out.println(queue.poll());		
		//判断队列是否为空
		System.out.println(queue.isEmpty());
		//查看下一个出队的元素
		System.out.println(queue.seek());
	}

}
