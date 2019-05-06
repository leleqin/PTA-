package array;

/**
 * 线性查找
 * @author leleqin
 *
 */
public class LinearSearch {

	public static void main(String[] args) {
		int[] arr = new int[] {2,6,23,8,3,4,8,4};
		int target = 6;
		int index = -1;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == target) {
				index = i;
				break;
			}
		}
		System.out.println("index: "+ index);
	}

}
