package algorithmSort;

import java.util.Arrays;

/**
 * 选择排序
 * 简单选择排序
 * @author leleqin
 *
 */
public class SelectSort {

	public static void main(String[] args) {
		int[] arr = new int[] {3,6,2,1,7,9,3,5,7,0};
		selectSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	//选择排序
	public static void selectSort(int[] arr) {
		//遍历所有的数
		for (int i = 0; i < arr.length; i++) {
			int minIndex = i;
			//把当前遍历的数和后面所有的数进行比较，并记录下最小的数的下标
			for (int j = i + 1;j < arr.length;j++) {
				//如果后面的数比记录的数更小
				if(arr[minIndex] > arr[j]) {
					//记录更小的下标
					minIndex = j;
				}
			}
			//如果最小的数和第一次遍历的数的下标不一致
			//下标为minIndex的数比当前数更小
			//换
			if(i != minIndex) {
				int temp = arr[i];
				arr[i] = arr[minIndex];
				arr[minIndex] = temp;
			}
		}
	}

}
