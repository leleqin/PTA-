package algorithmSort;

import java.util.Arrays;

/**
 * 基数排序
 * 按照个位，十位，百位……等去分组
 * 排的次数取决于最大的数的位数
 * @author leleqin
 *
 */
public class RadixSort {

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
		//临时存储数据的数组
		int[][] temp = new int[10][arr.length];
		//用于记录在temp中相应的数组中存放的数字数量
		int[] counts = new int[10];
		//根据最大长度的数决定比较的次数
		//n是个位，十位，百位的计算方式
		for (int i = 0, n = 1; i < maxLength; i++,n*=10) {
			//把每一个数字分别计算余数
			for (int j = 0; j < arr.length; j++) {
				//计算余数
				int remainder = arr[j]/n%10;
				//把当前遍历的数据放入指定的数组中
				temp[remainder][counts[remainder]] = arr[j];
				//记录数量
				counts[remainder]++;
			} 
			//记录取的元素需要放的位置
			int index = 0;
			//把数字取出来
			for (int k = 0; k < counts.length; k++) {
				//记录数字不为0取数字
				if(counts[k] != 0) {
					//循环取出元素
					for (int l = 0; l < counts[k]; l++) {
						//取出元素
						arr[index] = temp[k][l];
						index++;
					}
					//把数量置为0
					counts[k] = 0;
				}
			}
		}
	}

}
