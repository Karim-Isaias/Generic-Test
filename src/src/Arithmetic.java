package src;

import java.util.ArrayList;

public class Arithmetic<T extends Number>{
	
	T obj;
	
	Arithmetic(T obj) {
		this.obj = obj;
	}
	
	ArrayList<T> array = new ArrayList<T>();
	
	public T product(int index1, int index2){
		
		Integer prod;
		prod = array.get(index1).intValue() * array.get(index2).intValue();
		T cast = (T)prod;
		return cast;
		
	}
	
	public T maxValue() {
		
		Integer max;
		max = array.get(0).intValue();
		
		for (int i=0; i<array.size(); i++) {
			if(array.get(i).intValue()>max) {
				max=array.get(i).intValue();
			}
		}
		
		T cast = (T)max;
		return cast;
		
	}
	
	public T minValue() {
		
		Integer min;
		min = array.get(0).intValue();
		
		for (int i=0; i<array.size(); i++) {
			if(array.get(i).intValue()<min) {
				min=array.get(i).intValue();
			}
		}
		
		T cast = (T)min;
		return cast;
	}

	public T sum(int index1, int index2) {
		
		Integer sum;
		sum = (array.get(index1).intValue() + array.get(index2).intValue());
		T cast = (T)sum;
		return cast;
		
	}
	
	public T factorial(int index1) {
		
		Integer n = 1;
		for (int i=index1; i>=1; i--) {
			n*=i;
		}
		
		T cast = (T)n;
		return cast;
	}
	
	public void prime() {
		
		for (int i=0; i<array.size(); i++) {
			if (array.get(i).intValue() != 1 && array.get(i).intValue() != 0)
			{
				Integer num;
				num = array.get(i).intValue();
				int count = 0;
				
				for (int j=num; j>=1; j--) {
					if ((num%j)==0) {
						count++;
					}
				}
				
				if (count == 2) {
					System.out.print(num + " ");
				}
			}
		}
		
	}
}
