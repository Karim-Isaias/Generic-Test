package src;

import java.util.ArrayList;

public class Main {

	public static void main(String[] arg) {
		
		ArrayList<Integer> array = new ArrayList<>();
		array.add(65);
		array.add(87);
		array.add(13);
		array.add(26);
		array.add(30);
		array.add(5);
		array.add(3);
		
		System.out.println(array.get(0));
		
		Arithmetic<Integer> obj = new Arithmetic<>(3);
		obj.array = array;
		System.out.println(obj.product(3, 4));
		System.out.println(obj.sum(3, 2));
		System.out.println(obj.maxValue());
		System.out.println(obj.minValue());
		System.out.println(obj.factorial(5));
		obj.prime();
	}
}
