package stack;

import javax.management.RuntimeErrorException;

/**
 * 栈
 * @author leleqin
 *
 */
public class MyStack {
	//栈的底层用数组存储数据
	int[] elements;
	
	public MyStack() {
		elements = new int[0];
	}
	
	//压入数据
	public void push(int element) {
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
	
	//取出栈顶元素
	public int pop() {
		//判断栈中是否有元素
		if(elements.length == 0) {
			throw new RuntimeException("栈是空的");
		}
		//取出数组的最后一个元素
		int element = elements[elements.length - 1];
		//创建一个新的数组
		int[] newArr = new int[elements.length - 1];
		//将除了最后一个元素的其他元素放在新数组中
		for (int i = 0; i < newArr.length; i++) {
			newArr[i] = elements[i];
		}
		//替换数组
		elements = newArr;
		//返回栈顶元素
		return element;
	}
	

	//查看栈顶元素
	public int seek() {
		//判断栈中是否有元素
		if(elements.length == 0) {
			throw new RuntimeException("栈是空的");
		}
		return elements[elements.length - 1];
	}
	
	//判断栈是否为空
	public boolean isEmpty() {
		return elements.length == 0;
	}
}
