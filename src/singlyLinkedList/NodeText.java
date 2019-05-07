package singlyLinkedList;

/**
 * 单链表测试类
 * @author leleqin
 *
 */
public class NodeText {

	public static void main(String[] args) {
		//创建节点
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);
		//追加节点
		node1.append(node2).append(node3).append(new Node(6));
		//取出下一个节点的数据
		System.out.println(node1.next().next().next().getData());
		//判断是否为最后一个节点
		System.out.println(node1.isLast());
		System.out.println(node1.next().next().next().isLast());
		//显示所有节点信息
		node1.show();
		//删除一个节点
//		node1.next().removeNext();
//		node1.show();
		//插入一个人新节点
		Node node = new Node(5);
		node1.next().next().after(node);
		node1.show();
		
	}

}
