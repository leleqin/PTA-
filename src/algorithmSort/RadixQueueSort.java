package algorithmSort;

import java.util.Arrays;

import queue.MyQueue;

/**
 * 基数排序--队列实现
 * 按照个位，十位，百位……等去分组
 * 排的次数取决于最大的数的位数
 * @author leleqin
 *
 */
public class RadixQueueSort {

	public static void main(String[] args) {
		int[] arr = new int[] {123,56,2,3,4,453,32,23};
		radixSort(arr); 
		System.out.println(Arrays.toString(arr));
	}

	private static void radixSort(int[] arr) {
		//存数组中最大的数字
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		//求最大数字的位数
		int maxLength = (max+"").length();
		//临时存储数据的队列
		MyQueue[] temp = new MyQueue[10];
		//为队列数组赋值
		for (int i = 0; i < temp.length; i++) {
			temp[i] = new MyQueue();
		}
		//根据最大长度的数决定比较的次数
		//n是个位，十位，百位的计算方式
		for (int i = 0, n = 1; i < maxLength; i++,n*=10) {
			//把每一个数字分别计算余数
			for (int j = 0; j < arr.length; j++) {
				//计算余数
				int remainder = arr[j]/n%10;
				//把当前遍历的数据放入指定的队列中
				temp[remainder].add(arr[j]);
			} 
			//记录取的元素需要放的位置
			int index = 0;
			//把所有队列中的数字取出来
			for (int k = 0; k < temp.length; k++) {
				//遍历当前的队列不为空
				//循环取出元素
				while(!temp[k].isEmpty()) {
					//取出数据
					arr[index] = temp[k].poll();
					//记录下一个位置
					index++;
				}
			}
		}
	}

}
