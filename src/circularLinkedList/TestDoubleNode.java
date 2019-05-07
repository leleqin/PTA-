package circularLinkedList;

/**
 * 循环双链表测试类
 * @author leleqin
 *
 */
public class TestDoubleNode {

	public static void main(String[] args) {
		DoubleNode node1 = new DoubleNode(1);
		DoubleNode node2 = new DoubleNode(2);
		DoubleNode node3 = new DoubleNode(3);
		//追加一个节点
		node1.after(node2);
		node2.after(node3);
		//查看上一个
		System.out.println(node2.pre().getData());
		//查看自己
		System.out.println(node2.getData());
		//查看下一个
		System.out.println(node2.next().getData());
		System.out.println(node3.next().getData());
		System.out.println(node1.pre().getData());
	}

}
