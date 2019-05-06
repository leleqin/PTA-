package array;

import java.util.Arrays;

/**
 * 面向对象的数组
 * 对数组进行操作
 * @author leleqin
 *
 */
public class MyArray {
	//用于存储数据的数组
	private int[] elements;
	
	//构造方法
	public MyArray() {
		elements = new int[0];
	}

	//获取数组长度的方法
	public int size() {
		return elements.length;
	}
	
	//向数组末尾添加一个元素
	public void add(int element) {
		int[] newArry = new int[elements.length+1];
		for (int i = 0; i < elements.length; i++) {
			newArry[i] = elements[i];
		}
		newArry[elements.length] = element;
		elements = newArry;
	}
	
	//打印所有元素到控制台
	public void show() {
		System.out.println(Arrays.toString(elements));
	}
	
	//删除数组中的元素
	public void delete(int index){
		if(index < 0 || index > elements.length) {
			throw new RuntimeException("下标越界");
		}
		int[] newArry = new int[elements.length-1];
		for (int i = 0; i < newArry.length; i++) {
			if(i < index) {
				newArry[i] = elements[i]; 
			}else {
				newArry[i] = elements[i+1];
			}
		}
		elements = newArry;
	}
	
	//获取某个元素
	public int get(int index) {
		if(index < 0 || index > elements.length) {
			throw new RuntimeException("下标越界");
		}
		return elements[index];
	}
	
	//插入一个元素到指定位置
	public void indert(int index,int element) {
		if(index < 0 || index > elements.length) {
			throw new RuntimeException("下标越界");
		}
		int[] newArry = new int[elements.length+1];
		for(int i = 0;i < elements.length;i++) {
			if(i < index) {
				newArry[i] = elements[i];
			}else {
				newArry[i+1] = elements[i];
			}
		}
		newArry[index] = element;
		elements = newArry;
	}
	
	//替换指定位置的元素
	public void set(int index,int element) {
		if(index < 0 || index > elements.length) {
			throw new RuntimeException("下标越界");
		}
		elements[index] = element;
	}
	
	//线性查找
	public int search(int target) {
		for (int i = 0; i < elements.length; i++) {
			if(elements[i] == target) {
				return i;
			}
		}
		return -1;
	}
	
	//二分法查找
	public int binarySearch(int target) {
		int begin = 0;
		int end = elements.length - 1;
		int mid = (begin + end)/2;
		while(true) {
			if(begin >= end) {
				return -1;
			}
			if(elements[mid] == target) {
				return mid;
			}else {
				if(elements[mid] > target) {
					end = mid - 1;
				}else {
					begin = mid + 1;
				}
				mid = (begin + end)/2;
			}
		}
	}
}
