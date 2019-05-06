package array;

/**
 * 二分查找
 * 有序数组
 * @author leleqin
 *
 */
public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = new int[] {1,2,3,4,5,6,7,8,9};
		int target = 9;
		int index = -1;
		int begin = 0;
		int end = arr.length - 1;
		int mid = (begin + end)/2;
		while(true) {
			if(arr[mid] == target) {
				index = mid;
				break;
			}else {
				if(arr[mid] > target) {
					end = mid - 1;
				}else {
					begin = mid + 1;
				}
				mid = (begin + end)/2;
			}
		}
		System.out.println("index:" + index);
	}

}
