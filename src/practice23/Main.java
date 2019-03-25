package practice23;

import java.util.Scanner;
/**
 * 字符串分割
 * 单行输入
 * 字符串转整形
 * 异常处理
 * @author leleqin
 *
 */
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String n = scan.nextLine();
		String[] arr = n.split(" ");
		int a,b,c;
			try {
				a = Integer.parseInt(arr[0]);
				if(a > 0) {
				System.out.print(arr[0]+" + ");
				}else {
					System.out.print("? + ");
				}
			} catch (Exception e) {
				System.out.print("? + ");
			}
			try {
				b = Integer.parseInt(arr[1]);
				if(b > 0) {
				System.out.print(arr[1] + " = ");
				}else {
					System.out.print("? = ");
				}
			} catch (Exception e) {
				System.out.print("? = ");
			}
			try {
				c = Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]);
				if(Integer.parseInt(arr[0]) >= 0 && Integer.parseInt(arr[1]) >= 0)
				System.out.print(c);
			} catch (Exception e) {
				System.out.print("?");
			}
	}

}
