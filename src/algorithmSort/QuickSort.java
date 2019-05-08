package algorithmSort;

import java.util.Arrays;

/**
 * 交换排序：
 * 快速排序
 * @author leleqin
 *
 */
public class QuickSort {

	public static void main(String[] args) {
		int[] arr = new int[] {7,5,4,6,8,3,0};
		quickSort(arr,0,arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void quickSort(int[] arr,int start,int end) {
		if(start < end) {
			//把数组中的第0个数字作为标准数
			int key = arr[start];
			//记录需要排序的下标
			int low = start;
			int high = end;
			//循环找比key数大的数和比标准数小的数
			while(low < high) {
				//右边的数比key大
				//只需要减小high的值
				while(low < high && key <= arr[high]) {
					high--;
				}
				//右边的数比key小
				//用右边的数替换左边的数
				arr[low] = arr[high];
				//如果左边的数比key小
				//下表向右移
				while(low < high && arr[low] <= key) {
					low++;
				}
				arr[high] = arr[low];
			}
			//把key赋值给low和high重合的数
			arr[low] = key;
			//处理所有比key小的数字
			quickSort(arr,start,low);
			//处理所有比key大的数字
			quickSort(arr, low+1, end);
		}
	}
}
