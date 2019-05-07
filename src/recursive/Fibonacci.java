package recursive;

/**
 * 递归：
 * 在一个方法（函数）的内部调用该方法（函数）本身的编程方式
 * 斐波那契数列打印：
 * 1 1 2 3 5 8 13……
 * @author leleqin
 *
 */
public class Fibonacci {
	public static void main(String[] args) {
		int i = fibonacci(7);
		System.out.println(i);
	}
	
	//打印第n项Fibonacci数列
	public static int fibonacci(int i) {
		if(i == 1 || i == 2) {
			return 1;
		}else {
			return fibonacci(i - 1) + fibonacci(i - 2);
		}
	}
	
}
