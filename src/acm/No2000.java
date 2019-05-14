package acm;

import java.util.Arrays;
import java.util.Scanner;

/**
 * ASCII码排序
 * @author leleqin
 *
 */
public class No2000 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()) {
			String str = scan.next();
			String result1 = "";
			char[] arr = new char[str.length()];
			for (int i = 0; i < str.length(); i++) {
				arr[i] = str.charAt(i);
			}
			Arrays.sort(arr);
			for (int i = 0; i < arr.length; i++) {
				String result = arr[i]+" ";
				result1 += result;
			}
			System.out.println(result1.trim());
		}
	}
	

}
