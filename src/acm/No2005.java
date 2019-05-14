package acm;

import java.util.Scanner;

/**
 * 第几天？
 * @author leleqin
 *
 */
public class No2005 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()) {
			String date = scan.next();
			String[] arr = date.split("/");
			int[] time = new int[arr.length];
			int[] LeapYear = new int[] {0,31,29,31,30,31,30,31,31,30,31,30,31};
			int[] OrdinaryYear = new int[] {0,31,28,31,30,31,30,31,31,30,31,30,31};
			int result = 0;
			for (int i = 0; i < arr.length; i++) {
				time[i] = Integer.parseInt(arr[i]);
			}
			if(time[0] % 4 == 0 && time[0] % 100 != 0 || time[0] % 400 == 0) {
				for (int i = 1; i < time[1]; i++) {
					result += LeapYear[i];
				}
				result += time[2];
				System.out.println(result);
			}else {
				for (int i = 1; i < time[1]; i++) {
					result += OrdinaryYear[i];
				}
				result += time[2];
				System.out.println(result);
			}
			
		}
	}

}
