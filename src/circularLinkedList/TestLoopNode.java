package circularLinkedList;

/**
 * 循环链表测试类
 * @author leleqin
 *
 */
public class TestLoopNode {

	public static void main(String[] args) {
		LoopNode node1 = new LoopNode(1);
		LoopNode node2 = new LoopNode(2);
		LoopNode node3 = new LoopNode(3);
		LoopNode node4 = new LoopNode(4);
		//增加节点
		node1.after(node2);
		node2.after(node3);
		node3.after(node4);
		System.out.println(node1.next().getData());
		System.out.println(node2.next().getData());
		System.out.println(node3.next().getData());
		System.out.println(node4.next().getData());
	}

}
