package algorithmSort;

import java.util.Arrays;

/**
 * 插入排序：
 * 希尔排序
 * @author leleqin
 *
 */
public class ShellSort {

	public static void main(String[] args) {
		int[] arr = new int[] {5,2,4,7,9,1,0,8};
		shellSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void shellSort(int[] arr) {
		int c = 1;
		//遍历所有的步长
		for (int i = arr.length / 2; i > 0; i /= 2) {
			//遍历所有的元素
			for (int j = i; j < arr.length; j++) {
				//遍历本组中所有的元素
				for(int k = j - i;k >= 0;k -= i) {
					if(arr[k] > arr[k + i]) {
						int temp = arr[k];
						arr[k] = arr[k + i];
						arr[k + i] = temp;
					}
				}
			}
			System.out.println("第" + c + "次排列结果" + Arrays.toString(arr));
			c++;
		}
	}

}
