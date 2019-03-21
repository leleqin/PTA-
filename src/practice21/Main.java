package practice21;

import java.util.Scanner;

/**
 * 百分号格式
 * 字符串转数组
 * @author leleqin
 *
 */
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String n = scan.next();
		String[] arr = n.split("");
		int count = 0;
		double result;
		if(arr[0].equals("-")) {		
			if(arr[arr.length-1].equals("0") || arr[arr.length-1].equals("2") || arr[arr.length-1].equals("4") || arr[arr.length-1].equals("6") || arr[arr.length-1].equals("8"))
			{
				for (int i = 0; i < arr.length; i++) {
					if(arr[i].equals("2")) {
						count++;
					}
				}
				result = (float)count / (arr.length - 1) * 1.5 * 2 * 100;
				System.out.printf("%.2f%%",result);
			}else {
				for (int i = 0; i < arr.length; i++) {
					if(arr[i].equals("2")) {
						count++;
					}
				}
				result = (float)count / (arr.length - 1) * 1.5 * 100;
				System.out.printf("%.2f%%",result);
			}
		}else {
			if(arr[arr.length-1].equals("0") || arr[arr.length-1].equals("2") || arr[arr.length-1].equals("4") || arr[arr.length-1].equals("6") || arr[arr.length-1].equals("8"))
			{
				for (int i = 0; i < arr.length; i++) {
					if(arr[i].equals("2")) {
						count++;
					}
				}
				result = (float)count / arr.length * 2 * 100;
				System.out.printf("%.2f%%",result);
			}else {
				for (int i = 0; i < arr.length; i++) {
					if(arr[i].equals("2")) {
						count++;
					}
				}
				result = (float)count / arr.length * 100;
				System.out.printf("%.2f%%",result);
			}
		}
	}
}
