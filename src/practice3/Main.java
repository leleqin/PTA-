package practice3;

import java.util.Scanner;
/*
 * ˼·:
 * 1.��������[-231, 231]�ڵ�3������A��B��C�����ж�A+B�Ƿ����C��
 * 2.���ֱ����A+B�������
 * 3.ת��ΪC-B<A
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
