package practice3;

import java.util.Scanner;
/*
 * 思路:
 * 1.给定区间[-231, 231]内的3个整数A、B和C，请判断A+B是否大于C。
 * 2.如果直接算A+B可能溢出
 * 3.转换为C-B<A
 */
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T =  scan.nextInt();
		long[]a = new long[T];
		long[]b = new long[T];
		long[]c = new long[T];
		for(int i=0 ;i<T ;i++){
			a[i] = scan.nextLong();
			b[i] = scan.nextLong();
			c[i] = scan.nextLong();
		}
		for(int i=0 ;i<T ;i++){
			if(c[i]-b[i]<a[i]){
				System.out.printf("Case #%d: true\n", i+1);
			}
			else{
				System.out.printf("Case #%d: false\n", i+1);
			}
		}

	}

}
