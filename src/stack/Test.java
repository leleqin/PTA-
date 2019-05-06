package stack;

public class Test {

	public static void main(String[] args) {
		MyStack stack = new MyStack();
		//压入数据
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		//输出栈顶元素
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		//查看栈顶元素
		System.out.println(stack.seek());
		//查看栈是否为空
		System.out.println(stack.isEmpty());
	}

}
