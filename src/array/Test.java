package array;

public class Test {

	public static void main(String[] args) {
		MyArray myArry = new MyArray();
		myArry.add(99);
		myArry.add(98);
		myArry.add(97);
		myArry.add(96);
		myArry.add(95);
		System.out.println(myArry.size());
		myArry.show();
		myArry.delete(1);
		myArry.show();
		System.out.println(myArry.get(0));
		myArry.indert(1, 1);
		myArry.show();
		myArry.set(1, 100);
		myArry.show();
		
		System.out.println(myArry.search(0));
		System.out.println(myArry.search(99));
		System.out.println(myArry.binarySearch(0));
		System.out.println(myArry.binarySearch(99));
		
		
	}

}
