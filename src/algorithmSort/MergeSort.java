package algorithmSort;

import java.util.Arrays;

/**
 * 归并排序
 * 分而治之(divide - conquer);每个递归过程涉及三个步骤
 * 第一, 分解: 把待排序的 n 个元素的序列分解成两个子序列, 每个子序列包括 n/2 个元素.
 * 第二, 治理: 对每个子序列分别调用归并排序MergeSort, 进行递归操作
 * 第三, 合并: 合并两个排好序的子序列,生成排序结果.
 * 
 * 算法分析：
 * （1）稳定性    　
 * 	归并排序是一种稳定的排序。
 * （2）存储结构要求
 * 	可用顺序存储结构。也易于在链表上实现。
 * （3）时间复杂度
 * 	对长度为n的文件，需进行趟二路归并，每趟归并的时间为O(n)，故其时间复杂度无论是在最好情况下还是在最坏情况下均是O(nlgn)。
 * （4）空间复杂度
 * 	需要一个辅助向量来暂存两有序子文件归并的结果，故其辅助空间复杂度为O(n)，显然它不是就地排序。
 *  注意：
 *  若用单链表做存储结构，很容易给出就地的归并排序
 * @author leleqin
 *
 */
public class MergeSort {

	public static void main(String[] args) {
		int[] arr = new int[] {3,6,1,8,3,5,2,1,0};
		mergeSort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}

	private static void mergeSort(int[] arr,int low,int high) {
		int mid = (high + low)/2;
		if(low < high) {
			//处理左边
			mergeSort(arr, low, mid);
			//处理右边
			mergeSort(arr, mid+1, high);		
			//归并
			merge(arr, low, mid, high);
		}

	}
	
	private static void merge(int[] arr,int low,int mid,int high) {
		//存储归并后的临时数组
		int[] temp = new int[high - low + 1];
		//记录第一个数组中需要遍历的下标
		int i = low;
		//记录第二个数组中需要遍历的下标
		int j = mid + 1;
		//记录再临时数组中存放的下标
		int index = 0;
		//遍历两个数组，取出小的数字放入临时数组中
		while(i <= mid && j <= high) {
			//第一个数组的数更小，把小的数据放在临时数组中
			if(arr[i] <= arr[j]) {
				temp[index] = arr[i];
				//下标向后移
				i++;
			}else {
				temp[index] = arr[j];
				j++;
			}
			index++;
		}
		//处理多余的数据
		while(j <= high) {
			temp[index] = arr[j];
			j++;
			index++;
		}
		while(i <= mid) {
			temp[index] = arr[i];
			i++;
			index++;
		}
		//把临时数组中的数据重新存入原数组
		for (int k = 0; k < temp.length; k++) {
			arr[k+low] = temp[k];
		}
	}
}
