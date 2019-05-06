package array;

import java.util.Arrays;

/**
 * 数组删除
 * @author leleqin
 *
 */
public class Array {

	public static void main(String[] args) {
		int[] arr = {4,6,8,3,4};
		int[] newArr = new int[arr.length-1];
		int del = 2;
		for(int i = 0; i < newArr.length; i++) {
			if(i < del) {
				newArr[i] = arr[i]; 
			}else {
				newArr[i] = arr[i+1];
			}
		}
		arr = newArr;
		System.out.println(Arrays.toString(arr));
	}

}
