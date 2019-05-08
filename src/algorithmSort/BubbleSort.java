package algorithmSort;

import java.util.Arrays;

/**
 * 交换排序：
 * 冒泡排序
 * @author leleqin
 *
 */
public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = new int[] {5,3,7,2,6,9,0};
		System.out.println(Arrays.toString(arr));
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
		
	}
	
	/**
	 * 第一轮：
	 * 5,3,7,2,6,9,0   需要比较length - 1轮
	 * 3,5,7,2,6,9,0
	 * 3,5,7,2,6,9,0
	 * 3,5,2,7,6,9,0
	 * 3,5,2,6,7,9,0
	 * ……
	 * 3,5,2,6,7,0,9
	 * 第二轮：
	 * 
	 * @param arr
	 */
	public static void bubbleSort(int[] arr) {
		//控制共比较多少轮
		//最后一次不需要比较所以是length - 1
		for(int i = 0; i < arr.length - 1; i++) {
			//控制比较的次数
			//第二轮不需要比较最后的一位所以-i
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if(arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
}
