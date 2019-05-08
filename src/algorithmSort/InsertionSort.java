package algorithmSort;

import java.util.Arrays;

/**
 * 插入排序
 * 直接插入排序
 * @author leleqin
 *
 */
public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = new int[] {3,5,2,8,0,1,7,4};
		insertionSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	//插入排序
	public static void insertionSort(int[] arr) {
		//遍历所有的数字
		for (int i = 1; i < arr.length; i++) {
			//如果当前数字比之前数字小，
			if(arr[i] < arr[i - 1]) {
				//把当前遍历数字存起来
				int temp = arr[i];
				int j;
				//遍历当前数字前面的数字
				for (j = i - 1; j >= 0 && temp < arr[j]; j--) {
					//把前一个数字赋给后一个数字
					arr[j + 1] = arr[j];
				}
				//把当前遍历的数字赋给不满足条件的后一个值
				arr[j + 1] = temp;
			}
			
		}
	}
}
