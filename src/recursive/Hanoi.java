package recursive;

/**
 * 汉诺塔问题
 * @author leleqin
 *
 */
public class Hanoi {

	public static void main(String[] args) {
		hanoi(3,'A','B','C');
	}
	
	/**
	 * @param n 有N个盘子
	 * @param from 开始的柱子
	 * @param in   中间的柱子
	 * @param to   目标柱子
	 */
	public static void hanoi(int n, char from, char in, char to) {
		if(n == 1) {
			System.out.println("第"+n+"个盘子从"+from+"移动到"+to);
		}else {
			//无论有多少个盘子都认为只有两个盘子，也就是最下面的盘子和上面所有的盘子
			//移动上面的所有盘子到中间位置
			hanoi(n-1,from,to,in);
			//移动下面的盘子
			System.out.println("第"+n+"个盘子从"+from+"移动到"+to);
			//把上面的所有盘子从中间位置移动到目标位置
			hanoi(n-1,in,from,to);
		}
	}

}
