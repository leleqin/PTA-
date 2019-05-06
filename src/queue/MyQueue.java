package queue;

/**
 * 队列
 * FIFO（先进先出）
 * @author leleqin
 *
 */
public class MyQueue {
	
	int[] elements;
	
	public MyQueue() {
		elements = new int[0];
	}
	
	//入队
	public void add(int element) {
		//创建一个新数组
		int[] newArr = new int[elements.length + 1];
		//把原来数组中的元素复制到新数组中
		for (int i = 0; i < elements.length; i++) {
			newArr[i] = elements[i];
		}
		//把添加的元素放入新数组中
		newArr[newArr.length - 1] = element;
		//使用新数组替换旧数组
		elements = newArr;
	}
	
	//出队
	public int poll() {
		//取出数组中的第0个元素
		int element = elements[0];
		//创建新的数组
		int[] newArr = new int[elements.length - 1];
		//复制原数组中的元素到新数组中
		for (int i = 0; i < newArr.length; i++) {
			newArr[i] = elements[i+1];
		}
		//替换数组
		elements = newArr;
		//返回第0个元素
		return element;
	}
	
	//查看下一个出队的元素
	public int seek() {
		if(elements.length == 0) {
			throw new RuntimeException("队列为空");
		}
		return elements[0];
	}
	
	//判断队列是否为空
	public boolean isEmpty() {
		return elements.length == 0;
	}
	
}
